package com.example.roverclone.utility

object Constants {

  const val IMAGE_DIRECTORY = "/taxiapp"

  //type of users
  const val CUSTOMER = "customer"
  const val DRIVER = "driver"

  //"IN" for testing
  const val SELECTED_COUNTRY = "IN"
  //Change SELECTED_COUNTRY to "US" for client build
//  const val SELECTED_COUNTRY = "US";

  //existing users
  const val NEW_USER_KEY = "existing_user"
  const val NEW_USER_YES = "yes"
  const val NEW_USER_NO = "no"

  //SendOtp api
  const val PHONE : String = "phone"
  const val USER_TYPE = "user_type"
  const val COUNTRY_CODE = "country_code"
  const val DEVICETYPE = "deviceType"
  const val DEVICETOKEN = "deviceToken"
  const val DEVICEID = "deviceId"
  const val OTP = "otp"
  const val USER_PASSWORD = "password"

  //Login api
  const val PASSWORD = "password"
  const val USER_IMAGE = "user_image"

  //SendOtp api
  const val CARD_ID = "card_id"

  //SharedPreferences
  const val EMAIL = "email"
  const val NAME = "name"
  const val TOKEN = "token"
  const val USERID = "userId"
  const val CARD_LIST = "cardList"
  const val USER_ID = "user_id"

  //Create Ride Api
  const val TAXI_ID = "taxi_type_id"
  const val PICKUP_ADDRESS = "pickup_address"
  const val DROP_ADDRESS = "drop_address"
  const val PICKUP_LAT = "pickup_lat"
  const val PICKUP_LNG = "pickup_lng"
  const val DROP_LAT = "drop_lat"
  const val DROP_LNG = "drop_lng"
  const val DISTANCE = "distance"
  const val RADIUS_DRIVER_SEARCH = "25"
  const val RIDE_TYPE = "ride_type"
  const val DRIVER_ID = "driver_id"
  const val ESTIMATED_COST = "estimated_cost"
  const val ACTUAL_COST = "actual_cost"
  const val PAY_BY = "pay_by"
  const val RIDE_STATUS = "ride_status"
  const val PARCEL_HEIGHT = "parcel_height"
  const val PARCEL_WIDTH = "parcel_width"
  const val PARCEL_WEIGHT = "parcel_weight"
  const val CANCEL = "cancel"
  const val CANCEL_REASON = "cancel_reason"
  const val RIDE_ID = "ride_id"
  const val CANCEL_TYPE = "cancel_type"

  //Nearby Drivers Api
  const val CURRENT_LAT = "current_lat"
  const val CURRENT_LNG = "current_lng"
  const val INKMRADIUS = "inKmRadius"
  const val TAXI_TYPE_ID = "taxi_type_id"

  //Favorite Driver
  const val STATUS = "status"
  const val BOOKING_TYPE = "ride_type"
  const val PAGE_NO = "page_number"
  const val BOOKING_LAST = "last"

  // Driver Registration
  const val DRIVER_IMAGE = "driver_image"
  const val DRIVER_VECHICLE_REGISTRATION = "vehicle_registration"
  const val DRIVER_NAME = "name"
  const val SOCIAL_SECURITY = "social_security"
  const val DRIVER_EMAIL = "email"
  const val DRIVER_PASSWORD = "password"
  const val DRIVER_LICENCE = "driving_licence"
  const val DRIVER_VEHICLE_NO = "vehicle_registration_number"
  const val MANUFACTURING_DETAIL = "manufacturing_details"
  const val TAG_NO_STATE = "tag_number_state"
  const val INSURANCE_COMPANY_ID = "insurance_company_withID"

  // Driver Address Details
  const val DRIVER_ADDRESS = "address"
  const val DRIVER_ADDRESS_ID = "driver_address_id"
  const val DRIVER_STATE = "state"
  const val DRIVER_CITY = "city"
  const val DRIVER_PIN_CODE = "pin_code"

  // upload image
  const val DRIVER_REG_UPLOADIMAGE = "image"
  const val DRIVER_REG_IMAGE_NAME = "image_name"

  //Card Details
  const val CARD_HOLDER_NAME = "card_holder_name"
  const val CARD_NUMBER = "card_number"
  const val CARD_CVV = "cvv"
  const val CARD_TYPE = "card_type"
  const val EXPIRY_DATE = "expiry_date"
  const val CARD_IMAGE = "card_image"

  //Add Credit
  const val CREDIT_NO = "credit_no"
  const val PAY_OPTION = "pay_option"

  //get paid
  const val BANK_NAME = "bank_name"
  const val ROUTING_NO = "routing_no"
  const val ACCOUNT_NO = "account_no"
  const val UPDATE_PROFILE = "update_profile"
  const val FULL_NAME = "full_name"
  const val PHONE_DRIVER = "mobile"
  const val IMAGE = "image"
  const val ACTIVE_STATUS = "active"
  const val NEW = "new"
  const val CONFIRMED = "confirmed" // will get notification

  const val NOTCONFIRMED = "notconfirmed" // will not notification

  const val REACHED = "reached" // will get notification

  const val ARRIVING = "arriving" // will not get notification

  const val BEGIN = "begin"
  const val END = "end"
  const val CANCELED = "cancelled"
  const val RATING = "rating"
  const val PARCEL_NAME = "parcel_name"
  const val WAITING_TIME = "waiting_time"
  const val READ_STATUS = "1"
  const val UNREAD_STATUS = "0"
  const val RATING_TO_ID = "rating_to_id"
  const val COMMENTS = "comments"
  const val TIPS = "tips"
  const val PAID = "paid"
  const val UNPAID = "unpaid"
  const val WALLET = "wallet"
  const val CREDIT_CARD = "creditcard"
  const val CASH = "cash"
  const val PUSH_ID = "push_id"
  const val TAXIUSES = "taxi_uses"
  const val IS_MODIFY = "isModify"

  //Recpatcha Keys
  const val SITE_KEY = "6LfleOsjAAAAAJ9Y20qJy4RgKvNLNkrf9mVEtjly"
  const val SECRET_KEY = "6LfleOsjAAAAAPPC-r8Uly1pPLgpjilR4PIJVZtT"

  //
  const val REQUEST_MULTIPLE_PERMISSIONS: Int = 99
}