package com.unl.addressvalidator.ui.entrances


import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.roomdatabasewithmodelclassess.model.EntranceModel
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.unl.addressvalidator.R
import com.unl.addressvalidator.databinding.AddPicturesPopupBinding
import com.unl.addressvalidator.model.landmark.LandmarkDataList

import com.unl.addressvalidator.network.ApiCallBack
import com.unl.addressvalidator.ui.adapters.EntrancesAdapter
import com.unl.addressvalidator.ui.adapters.LandMarkResultAdapter
import com.unl.addressvalidator.ui.fragments.showEntrancePictureDialog
import com.unl.addressvalidator.ui.fragments.showLandmarkPictureDialog
import com.unl.addressvalidator.ui.homescreen.UnlValidatorActivity
import com.unl.addressvalidator.ui.homescreen.showAddPictureDialog
import com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter
import com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel
import com.unl.addressvalidator.ui.landmark.LandmarkActivity
import com.unl.addressvalidator.ui.landmark.updateAddPictureSavebtn
import com.unl.addressvalidator.util.Utility.getImagePathFromUri
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File


@SuppressLint("SuspiciousIndentation")
fun EntrancesActivity.showEntrancePictureDialog(
    position: Int,
    resulttList: ArrayList<EntranceModel>
) {


    val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
     bind  = AddPicturesPopupBinding.inflate(inflater)
    val bottomSheetDialog = BottomSheetDialog(this)
    bottomSheetDialog.setContentView(bind.root)
    bind!!.headerTitle.text = "Add Picture to the Landmark"
    bind!!.addressType.text = UnlValidatorActivity.createAddressModel!!.addressType
    adapter = AddPicturesAdapter(entranceImageList, this)
    bind!!.rvAddPictures.adapter = adapter
    bind!!.rvAddPictures.layoutManager = GridLayoutManager(this, 4)
/*

    bind!!.tvAddPhotos!!.setOnClickListener {
        replaceIndex = entranceImageList.indexOfFirst { it.ivPhotos == Uri.EMPTY }
       // selectImageForLandmakr = true
        openImagePicker()
    }
*/

    bind!!.tvSave.setOnClickListener {

        bottomSheetDialog.dismiss()
        var count = 0
        val imageList = ArrayList<String>()
        entranceImageList.forEach() {
            var str: String = it.ivPhotos.toString()

            if (str != null && !str.equals(""))
            {
                imageList.add(str)
                count++
            }
        }


        var str: String = entranceImageList.get(0).ivPhotos.toString()

        if (str != null && !str.equals("")) {
            resulttList.get(position).url = str
            resulttList.get(position).imgCount = "" + count
            resulttList.get(position).imageArray = imageList
            binding!!.addEntrances.rvEntrances.adapter = EntrancesAdapter(resulttList, this)
            binding!!.addEntrances.rvEntrances.adapter!!.notifyDataSetChanged()

        }



    }

    bind!!.removePicture.setOnClickListener {

        Log.v("CHECKBOX", "size : " + adapter!!.removedIndex.size)
        if (adapter!!.removedIndex!!.size > 0) {
            adapter!!.removedIndex!!.forEach {
                entranceImageList.remove(it)
            }
            for (i in entranceImageList.size until 9) {
                entranceImageList.add(AddPicturesModel(Uri.EMPTY))
            }
            bind!!.rvAddPictures.adapter!!.notifyDataSetChanged()
            adapter!!.removedIndex!!.clear()

            var count = 0
            entranceImageList.forEach() {
                var str: String = it.ivPhotos.toString()

                if (str != null && !str.equals(""))
                {
                    count++
                }
            }

            if(count <= 0)
            {
                updateAddPictureSavebtn(false)
            }

        }
    }

    bind!!.tvSkip.setOnClickListener {
        entranceImageList.clear()
        for (i in 0 until 9) {
            entranceImageList.add(AddPicturesModel(Uri.EMPTY))
        }
        bottomSheetDialog.dismiss()
    }
    bottomSheetDialog.show()
}



fun EntrancesActivity.updateAddPictureSavebtn(status : Boolean)
{
    if(status)
    {
        bind!!.tvSave!!.setBackgroundResource(R.drawable.theme_round_btn)
        bind!!.tvSave!!.isEnabled = true
    }else
    {
        bind!!.tvSave!!.setBackgroundResource(R.drawable.bg_button_disable)
        bind!!.tvSave!!.isEnabled = false
    }

}
