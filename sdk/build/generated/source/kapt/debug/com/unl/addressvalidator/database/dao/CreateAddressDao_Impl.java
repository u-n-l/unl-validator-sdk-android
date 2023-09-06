package com.unl.addressvalidator.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.roomdatabasewithmodelclassess.model.AddressModel;
import com.example.roomdatabasewithmodelclassess.model.EntranceModel;
import com.example.roomdatabasewithmodelclassess.model.LandmarkModel;
import com.example.roomdatabasewithmodelclassess.model.LocationModel;
import com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel;
import com.unl.addressvalidator.database.TypeConverters;
import com.unl.addressvalidator.model.dbmodel.CreateAddressModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CreateAddressDao_Impl implements CreateAddressDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CreateAddressModel> __insertionAdapterOfCreateAddressModel;

  private final TypeConverters __typeConverters = new TypeConverters();

  public CreateAddressDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCreateAddressModel = new EntityInsertionAdapter<CreateAddressModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `create_address` (`addressModel`,`addressType`,`address`,`locationModel`,`landmarkModel`,`entranceModel`,`images`,`accessibility`,`openingHoursSpecificationModel`,`id`) VALUES (?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CreateAddressModel value) {
        final String _tmp = __typeConverters.fromAddressModel(value.getAddressModel());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getAddressType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAddressType());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        final String _tmp_1 = __typeConverters.fromLocationModel(value.getLocationModel());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2 = __typeConverters.fromLandmarkModel(value.getLandmarkModel());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        final String _tmp_3 = __typeConverters.fromEntranceModel(value.getEntranceModel());
        if (_tmp_3 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_3);
        }
        final String _tmp_4 = __typeConverters.fromImages(value.getImages());
        if (_tmp_4 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_4);
        }
        final String _tmp_5 = __typeConverters.fromImages(value.getAccessibility());
        if (_tmp_5 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_5);
        }
        final String _tmp_6 = __typeConverters.fromOpeningHoursSpecificationModel(value.getOpeningHoursSpecificationModel());
        if (_tmp_6 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_6);
        }
        stmt.bindLong(10, value.getId());
      }
    };
  }

  @Override
  public Object insertAddress(final CreateAddressModel createAddressModel,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCreateAddressModel.insert(createAddressModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<CreateAddressModel>> getAddressData() {
    final String _sql = "SELECT * FROM create_address";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"create_address"}, false, new Callable<List<CreateAddressModel>>() {
      @Override
      public List<CreateAddressModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAddressModel = CursorUtil.getColumnIndexOrThrow(_cursor, "addressModel");
          final int _cursorIndexOfAddressType = CursorUtil.getColumnIndexOrThrow(_cursor, "addressType");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLocationModel = CursorUtil.getColumnIndexOrThrow(_cursor, "locationModel");
          final int _cursorIndexOfLandmarkModel = CursorUtil.getColumnIndexOrThrow(_cursor, "landmarkModel");
          final int _cursorIndexOfEntranceModel = CursorUtil.getColumnIndexOrThrow(_cursor, "entranceModel");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final int _cursorIndexOfAccessibility = CursorUtil.getColumnIndexOrThrow(_cursor, "accessibility");
          final int _cursorIndexOfOpeningHoursSpecificationModel = CursorUtil.getColumnIndexOrThrow(_cursor, "openingHoursSpecificationModel");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CreateAddressModel> _result = new ArrayList<CreateAddressModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CreateAddressModel _item;
            final AddressModel _tmpAddressModel;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfAddressModel)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfAddressModel);
            }
            _tmpAddressModel = __typeConverters.toAddressModel(_tmp);
            final String _tmpAddressType;
            if (_cursor.isNull(_cursorIndexOfAddressType)) {
              _tmpAddressType = null;
            } else {
              _tmpAddressType = _cursor.getString(_cursorIndexOfAddressType);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final LocationModel _tmpLocationModel;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfLocationModel)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfLocationModel);
            }
            _tmpLocationModel = __typeConverters.toLocationModel(_tmp_1);
            final ArrayList<LandmarkModel> _tmpLandmarkModel;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfLandmarkModel)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfLandmarkModel);
            }
            _tmpLandmarkModel = __typeConverters.toLandmarkModel(_tmp_2);
            final ArrayList<EntranceModel> _tmpEntranceModel;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfEntranceModel)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfEntranceModel);
            }
            _tmpEntranceModel = __typeConverters.toEntranceModel(_tmp_3);
            final ArrayList<String> _tmpImages;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfImages)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfImages);
            }
            _tmpImages = __typeConverters.toImages(_tmp_4);
            final ArrayList<String> _tmpAccessibility;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfAccessibility)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfAccessibility);
            }
            _tmpAccessibility = __typeConverters.toImages(_tmp_5);
            final ArrayList<OpeningHoursSpecificationModel> _tmpOpeningHoursSpecificationModel;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfOpeningHoursSpecificationModel)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfOpeningHoursSpecificationModel);
            }
            _tmpOpeningHoursSpecificationModel = __typeConverters.toOpeningHoursSpecificationModel(_tmp_6);
            _item = new CreateAddressModel(_tmpAddressModel,_tmpAddressType,_tmpAddress,_tmpLocationModel,_tmpLandmarkModel,_tmpEntranceModel,_tmpImages,_tmpAccessibility,_tmpOpeningHoursSpecificationModel);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
