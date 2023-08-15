package com.example.roverclone.retrofit.interfaces;

import com.example.roverclone.utility.Urls;
import com.google.gson.JsonElement;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @Headers({"Accept: application/json"})

    @FormUrlEncoded
    @POST(Urls.SEND_OTP)
    Observable<SendOtp> sendOtp(@Field(Constants.PHONE) String phone,
                                @Field(Constants.USER_TYPE) String userType,
                                @Field(Constants.COUNTRY_CODE) String countryCode,
                                @Field(Constants.DEVICETOKEN) String deviceToken,
                                @Field(Constants.DEVICETYPE) String deviceType,
                                @Field(Constants.DEVICEID) String deviceId);


    @FormUrlEncoded
    @POST(Urls.VERIFY_OTP)
    Observable<VerifyOtp> verifyOtp(@Field(Constants.PHONE) String phone,
                                    @Field(Constants.USER_TYPE) String userType,
                                    @Field(Constants.OTP) String otp,
                                    @Field(Constants.COUNTRY_CODE) String countryCode);

    @FormUrlEncoded
    @POST(Urls.LOGIN)
    Observable<Login> login(@Field(Constants.PHONE) String phone,
                            @Field(Constants.USER_TYPE) String userType,
                            @Field(Constants.COUNTRY_CODE) String countryCode,
                            @Field(Constants.DEVICETYPE) String deviceType,
                            @Field(Constants.DEVICETOKEN) String deviceToken,
                            @Field(Constants.DEVICEID) String deviceId,
                            @Field(Constants.PASSWORD) String password);

    @FormUrlEncoded
    @POST("registerUser")
    Observable<Registration> registration(@Header(Constants.TOKEN) String authorization,
                                          @Field(Constants.USER_ID) String userid,
                                          @Field(Constants.NAME) String name,
                                          @Field(Constants.EMAIL) String email,
                                          @Field(Constants.PASSWORD) String password,
                                          @Field(Constants.CARD_ID) String cardId);

    @FormUrlEncoded
    @POST("resetPassword")
    Observable<Logout> resetPassword(@Field(Constants.USER_ID) int userid,
                                     @Field(Constants.PASSWORD) String password);

    @FormUrlEncoded
    @POST("updateProfile")
    Observable<UpdateProfile> updateProfile(@Header(Constants.TOKEN) String authorization,
                                            @Field(Constants.NAME) String name,
                                            @Field(Constants.EMAIL) String email,
                                            @Field(Constants.USER_TYPE) String userType,
                                            @Field(Constants.PASSWORD) String password,
                                            @Field(Constants.USER_IMAGE) String user_image,
                                            @Field(Constants.DEVICETOKEN) String token,
                                            @Field(Constants.DEVICEID) String deviceId,
                                            @Field(Constants.DEVICETYPE) String deviceType);

    @FormUrlEncoded
    @POST("updateProfile")
    Observable<UpdateProfile> updateTokenProfile(@Header(Constants.TOKEN) String authorization,
                                            @Field(Constants.NAME) String name,
                                            @Field(Constants.EMAIL) String email,
                                            @Field(Constants.USER_TYPE) String userType,
                                            @Field(Constants.PASSWORD) String password,
                                            @Field(Constants.DEVICETOKEN) String token,
                                            @Field(Constants.DEVICEID) String deviceId,
                                            @Field(Constants.DEVICETYPE) String deviceType);
    @GET("logout")
    Observable<Logout> logout(@Header(Constants.TOKEN) String authorization);

    @GET("block-active-user")
    Observable<Logout> blockUser(@Header(Constants.TOKEN) String authorization);

    @FormUrlEncoded
    @POST("getTaxiTypes")
    Observable<GetTaxiTypes> getTaxiTypes(@Field(Constants.TAXIUSES) String taxitype);


    @GET("Paymentlist")
    Observable<PaymentList> Paymentlist();

    @FormUrlEncoded
    @POST("createRide")
    Observable<CreateRide> createRide(@Header(Constants.TOKEN) String authorization,
                                      @Field(Constants.TAXI_TYPE_ID) String taxiTypeId,
                                      @Field(Constants.PICKUP_ADDRESS) String pickAddress,
                                      @Field(Constants.DROP_ADDRESS) String dropAddress,
                                      @Field(Constants.PICKUP_LAT) double pickLat,
                                      @Field(Constants.PICKUP_LNG) double pickLng,
                                      @Field(Constants.DROP_LAT) double dropLat,
                                      @Field(Constants.DROP_LNG) double dropLng,
                                      @Field(Constants.DISTANCE) String distance,
                                      @Field(Constants.RIDE_TYPE) String rideType,
                                      @Field(Constants.DRIVER_ID) String driverId,
                                      @Field(Constants.ESTIMATED_COST) String estimatedCost,
                                      @Field(Constants.ACTUAL_COST) String actualCost,
                                      @Field(Constants.PAY_BY) String payBy,
                                      @Field(Constants.RIDE_STATUS) String rideStatus,
                                      @Field(Constants.PARCEL_HEIGHT) String parcelheight,
                                      @Field(Constants.PARCEL_WIDTH) String parcelWidth,
                                      @Field(Constants.PARCEL_WEIGHT) String parcelWeight,
                                      @Field(Constants.CANCEL) String cancel,
                                      @Field(Constants.CANCEL_REASON) String cancelReason,
                                      @Field(Constants.CANCEL_TYPE) String cancelType,
                                      @Field(Constants.PARCEL_NAME) String parcelName,
                                      @Field("parcel_depth") String parcelDepth);

    @FormUrlEncoded
    @POST("updateRide")
    Observable<com.rover.model.rideStatusResponse.RideStatusResponse> updateRide(@Header(Constants.TOKEN) String authorization,
                                                                                 @Field(Constants.TAXI_ID) String taxiId,
                                                                                 @Field(Constants.RIDE_ID) String rideID,
                                                                                 @Field(Constants.PICKUP_ADDRESS) String pickAddress,
                                                                                 @Field(Constants.DROP_ADDRESS) String dropAddress,
                                                                                 @Field(Constants.PICKUP_LAT) String pickLat,
                                                                                 @Field(Constants.PICKUP_LNG) String pickLng,
                                                                                 @Field(Constants.DROP_LAT) String dropLat,
                                                                                 @Field(Constants.DROP_LNG) String dropLng,
                                                                                 @Field(Constants.DISTANCE) String distance,
                                                                                 @Field(Constants.RIDE_TYPE) String rideType,
                                                                                 @Field(Constants.DRIVER_ID) String driverId,
                                                                                 @Field(Constants.ESTIMATED_COST) String estimatedCost,
                                                                                 @Field(Constants.ACTUAL_COST) String actualCost,
                                                                                 @Field(Constants.PAY_BY) String payBy,
                                                                                 @Field(Constants.RIDE_STATUS) String rideStatus,
                                                                                 @Field(Constants.PARCEL_HEIGHT) String parcelheight,
                                                                                 @Field(Constants.PARCEL_WIDTH) String parcelWidth,
                                                                                 @Field(Constants.PARCEL_WEIGHT) String parcelWeight,
                                                                                 @Field(Constants.CANCEL) String cancel,
                                                                                 @Field(Constants.CANCEL_REASON) String cancelReason,
                                                                                 @Field(Constants.CANCEL_TYPE) String cancelType,
                                                                                 @Field(Constants.WAITING_TIME) String waitingtime,
                                                                                 @Field(Constants.COMMENTS) String comments,
                                                                                 @Field(Constants.TIPS) String tips);


    @FormUrlEncoded
    @POST("createRide")
    Observable<com.rover.model.rideStatusResponse.RideStatusResponse> modifiedRide(@Header(Constants.TOKEN) String authorization,
                                                                                   @Field(Constants.TAXI_ID) String taxiId,
                                                                                   @Field(Constants.RIDE_ID) String rideID,
                                                                                   @Field(Constants.PICKUP_ADDRESS) String pickAddress,
                                                                                   @Field(Constants.DROP_ADDRESS) String dropAddress,
                                                                                   @Field(Constants.PICKUP_LAT) String pickLat,
                                                                                   @Field(Constants.PICKUP_LNG) String pickLng,
                                                                                   @Field(Constants.DROP_LAT) String dropLat,
                                                                                   @Field(Constants.DROP_LNG) String dropLng,
                                                                                   @Field(Constants.DISTANCE) String distance,
                                                                                   @Field(Constants.RIDE_TYPE) String rideType,
                                                                                   @Field(Constants.DRIVER_ID) String driverId,
                                                                                   @Field(Constants.ESTIMATED_COST) String estimatedCost,
                                                                                   @Field(Constants.ACTUAL_COST) String actualCost,
                                                                                   @Field(Constants.PAY_BY) String payBy,
                                                                                   @Field(Constants.RIDE_STATUS) String rideStatus,
                                                                                   @Field(Constants.PARCEL_HEIGHT) String parcelheight,
                                                                                   @Field(Constants.PARCEL_WIDTH) String parcelWidth,
                                                                                   @Field(Constants.PARCEL_WEIGHT) String parcelWeight,
                                                                                   @Field(Constants.CANCEL) String cancel,
                                                                                   @Field(Constants.CANCEL_REASON) String cancelReason,
                                                                                   @Field(Constants.CANCEL_TYPE) String cancelType,
                                                                                   @Field(Constants.WAITING_TIME) String waitingtime,
                                                                                   @Field(Constants.COMMENTS) String comments,
                                                                                   @Field(Constants.TIPS) String tips,
                                                                                   @Field(Constants.IS_MODIFY) String isModify);


    @FormUrlEncoded
    @POST("getNearByDrivers")
    Observable<NearbyDriver> getNearbyDrivers(@Field(Constants.CURRENT_LAT) String currentLatitude,
                                              @Field(Constants.CURRENT_LNG) String currentLongitude,
                                              @Field(Constants.INKMRADIUS) String inKmRadius,
                                              @Field(Constants.TAXI_TYPE_ID) String taxiTypeId);

    @FormUrlEncoded
    @POST("getRideStatus")
    Observable<com.rover.model.rideStatusResponse.RideStatusResponse> getRideStatus(@Header(Constants.TOKEN) String authorization, @Field(Constants.RIDE_ID) Integer rideId);

    @FormUrlEncoded
    @POST("favouriteDriver")
    Observable<FavouriteDriver> favouriteDriver(@Header(Constants.TOKEN) String authorization,
                                                @Field(Constants.DRIVER_ID) String driverId,
                                                @Field(Constants.STATUS) String status);

    @FormUrlEncoded
    @POST("rideRequest")
    Observable<JsonElement> rideRequest(@Header(Constants.TOKEN) String authorization,
                                        @Field(Constants.RIDE_ID) String rideId,
                                        @Field(Constants.RIDE_STATUS) String rideStatus);

    @GET("favouriteDriverList")
    Observable<FavouriteResponse> favouriteDriverList(@Header(Constants.TOKEN) String authorization);

    @GET("directions/json")
    Observable<JsonElement> getDistance(@Query("origin") String origin,
                                        @Query("destination") String destination,
                                        @Query("key") String key);

    @GET("paymentMethodList")
    Observable<PaymentMethodListResponse> paymentMethodList(@Header(Constants.TOKEN) String authorization);

    @FormUrlEncoded
    @POST("rideList")
    Observable<RideListReasponse> rideList(@Header(Constants.TOKEN) String authorization,
                                           @Field(Constants.BOOKING_LAST) String last,
                                           @Field(Constants.BOOKING_TYPE) String bookingType,
                                           @Field(Constants.PAGE_NO) String pageNo);

    @FormUrlEncoded
    @POST("rideList")
    Observable<DriverRideResponse> rideListDriver(@Header(Constants.TOKEN) String authorization,
                                                  @Field(Constants.BOOKING_LAST) String last,
                                                  @Field(Constants.BOOKING_TYPE) String bookingType,
                                                  @Field(Constants.PAGE_NO) String pageNo);

    @FormUrlEncoded
    @POST("getRideStatus")
    Observable<RideStatusResponse> getRideStatus(@Header(Constants.TOKEN) String authorization,
                                                 @Field(Constants.RIDE_ID) String rideID);

    @FormUrlEncoded
    @POST("advanceRide")
    Observable<AdvanceRideResponse> advanceRide(@Header(Constants.TOKEN) String authorization,
                                                @Field(Constants.TAXI_ID) String taxiId,
                                                @Field(Constants.DRIVER_ID) String driverId,
                                                @Field(Constants.PICKUP_ADDRESS) String pickupAddress,
                                                @Field(Constants.DROP_ADDRESS) String dropAddress,
                                                @Field(Constants.PICKUP_LAT) String pickupLat,
                                                @Field(Constants.PICKUP_LNG) String pickupLng,
                                                @Field(Constants.DROP_LAT) String droplat,
                                                @Field(Constants.DROP_LNG) String dropLng,
                                                @Field(Constants.DISTANCE) String distance,
                                                @Field(Constants.RIDE_TYPE) String rideType,
                                                @Field(Constants.ESTIMATED_COST) String estimatedCost,
                                                @Field(Constants.ACTUAL_COST) String actualCost,
                                                @Field(Constants.PAY_BY) String payBy,
                                                @Field(Constants.RIDE_STATUS) String rideStatus,
                                                @Field(Constants.PARCEL_HEIGHT) String parcelHeight,
                                                @Field(Constants.PARCEL_WIDTH) String parcelWidth,
                                                @Field(Constants.PARCEL_WEIGHT) String parcelWeight);

    @FormUrlEncoded
    @POST("registerDriver")
    Observable<DriverRegistrationResponse> registerDriver(@Header(Constants.TOKEN) String authorization,
                                                          @Field(Constants.DRIVER_IMAGE) String driver_image,
                                                          @Field(Constants.DRIVER_NAME) String driver_name,
                                                          @Field(Constants.DRIVER_EMAIL) String email,
                                                          @Field(Constants.DRIVER_PASSWORD) String password,
                                                          @Field(Constants.SOCIAL_SECURITY) String social_security,
                                                          @Field(Constants.DRIVER_LICENCE) String driving_licence,
                                                          @Field(Constants.TAXI_ID) String taxiID,
                                                          @Field(Constants.DRIVER_VEHICLE_NO) String vehicle_registration_number,
                                                          @Field(Constants.DRIVER_VECHICLE_REGISTRATION) String vehicle_registration,
                                                          @Field(Constants.MANUFACTURING_DETAIL) String manufacturing_details,
                                                          @Field(Constants.TAG_NO_STATE) String tag_number_state,
                                                          @Field(Constants.INSURANCE_COMPANY_ID) String insurance_company_withID);

    @Multipart
    @POST("uploadImage")
    Call<UploadImageResponse> uploadImage(@Part(Constants.DRIVER_REG_IMAGE_NAME) RequestBody imageName,
                                          @Part MultipartBody.Part file);

    @FormUrlEncoded
    @POST("registerDriverAddress")
    Observable<DriverProfile> driverAddress(@Header(Constants.TOKEN) String authorization,
                                            @Field(Constants.DRIVER_ADDRESS_ID) String driver_address_id,
                                            @Field(Constants.DRIVER_ADDRESS) String address,
                                            @Field(Constants.DRIVER_STATE) String state,
                                            @Field(Constants.DRIVER_CITY) String city,
                                            @Field(Constants.DRIVER_PIN_CODE) String pincode);

    @FormUrlEncoded
    @POST("saveCardDetails")
    Observable<JsonElement> saveCardDetails(@Header(Constants.TOKEN) String authorization,
                                            @Field(Constants.CARD_HOLDER_NAME) String card_holder_name,
                                            @Field(Constants.CARD_NUMBER) String card_number,
                                            @Field(Constants.CARD_CVV) String cvv,
                                            @Field(Constants.CARD_TYPE) String card_type,
                                            @Field(Constants.EXPIRY_DATE) String expiry_date,
                                            @Field(Constants.CARD_IMAGE) String card_image);

    @FormUrlEncoded
    @POST("addCreditBalance")
    Observable<JsonElement> addCreditBalance(@Header(Constants.TOKEN) String authorization,
                                             @Field(Constants.CREDIT_NO) String credit_no,
                                             @Field(Constants.PAY_OPTION) String pay_option);

    @GET("viewCreditBalance")
    Observable<CreaditResponse> viewCreditBalance(@Header(Constants.TOKEN) String authorization);


    @GET("transactionsList")
    Observable<ResponseBody> transactionsList(@Header(Constants.TOKEN) String authorization);

    @FormUrlEncoded
    @POST("getPaid")
    Observable<JsonElement> getPaid(@Header(Constants.TOKEN) String authorization,
                                    @Field(Constants.BANK_NAME) String bank_name,
                                    @Field(Constants.ROUTING_NO) String routing_no,
                                    @Field(Constants.ACCOUNT_NO) String account_no);


    @GET("driverProfile")
    Observable<JsonElement> driverProfile(@Header(Constants.TOKEN) String authorization);

    @FormUrlEncoded
    @POST("getAllNotifications")
    Observable<NotificationResponse> getAllNotifications(@Header(Constants.TOKEN) String authorization, @Field(Constants.PAGE_NO) String page_no);

    @FormUrlEncoded
    @POST("getDriverLatLng")
    Observable<DriverPosition> getDriverLocation(@Field(Constants.DRIVER_ID) String authorization);

    @FormUrlEncoded
    @POST("driverRating")
    Call<RatingResponse> setDriverRating(@Header(Constants.TOKEN) String authorization, @Field(Constants.RIDE_ID) String rideId, @Field(Constants.RATING_TO_ID) String driverId, @Field(Constants.RATING) String rating, @Field("comment") String comments);

    @FormUrlEncoded
    @POST("ridePayment")
    Call<Payment> setPayment(@Header(Constants.TOKEN) String authorization,
                             @Field(Constants.RIDE_ID) String rideId,
                             @Field(Constants.PAY_BY) String payby,
                             @Field(Constants.ACTUAL_COST) String actualCost
                            );

    @FormUrlEncoded
    @POST("readNotification")
    Call<ResponseBody> setReadNotification(@Header(Constants.TOKEN) String authorization,
                                           @Field(Constants.PUSH_ID) String pushId);

    @GET("getAllFaqs")
    Call<FaqResponse> getFavouriteList(@Header(Constants.TOKEN) String authorization);

    @GET("userDetail")
    Observable<UserModel> getUserProfile(@Header(Constants.TOKEN) String token);

    @FormUrlEncoded
    @POST("ephemeralKey")
    Observable<ResponseBody> getClientResponse(@Header(Constants.TOKEN) String token,
                                               @Field("api_version") String apiVersion);

    @FormUrlEncoded
    @POST("clientSecret")
    Observable<ResponseBody> getClientSecretKey(@Header(Constants.TOKEN) String token,
                                                @Field(Constants.RIDE_ID) String rideId);

    @FormUrlEncoded
    @POST("paymentStatus")
    Call<PaymentResponseApi> setCompleteStatus(@Header(Constants.TOKEN) String token,
                                               @Field(Constants.RIDE_ID) String rideId,
                                                     @Field(Constants.STATUS) String status
                                                    );
    @GET("lastRide")
    Observable<RideListReasponse> getLastRide(@Header(Constants.TOKEN) String authorization);


    @FormUrlEncoded
    @POST("captureTipPayment")
    Observable<RideStatusResponse> stTipPayment(@Header(Constants.TOKEN) String authorization,
                                                 @Field(Constants.RIDE_ID) String rideID,
                                                 @Field(Constants.TIPS) String tips);
}
