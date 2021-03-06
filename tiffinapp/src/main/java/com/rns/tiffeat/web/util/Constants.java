package com.rns.tiffeat.web.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface Constants {

	Map<String, String> AREAS = Collections.unmodifiableMap(new HashMap<String, String>(){{ 
        put("411030", "Sadashiv Peth");
        put("411052", "Budhwar peth");
        put("411004", "Deccan");
        put("411007", "Ganeshkhind");
        put("411005", "Shivajinagar");
        put("411053", "Shivajinagar Housing");
    }});
	
	String DATE_FORMAT = "yyyy-MM-dd";
	
	String ERROR_DAILYCONTENT_DOES_NOT_EXIST = "This dailycontent does not exist!";
	String ERROR_INVALID_MEAL_DETAILS = "Invalid Meal Details or meal does not exist!";
	String ERROR_PHONE_NUMBER_ALREADY_PRESENT = "Phone Number already present!";
	String RESPONSE_OK = "OK";
	String ERROR_EMAIL_ADDRESS_ALREADY_PRESENT = "Email Address already present!";
	String ERROR_INVALID_USER_DETAILS = "Invalid User Details!";
	String ERROR_MEAL_NOT_AVAILABLE_PLEASE_CHECK_AGAIN = "Meal not available!Please check again!";
	String ERROR_INVALID_ORDER_DETAILS = "Invalid order details!";
	String ERROR_INVALID_CUSTOMER_DETAILS = "Invalid customer details!";
	String ERROR_CAN_T_CANCEL_THE_MEAL = "Can't cancel the meal now!";
	String ERROR_CANT_CHANGE_THE_MEAL = "Can't change the meal in this phase!";
	String ERROR_UPLOADING_IMAGE = "Error uploading Image!";
	String ERROR_INVALID_VENDOR_DETAILS = "Invalid Vendor details!";
	String ERROR_ALERADY_SCHEDULED_MEAL_TYPE = "Can't scheduled this Meal!You already have a meal scheduled for this timing!";
	String ERROR_ALERADY_SCHEDULED = "Can't scheduled this meal!You already have lunch and dinner scheduled!";
	
	
	String WARNING_DATE_CHANGED = "Date changed";
	
	String GOOGLE_GET_USER_DATA_URL = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
	String GOOGLE_ACCESS_TOKEN = "access_token";
	String GOOGLE_GET_ACCESS_TOKEN_URL = "https://accounts.google.com/o/oauth2/token";
	
	String ROOT_DIRECTORY = "D:/Resoneuronance/TiffEat/Data/Images/";
	//String ROOT_DIRECTORY = "/home/tiffeat/Images/";
	String ASSETS_ROOT = "/resources";
	//String ASSETS_ROOT = "../../resources/assets";
	
	String GOOGLE_GET_CODE_URL = "https://accounts.google.com/o/oauth2/auth?" +
			  "scope=email"
			+ "&redirect_uri=http://localhost:8080/tiffeat-web/getGoogleCode"
			+ "&response_type=code"
			+ "&client_id=344058125654-48me3a50pah2mkgqmp710mto6a36msbi.apps.googleusercontent.com"
			+ "&approval_prompt=force";
	
	String GOOGLE_ACCESS_TOKEN_URL_PARAMS = "&client_id=344058125654-48me3a50pah2mkgqmp710mto6a36msbi.apps.googleusercontent.com"
            				+ "&client_secret=4gE9UVYBfJ3JGFR4uu_vnFxH"
            				+ "&redirect_uri=http://localhost:8080/tiffeat-web/getGoogleCode"
            				+ "&grant_type=authorization_code";
	
	String MODEL_MEAL = "meal";
	String MODEL_RESULT = "result";
	String MODEL_CUSTOMER = "customer";
	String MODEL_MEAL_TYPE = "mealType";
	String MODEL_PAYMENT_TYPES = "paymentTypes";
	String MODEL_CUSTOMER_ORDER = "customerOrder";
	String MODEL_VENDOR = "vendor";
	String MODEL_PIN_CODE = "pinCode";
	String MODEL_VENDORS = "vendors";
	String MODEL_AREAS = "areas";
	String MODEL_PAY_U_DETAILS = "payUDetails";
	String MODEL_SELECTED_AREA_ENTRY = "selectedArea";
	String MODEL_ORDERS = "orders";
	String MODEL_DAILY_CONTENT = "dailyContent";
	String MEAL_ID = "mealId";
	String EXCEL_VIEW = "excelView";
	String MODEL_ORDER_STATUSES = "orderStatus";
	String MODEL_ORDER_STATUS = "status";
	String MODEL_ADMIN = "admin";
	
	String HOST_URL = "192.168.0.2:8080";
	
	String RESULT_URL_QUICK = "http://"+ HOST_URL + "/tiffeat-web/paymentResult";
	String PRODUCT_INFO = "Tiffeat";
	//String MERCHANT_KEY = "gtKFFx";
	String MERCHANT_KEY = "SvGyqj";
	//String MERCHANT_SALT = "eCwWELxi";
	String MERCHANT_SALT = "3pfnUWXj";
	
	//5123456789012346
	//quc1iGQZKN4HD
	//export JAVA_HOME=/opt/jdk1.7.0_79
	// /etc/init.d/easy-tomcat7 restart
	//Ticket number : YGR-166-61065
	// Jar -xvf warname.war
}
