package com.example.roverclone.utility

class Constant {

  val IMAGE_DIRECTORY = "/taxiapp"

  //type of users
  val CUSTOMER = "customer"
  val DRIVER = "driver"

  //"IN" for testing
  val SELECTED_COUNTRY = "IN"
  //Change SELECTED_COUNTRY to "US" for client build
//  val SELECTED_COUNTRY = "US";

  //existing users
  val NEW_USER_KEY = "existing_user"
  val NEW_USER_YES = "yes"
  val NEW_USER_NO = "no"

  //SendOtp api
  val PHONE = "phone"
  val USER_TYPE = "user_type"
  val COUNTRY_CODE = "country_code"
  val DEVICETYPE = "deviceType"
  val DEVICETOKEN = "deviceToken"
  val DEVICEID = "deviceId"
  val OTP = "otp"
  val USER_PASSWORD = "password"

  //Login api
  val PASSWORD = "password"
  val USER_IMAGE = "user_image"

  //SendOtp api
  val CARD_ID = "card_id"

  //SharedPreferences
  val EMAIL = "email"
  val NAME = "name"
  val TOKEN = "token"
  val USERID = "userId"
  val CARD_LIST = "cardList"
  val USER_ID = "user_id"

  //Create Ride Api
  val TAXI_ID = "taxi_type_id"
  val PICKUP_ADDRESS = "pickup_address"
  val DROP_ADDRESS = "drop_address"
  val PICKUP_LAT = "pickup_lat"
  val PICKUP_LNG = "pickup_lng"
  val DROP_LAT = "drop_lat"
  val DROP_LNG = "drop_lng"
  val DISTANCE = "distance"
  val RADIUS_DRIVER_SEARCH = "25"
  val RIDE_TYPE = "ride_type"
  val DRIVER_ID = "driver_id"
  val ESTIMATED_COST = "estimated_cost"
  val ACTUAL_COST = "actual_cost"
  val PAY_BY = "pay_by"
  val RIDE_STATUS = "ride_status"
  val PARCEL_HEIGHT = "parcel_height"
  val PARCEL_WIDTH = "parcel_width"
  val PARCEL_WEIGHT = "parcel_weight"
  val CANCEL = "cancel"
  val CANCEL_REASON = "cancel_reason"
  val RIDE_ID = "ride_id"
  val CANCEL_TYPE = "cancel_type"

  //Nearby Drivers Api
  val CURRENT_LAT = "current_lat"
  val CURRENT_LNG = "current_lng"
  val INKMRADIUS = "inKmRadius"
  val TAXI_TYPE_ID = "taxi_type_id"

  //Favorite Driver
  val STATUS = "status"
  val BOOKING_TYPE = "ride_type"
  val PAGE_NO = "page_number"
  val BOOKING_LAST = "last"

  // Driver Registration
  val DRIVER_IMAGE = "driver_image"
  val DRIVER_VECHICLE_REGISTRATION = "vehicle_registration"
  val DRIVER_NAME = "name"
  val SOCIAL_SECURITY = "social_security"
  val DRIVER_EMAIL = "email"
  val DRIVER_PASSWORD = "password"
  val DRIVER_LICENCE = "driving_licence"
  val DRIVER_VEHICLE_NO = "vehicle_registration_number"
  val MANUFACTURING_DETAIL = "manufacturing_details"
  val TAG_NO_STATE = "tag_number_state"
  val INSURANCE_COMPANY_ID = "insurance_company_withID"

  // Driver Address Details
  val DRIVER_ADDRESS = "address"
  val DRIVER_ADDRESS_ID = "driver_address_id"
  val DRIVER_STATE = "state"
  val DRIVER_CITY = "city"
  val DRIVER_PIN_CODE = "pin_code"

  // upload image
  val DRIVER_REG_UPLOADIMAGE = "image"
  val DRIVER_REG_IMAGE_NAME = "image_name"

  //Card Details
  val CARD_HOLDER_NAME = "card_holder_name"
  val CARD_NUMBER = "card_number"
  val CARD_CVV = "cvv"
  val CARD_TYPE = "card_type"
  val EXPIRY_DATE = "expiry_date"
  val CARD_IMAGE = "card_image"

  //Add Credit
  val CREDIT_NO = "credit_no"
  val PAY_OPTION = "pay_option"

  //get paid
  val BANK_NAME = "bank_name"
  val ROUTING_NO = "routing_no"
  val ACCOUNT_NO = "account_no"
  val UPDATE_PROFILE = "update_profile"
  val FULL_NAME = "full_name"
  val PHONE_DRIVER = "mobile"
  val IMAGE = "image"
  val ACTIVE_STATUS = "active"
  val NEW = "new"
  val CONFIRMED = "confirmed" // will get notification

  val NOTCONFIRMED = "notconfirmed" // will not notification

  val REACHED = "reached" // will get notification

  val ARRIVING = "arriving" // will not get notification

  val BEGIN = "begin"
  val END = "end"
  val CANCELED = "cancelled"
  val RATING = "rating"
  val PARCEL_NAME = "parcel_name"
  val WAITING_TIME = "waiting_time"
  val READ_STATUS = "1"
  val UNREAD_STATUS = "0"
  val RATING_TO_ID = "rating_to_id"
  val COMMENTS = "comments"
  val TIPS = "tips"
  val PAID = "paid"
  val UNPAID = "unpaid"
  val WALLET = "wallet"
  val CREDIT_CARD = "creditcard"
  val CASH = "cash"
  val PUSH_ID = "push_id"
  val TAXIUSES = "taxi_uses"
  val IS_MODIFY = "isModify"

  //Recpatcha Keys
  val SITE_KEY = "6LfleOsjAAAAAJ9Y20qJy4RgKvNLNkrf9mVEtjly"
  val SECRET_KEY = "6LfleOsjAAAAAPPC-r8Uly1pPLgpjilR4PIJVZtT"

  //
  companion object{
     val REQUEST_MULTIPLE_PERMISSIONS: Int = 99
  }
}