package ltd.kaizo.realestatemanager.utils

import android.Manifest.permission.*

/****************************
 *********     APP    ********
 *****************************/
const val DATABASE_NAME = "ESTATE_DB"
const val ESTATE_SOURCE = "ESTATE SOURCE"
const val ESTATE_ID = "ESTATE ID"
const val ESTATE_SOURCE_ADD = 40
const val ESTATE_SOURCE_EDIT = 30
const val TAG_DIALOG = "AddPictureDialogFragment"
const val COLLECTION_NAME = "users"

/****************************
 *********   PERMS   ********
 *****************************/
const val WRITE_EXT_PERM = WRITE_EXTERNAL_STORAGE
const val CAMERA_PERM = CAMERA
const val FINE_LOCATION = ACCESS_FINE_LOCATION

/****************************
 ****   RESPONSE CODE   ******
 *****************************/
const val RC_TAKE_PHOTO = 100
const val RC_CHOOSE_PHOTO = 200
const val RC_DATE_OUT = 300
const val RC_DATE_IN = 400
const val RC_PICTURE_ITEM_DETAIL = 500
const val RC_PICTURE_ITEM_EDIT = 600
const val RC_PICTURE_LISTENER_REMOVE = 700
const val RC_PICTURE_LISTENER_VIEW = 800
const val RC_PICTURE_LISTENER_FAVORITE = 900
const val RC_ERROR_DIALOG_REQUEST = 9001
const val RC_LOCATION_PERMISSION = 1234