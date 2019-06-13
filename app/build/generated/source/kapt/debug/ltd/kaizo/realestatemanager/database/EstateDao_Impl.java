package ltd.kaizo.realestatemanager.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import ltd.kaizo.realestatemanager.model.Estate;
import ltd.kaizo.realestatemanager.model.EstatePhoto;
import ltd.kaizo.realestatemanager.utils.DateConverter;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EstateDao_Impl implements EstateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfEstate;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityInsertionAdapter __insertionAdapterOfEstatePhoto;

  private final SharedSQLiteStatement __preparedStmtOfSetMainPicture;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLatLng;

  public EstateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEstate = new EntityInsertionAdapter<Estate>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Estate`(`id`,`mainPicture`,`type`,`price`,`surface`,`nbRoom`,`nbBathroom`,`nbBedroom`,`description`,`address`,`postalCode`,`city`,`poi`,`isSold`,`dateIn`,`dateOut`,`estateManager`,`latitude`,`longitude`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Estate value) {
        stmt.bindLong(1, value.getId());
        if (value.getMainPicture() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMainPicture());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        stmt.bindLong(4, value.getPrice());
        stmt.bindLong(5, value.getSurface());
        stmt.bindLong(6, value.getNbRoom());
        stmt.bindLong(7, value.getNbBathroom());
        stmt.bindLong(8, value.getNbBedroom());
        if (value.getDescription() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDescription());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAddress());
        }
        if (value.getPostalCode() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getPostalCode());
        }
        if (value.getCity() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getCity());
        }
        if (value.getPoi() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPoi());
        }
        final int _tmp;
        _tmp = value.isSold() ? 1 : 0;
        stmt.bindLong(14, _tmp);
        final Long _tmp_1;
        _tmp_1 = __dateConverter.dateToTimestamp(value.getDateIn());
        if (_tmp_1 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = __dateConverter.dateToTimestamp(value.getDateOut());
        if (_tmp_2 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_2);
        }
        if (value.getEstateManager() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getEstateManager());
        }
        stmt.bindDouble(18, value.getLatitude());
        stmt.bindDouble(19, value.getLongitude());
      }
    };
    this.__insertionAdapterOfEstatePhoto = new EntityInsertionAdapter<EstatePhoto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `EstatePhoto`(`photoId`,`estateId`,`uri`,`name`,`mainPicture`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EstatePhoto value) {
        stmt.bindLong(1, value.getPhotoId());
        stmt.bindLong(2, value.getEstateId());
        if (value.getUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUri());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        final int _tmp;
        _tmp = value.getMainPicture() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
    this.__preparedStmtOfSetMainPicture = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE estate SET mainPicture=? WHERE id=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLatLng = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE estate SET latitude=?, longitude=? WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public long insertEstate(final Estate estate) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfEstate.insertAndReturnId(estate);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insertPhoto(final EstatePhoto estatePhoto) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfEstatePhoto.insertAndReturnId(estatePhoto);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setMainPicture(final long estateId, final String uri) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetMainPicture.acquire();
    int _argIndex = 1;
    if (uri == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, uri);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, estateId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetMainPicture.release(_stmt);
    }
  }

  @Override
  public void updateLatLng(final long estateId, final double latitude, final double longitude) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLatLng.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, latitude);
    _argIndex = 2;
    _stmt.bindDouble(_argIndex, longitude);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, estateId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLatLng.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Estate>> getAllEstate() {
    final String _sql = "SELECT * FROM estate";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"estate"}, false, new Callable<List<Estate>>() {
      @Override
      public List<Estate> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMainPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "mainPicture");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfSurface = CursorUtil.getColumnIndexOrThrow(_cursor, "surface");
          final int _cursorIndexOfNbRoom = CursorUtil.getColumnIndexOrThrow(_cursor, "nbRoom");
          final int _cursorIndexOfNbBathroom = CursorUtil.getColumnIndexOrThrow(_cursor, "nbBathroom");
          final int _cursorIndexOfNbBedroom = CursorUtil.getColumnIndexOrThrow(_cursor, "nbBedroom");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfPostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "postalCode");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfPoi = CursorUtil.getColumnIndexOrThrow(_cursor, "poi");
          final int _cursorIndexOfIsSold = CursorUtil.getColumnIndexOrThrow(_cursor, "isSold");
          final int _cursorIndexOfDateIn = CursorUtil.getColumnIndexOrThrow(_cursor, "dateIn");
          final int _cursorIndexOfDateOut = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOut");
          final int _cursorIndexOfEstateManager = CursorUtil.getColumnIndexOrThrow(_cursor, "estateManager");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final List<Estate> _result = new ArrayList<Estate>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Estate _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpMainPicture;
            _tmpMainPicture = _cursor.getString(_cursorIndexOfMainPicture);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final int _tmpSurface;
            _tmpSurface = _cursor.getInt(_cursorIndexOfSurface);
            final int _tmpNbRoom;
            _tmpNbRoom = _cursor.getInt(_cursorIndexOfNbRoom);
            final int _tmpNbBathroom;
            _tmpNbBathroom = _cursor.getInt(_cursorIndexOfNbBathroom);
            final int _tmpNbBedroom;
            _tmpNbBedroom = _cursor.getInt(_cursorIndexOfNbBedroom);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpPostalCode;
            _tmpPostalCode = _cursor.getString(_cursorIndexOfPostalCode);
            final String _tmpCity;
            _tmpCity = _cursor.getString(_cursorIndexOfCity);
            final String _tmpPoi;
            _tmpPoi = _cursor.getString(_cursorIndexOfPoi);
            final boolean _tmpIsSold;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSold);
            _tmpIsSold = _tmp != 0;
            final Date _tmpDateIn;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDateIn)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDateIn);
            }
            _tmpDateIn = __dateConverter.fromTimestamp(_tmp_1);
            final Date _tmpDateOut;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDateOut)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDateOut);
            }
            _tmpDateOut = __dateConverter.fromTimestamp(_tmp_2);
            final String _tmpEstateManager;
            _tmpEstateManager = _cursor.getString(_cursorIndexOfEstateManager);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            _item = new Estate(_tmpId,_tmpMainPicture,_tmpType,_tmpPrice,_tmpSurface,_tmpNbRoom,_tmpNbBathroom,_tmpNbBedroom,_tmpDescription,_tmpAddress,_tmpPostalCode,_tmpCity,_tmpPoi,_tmpIsSold,_tmpDateIn,_tmpDateOut,_tmpEstateManager,_tmpLatitude,_tmpLongitude);
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

  @Override
  public LiveData<Estate> getEstateById(final long id) {
    final String _sql = "SELECT * FROM estate WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"estate"}, false, new Callable<Estate>() {
      @Override
      public Estate call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMainPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "mainPicture");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfSurface = CursorUtil.getColumnIndexOrThrow(_cursor, "surface");
          final int _cursorIndexOfNbRoom = CursorUtil.getColumnIndexOrThrow(_cursor, "nbRoom");
          final int _cursorIndexOfNbBathroom = CursorUtil.getColumnIndexOrThrow(_cursor, "nbBathroom");
          final int _cursorIndexOfNbBedroom = CursorUtil.getColumnIndexOrThrow(_cursor, "nbBedroom");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfPostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "postalCode");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfPoi = CursorUtil.getColumnIndexOrThrow(_cursor, "poi");
          final int _cursorIndexOfIsSold = CursorUtil.getColumnIndexOrThrow(_cursor, "isSold");
          final int _cursorIndexOfDateIn = CursorUtil.getColumnIndexOrThrow(_cursor, "dateIn");
          final int _cursorIndexOfDateOut = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOut");
          final int _cursorIndexOfEstateManager = CursorUtil.getColumnIndexOrThrow(_cursor, "estateManager");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final Estate _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpMainPicture;
            _tmpMainPicture = _cursor.getString(_cursorIndexOfMainPicture);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final int _tmpSurface;
            _tmpSurface = _cursor.getInt(_cursorIndexOfSurface);
            final int _tmpNbRoom;
            _tmpNbRoom = _cursor.getInt(_cursorIndexOfNbRoom);
            final int _tmpNbBathroom;
            _tmpNbBathroom = _cursor.getInt(_cursorIndexOfNbBathroom);
            final int _tmpNbBedroom;
            _tmpNbBedroom = _cursor.getInt(_cursorIndexOfNbBedroom);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpPostalCode;
            _tmpPostalCode = _cursor.getString(_cursorIndexOfPostalCode);
            final String _tmpCity;
            _tmpCity = _cursor.getString(_cursorIndexOfCity);
            final String _tmpPoi;
            _tmpPoi = _cursor.getString(_cursorIndexOfPoi);
            final boolean _tmpIsSold;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSold);
            _tmpIsSold = _tmp != 0;
            final Date _tmpDateIn;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDateIn)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDateIn);
            }
            _tmpDateIn = __dateConverter.fromTimestamp(_tmp_1);
            final Date _tmpDateOut;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDateOut)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDateOut);
            }
            _tmpDateOut = __dateConverter.fromTimestamp(_tmp_2);
            final String _tmpEstateManager;
            _tmpEstateManager = _cursor.getString(_cursorIndexOfEstateManager);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            _result = new Estate(_tmpId,_tmpMainPicture,_tmpType,_tmpPrice,_tmpSurface,_tmpNbRoom,_tmpNbBathroom,_tmpNbBedroom,_tmpDescription,_tmpAddress,_tmpPostalCode,_tmpCity,_tmpPoi,_tmpIsSold,_tmpDateIn,_tmpDateOut,_tmpEstateManager,_tmpLatitude,_tmpLongitude);
          } else {
            _result = null;
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

  @Override
  public Cursor getEstateByIdWithCursor(final long id) {
    final String _sql = "SELECT * FROM estate WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public LiveData<List<EstatePhoto>> getPhotoListById(final long id) {
    final String _sql = "SELECT * FROM EstatePhoto WHERE estateId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"EstatePhoto"}, false, new Callable<List<EstatePhoto>>() {
      @Override
      public List<EstatePhoto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndexOrThrow(_cursor, "photoId");
          final int _cursorIndexOfEstateId = CursorUtil.getColumnIndexOrThrow(_cursor, "estateId");
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMainPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "mainPicture");
          final List<EstatePhoto> _result = new ArrayList<EstatePhoto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EstatePhoto _item;
            final long _tmpPhotoId;
            _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
            final long _tmpEstateId;
            _tmpEstateId = _cursor.getLong(_cursorIndexOfEstateId);
            final String _tmpUri;
            _tmpUri = _cursor.getString(_cursorIndexOfUri);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final boolean _tmpMainPicture;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfMainPicture);
            _tmpMainPicture = _tmp != 0;
            _item = new EstatePhoto(_tmpPhotoId,_tmpEstateId,_tmpUri,_tmpName,_tmpMainPicture);
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

  @Override
  public Cursor getPhotoListByIdWithCursor(final long id) {
    final String _sql = "SELECT * FROM EstatePhoto WHERE estateId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public LiveData<List<EstatePhoto>> getAllPhoto() {
    final String _sql = "SELECT * FROM EstatePhoto";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"EstatePhoto"}, false, new Callable<List<EstatePhoto>>() {
      @Override
      public List<EstatePhoto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndexOrThrow(_cursor, "photoId");
          final int _cursorIndexOfEstateId = CursorUtil.getColumnIndexOrThrow(_cursor, "estateId");
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfMainPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "mainPicture");
          final List<EstatePhoto> _result = new ArrayList<EstatePhoto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EstatePhoto _item;
            final long _tmpPhotoId;
            _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
            final long _tmpEstateId;
            _tmpEstateId = _cursor.getLong(_cursorIndexOfEstateId);
            final String _tmpUri;
            _tmpUri = _cursor.getString(_cursorIndexOfUri);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final boolean _tmpMainPicture;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfMainPicture);
            _tmpMainPicture = _tmp != 0;
            _item = new EstatePhoto(_tmpPhotoId,_tmpEstateId,_tmpUri,_tmpName,_tmpMainPicture);
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

  @Override
  public List<Estate> getSearchResult(final SimpleSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false);
    try {
      final List<Estate> _result = new ArrayList<Estate>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Estate _item;
        _item = __entityCursorConverter_ltdKaizoRealestatemanagerModelEstate(_cursor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  private Estate __entityCursorConverter_ltdKaizoRealestatemanagerModelEstate(Cursor cursor) {
    final Estate _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfMainPicture = cursor.getColumnIndex("mainPicture");
    final int _cursorIndexOfType = cursor.getColumnIndex("type");
    final int _cursorIndexOfPrice = cursor.getColumnIndex("price");
    final int _cursorIndexOfSurface = cursor.getColumnIndex("surface");
    final int _cursorIndexOfNbRoom = cursor.getColumnIndex("nbRoom");
    final int _cursorIndexOfNbBathroom = cursor.getColumnIndex("nbBathroom");
    final int _cursorIndexOfNbBedroom = cursor.getColumnIndex("nbBedroom");
    final int _cursorIndexOfDescription = cursor.getColumnIndex("description");
    final int _cursorIndexOfAddress = cursor.getColumnIndex("address");
    final int _cursorIndexOfPostalCode = cursor.getColumnIndex("postalCode");
    final int _cursorIndexOfCity = cursor.getColumnIndex("city");
    final int _cursorIndexOfPoi = cursor.getColumnIndex("poi");
    final int _cursorIndexOfIsSold = cursor.getColumnIndex("isSold");
    final int _cursorIndexOfDateIn = cursor.getColumnIndex("dateIn");
    final int _cursorIndexOfDateOut = cursor.getColumnIndex("dateOut");
    final int _cursorIndexOfEstateManager = cursor.getColumnIndex("estateManager");
    final int _cursorIndexOfLatitude = cursor.getColumnIndex("latitude");
    final int _cursorIndexOfLongitude = cursor.getColumnIndex("longitude");
    final long _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getLong(_cursorIndexOfId);
    }
    final String _tmpMainPicture;
    if (_cursorIndexOfMainPicture == -1) {
      _tmpMainPicture = null;
    } else {
      _tmpMainPicture = cursor.getString(_cursorIndexOfMainPicture);
    }
    final String _tmpType;
    if (_cursorIndexOfType == -1) {
      _tmpType = null;
    } else {
      _tmpType = cursor.getString(_cursorIndexOfType);
    }
    final int _tmpPrice;
    if (_cursorIndexOfPrice == -1) {
      _tmpPrice = 0;
    } else {
      _tmpPrice = cursor.getInt(_cursorIndexOfPrice);
    }
    final int _tmpSurface;
    if (_cursorIndexOfSurface == -1) {
      _tmpSurface = 0;
    } else {
      _tmpSurface = cursor.getInt(_cursorIndexOfSurface);
    }
    final int _tmpNbRoom;
    if (_cursorIndexOfNbRoom == -1) {
      _tmpNbRoom = 0;
    } else {
      _tmpNbRoom = cursor.getInt(_cursorIndexOfNbRoom);
    }
    final int _tmpNbBathroom;
    if (_cursorIndexOfNbBathroom == -1) {
      _tmpNbBathroom = 0;
    } else {
      _tmpNbBathroom = cursor.getInt(_cursorIndexOfNbBathroom);
    }
    final int _tmpNbBedroom;
    if (_cursorIndexOfNbBedroom == -1) {
      _tmpNbBedroom = 0;
    } else {
      _tmpNbBedroom = cursor.getInt(_cursorIndexOfNbBedroom);
    }
    final String _tmpDescription;
    if (_cursorIndexOfDescription == -1) {
      _tmpDescription = null;
    } else {
      _tmpDescription = cursor.getString(_cursorIndexOfDescription);
    }
    final String _tmpAddress;
    if (_cursorIndexOfAddress == -1) {
      _tmpAddress = null;
    } else {
      _tmpAddress = cursor.getString(_cursorIndexOfAddress);
    }
    final String _tmpPostalCode;
    if (_cursorIndexOfPostalCode == -1) {
      _tmpPostalCode = null;
    } else {
      _tmpPostalCode = cursor.getString(_cursorIndexOfPostalCode);
    }
    final String _tmpCity;
    if (_cursorIndexOfCity == -1) {
      _tmpCity = null;
    } else {
      _tmpCity = cursor.getString(_cursorIndexOfCity);
    }
    final String _tmpPoi;
    if (_cursorIndexOfPoi == -1) {
      _tmpPoi = null;
    } else {
      _tmpPoi = cursor.getString(_cursorIndexOfPoi);
    }
    final boolean _tmpIsSold;
    if (_cursorIndexOfIsSold == -1) {
      _tmpIsSold = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfIsSold);
      _tmpIsSold = _tmp != 0;
    }
    final Date _tmpDateIn;
    if (_cursorIndexOfDateIn == -1) {
      _tmpDateIn = null;
    } else {
      final Long _tmp_1;
      if (cursor.isNull(_cursorIndexOfDateIn)) {
        _tmp_1 = null;
      } else {
        _tmp_1 = cursor.getLong(_cursorIndexOfDateIn);
      }
      _tmpDateIn = __dateConverter.fromTimestamp(_tmp_1);
    }
    final Date _tmpDateOut;
    if (_cursorIndexOfDateOut == -1) {
      _tmpDateOut = null;
    } else {
      final Long _tmp_2;
      if (cursor.isNull(_cursorIndexOfDateOut)) {
        _tmp_2 = null;
      } else {
        _tmp_2 = cursor.getLong(_cursorIndexOfDateOut);
      }
      _tmpDateOut = __dateConverter.fromTimestamp(_tmp_2);
    }
    final String _tmpEstateManager;
    if (_cursorIndexOfEstateManager == -1) {
      _tmpEstateManager = null;
    } else {
      _tmpEstateManager = cursor.getString(_cursorIndexOfEstateManager);
    }
    final double _tmpLatitude;
    if (_cursorIndexOfLatitude == -1) {
      _tmpLatitude = 0;
    } else {
      _tmpLatitude = cursor.getDouble(_cursorIndexOfLatitude);
    }
    final double _tmpLongitude;
    if (_cursorIndexOfLongitude == -1) {
      _tmpLongitude = 0;
    } else {
      _tmpLongitude = cursor.getDouble(_cursorIndexOfLongitude);
    }
    _entity = new Estate(_tmpId,_tmpMainPicture,_tmpType,_tmpPrice,_tmpSurface,_tmpNbRoom,_tmpNbBathroom,_tmpNbBedroom,_tmpDescription,_tmpAddress,_tmpPostalCode,_tmpCity,_tmpPoi,_tmpIsSold,_tmpDateIn,_tmpDateOut,_tmpEstateManager,_tmpLatitude,_tmpLongitude);
    return _entity;
  }
}
