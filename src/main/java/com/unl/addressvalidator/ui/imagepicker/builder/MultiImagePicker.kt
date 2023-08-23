package com.unl.addressvalidator.ui.imagepicker.builder

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.fragment.app.Fragment
import com.unl.addressvalidator.ui.imagepicker.Constants
import com.unl.addressvalidator.ui.imagepicker.StartImagePickerActivity
import com.unl.addressvalidator.ui.imagepicker.helper.FileUtils
import java.lang.Exception

class MultiImagePicker {
    companion object{
        const val REQUEST_PICK_MULTI_IMAGES = 369

        fun with(activity: Activity): Builder{
            return Builder(activity)
        }

        fun with(fragment: Fragment): Builder {
            return Builder(fragment)
        }
    }

    class Builder private constructor(){

        private var activity: Activity? = null
        private var fragment: Fragment? = null

        private var useActivity: Boolean = true

        private var showAlbums: Boolean = false

        private var maxSelectionLimit: Int = 1

        internal constructor(activity: Activity) : this() {
            this.activity = activity
            this.useActivity = true
        }

        internal constructor(fragment: Fragment) : this() {
            this.fragment = fragment
            this.useActivity = false
        }

        /**
         * If you will not provide or will provide more than 30, it will set max limit to 30
         */
        fun setSelectionLimit(maxLimit: Int): Builder{
            maxSelectionLimit = maxLimit
            return this
        }

        /**
         * This functionality is in progress so true/false will not work, and default is false
         */
        @VisibleForTesting
        fun showAlbum(show: Boolean = false): Builder{
            this.showAlbums = show
            return this
        }

        fun open(){


            val activity = if(useActivity) activity else fragment?.activity

            activity?.let {
                val intent = Intent(activity, StartImagePickerActivity::class.java)
                intent.putExtra(Constants.BUNDLE_MAX_SELECTION_LIMIT, maxSelectionLimit)
                intent.putExtra(Constants.BUNDLE_SHOW_ALBUMS, showAlbums)
                activity.startActivityForResult(intent, REQUEST_PICK_MULTI_IMAGES)
            } ?: kotlin.run {
                throw Exception("Activity/Fragment is not defined to start MultiImagePicker!")
            }
        }
    }

    class Result(private val data: Intent?){

        fun isSuccess(): Boolean {
            Log.d("Class Result-> Is success", "isSuccess: ================")
            return data != null && data.hasExtra(Constants.BUNDLE_IMAGE_PICKED_SUCCESS) && data.getBooleanExtra(Constants.BUNDLE_IMAGE_PICKED_SUCCESS,false)
        }

        fun getImageList(): ArrayList<Uri>{
            if(isSuccess()) {
                Log.d("getImageList-> is success", "getImageList: ")

                return data?.getParcelableArrayListExtra(Constants.BUNDLE_SELECTED_IMAGE_RESULT)
                    ?: arrayListOf()
            }
            return arrayListOf()
        }

        fun getImageListAsAbsolutePath(context: Context): ArrayList<String> {
            Log.d("From inside the method", "getImageListAsAbsolutePath:============ ")
            val imageUriList = getImageList()
            val imageAbsPathList = arrayListOf<String>()

            imageUriList.forEach {
                imageAbsPathList.add(FileUtils.getPath(context,it))
            }

            return imageAbsPathList
        }

    }
}