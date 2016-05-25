package com.demorestws.project.constant;

public class UserUriConstants {
	public static final String REGISTER_USER= "user";
	public static final String FIND_USERS_BY_FIRSTNAME= "user/{firstname}";
	public static final String FIND_USERS_BY_CITY= "user/address/{city}";
	public static final String FIND_USERS_BY_ACCOUNTTYPE= "user/account/{accounttype}";
	public static final String FIND_USERS_BY_CITY_AND_ACCOUNTTYPE= "user/city/{city}/account/{accounttype}";
	public static final String SEARCH_USER= "user/firstname/{searchterm}";
	
}
