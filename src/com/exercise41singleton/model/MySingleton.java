package com.exercise41singleton.model;

public class MySingleton {
	//Step 2. Static Private Instance 
	private static MySingleton mySingleton=null;
	private static String urlServer;
	private static String username;
	private static String password;
	
	//Step 1. Private Constructor
	private MySingleton() {}
	
	//Step 3. public static getInstance method
	public static MySingleton getInstance(String url, String user, String pass) {
		if(mySingleton == null) {
			urlServer = url;
			username = user;
			password = pass;
			mySingleton = new MySingleton();
		}else {
			System.out.println("The object couldn't be created");
			System.out.println("Url Server: " + urlServer);
			System.out.println("Username:" + username);
			System.out.println("Password: " + password);
		}
		return mySingleton;
	}
}
