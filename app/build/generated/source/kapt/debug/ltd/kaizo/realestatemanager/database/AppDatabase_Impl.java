package ltd.kaizo.realestatemanager.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile EstateDao _estateDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Estate` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mainPicture` TEXT NOT NULL, `type` TEXT NOT NULL, `price` INTEGER NOT NULL, `surface` INTEGER NOT NULL, `nbRoom` INTEGER NOT NULL, `nbBathroom` INTEGER NOT NULL, `nbBedroom` INTEGER NOT NULL, `description` TEXT NOT NULL, `address` TEXT NOT NULL, `postalCode` TEXT NOT NULL, `city` TEXT NOT NULL, `poi` TEXT NOT NULL, `isSold` INTEGER NOT NULL, `dateIn` INTEGER NOT NULL, `dateOut` INTEGER, `estateManager` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `EstatePhoto` (`photoId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `estateId` INTEGER NOT NULL, `uri` TEXT NOT NULL, `name` TEXT NOT NULL, `mainPicture` INTEGER NOT NULL, FOREIGN KEY(`estateId`) REFERENCES `Estate`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE  INDEX `index_EstatePhoto_estateId` ON `EstatePhoto` (`estateId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"bfafbc1143d38032211bdcab9732406a\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Estate`");
        _db.execSQL("DROP TABLE IF EXISTS `EstatePhoto`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEstate = new HashMap<String, TableInfo.Column>(19);
        _columnsEstate.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsEstate.put("mainPicture", new TableInfo.Column("mainPicture", "TEXT", true, 0));
        _columnsEstate.put("type", new TableInfo.Column("type", "TEXT", true, 0));
        _columnsEstate.put("price", new TableInfo.Column("price", "INTEGER", true, 0));
        _columnsEstate.put("surface", new TableInfo.Column("surface", "INTEGER", true, 0));
        _columnsEstate.put("nbRoom", new TableInfo.Column("nbRoom", "INTEGER", true, 0));
        _columnsEstate.put("nbBathroom", new TableInfo.Column("nbBathroom", "INTEGER", true, 0));
        _columnsEstate.put("nbBedroom", new TableInfo.Column("nbBedroom", "INTEGER", true, 0));
        _columnsEstate.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsEstate.put("address", new TableInfo.Column("address", "TEXT", true, 0));
        _columnsEstate.put("postalCode", new TableInfo.Column("postalCode", "TEXT", true, 0));
        _columnsEstate.put("city", new TableInfo.Column("city", "TEXT", true, 0));
        _columnsEstate.put("poi", new TableInfo.Column("poi", "TEXT", true, 0));
        _columnsEstate.put("isSold", new TableInfo.Column("isSold", "INTEGER", true, 0));
        _columnsEstate.put("dateIn", new TableInfo.Column("dateIn", "INTEGER", true, 0));
        _columnsEstate.put("dateOut", new TableInfo.Column("dateOut", "INTEGER", false, 0));
        _columnsEstate.put("estateManager", new TableInfo.Column("estateManager", "TEXT", true, 0));
        _columnsEstate.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0));
        _columnsEstate.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEstate = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEstate = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEstate = new TableInfo("Estate", _columnsEstate, _foreignKeysEstate, _indicesEstate);
        final TableInfo _existingEstate = TableInfo.read(_db, "Estate");
        if (! _infoEstate.equals(_existingEstate)) {
          throw new IllegalStateException("Migration didn't properly handle Estate(ltd.kaizo.realestatemanager.model.Estate).\n"
                  + " Expected:\n" + _infoEstate + "\n"
                  + " Found:\n" + _existingEstate);
        }
        final HashMap<String, TableInfo.Column> _columnsEstatePhoto = new HashMap<String, TableInfo.Column>(5);
        _columnsEstatePhoto.put("photoId", new TableInfo.Column("photoId", "INTEGER", true, 1));
        _columnsEstatePhoto.put("estateId", new TableInfo.Column("estateId", "INTEGER", true, 0));
        _columnsEstatePhoto.put("uri", new TableInfo.Column("uri", "TEXT", true, 0));
        _columnsEstatePhoto.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsEstatePhoto.put("mainPicture", new TableInfo.Column("mainPicture", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEstatePhoto = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysEstatePhoto.add(new TableInfo.ForeignKey("Estate", "CASCADE", "NO ACTION",Arrays.asList("estateId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesEstatePhoto = new HashSet<TableInfo.Index>(1);
        _indicesEstatePhoto.add(new TableInfo.Index("index_EstatePhoto_estateId", false, Arrays.asList("estateId")));
        final TableInfo _infoEstatePhoto = new TableInfo("EstatePhoto", _columnsEstatePhoto, _foreignKeysEstatePhoto, _indicesEstatePhoto);
        final TableInfo _existingEstatePhoto = TableInfo.read(_db, "EstatePhoto");
        if (! _infoEstatePhoto.equals(_existingEstatePhoto)) {
          throw new IllegalStateException("Migration didn't properly handle EstatePhoto(ltd.kaizo.realestatemanager.model.EstatePhoto).\n"
                  + " Expected:\n" + _infoEstatePhoto + "\n"
                  + " Found:\n" + _existingEstatePhoto);
        }
      }
    }, "bfafbc1143d38032211bdcab9732406a", "22c55bdcd3d045cef78b267c84f9136c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Estate","EstatePhoto");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Estate`");
      _db.execSQL("DELETE FROM `EstatePhoto`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public EstateDao estateDao() {
    if (_estateDao != null) {
      return _estateDao;
    } else {
      synchronized(this) {
        if(_estateDao == null) {
          _estateDao = new EstateDao_Impl(this);
        }
        return _estateDao;
      }
    }
  }
}
