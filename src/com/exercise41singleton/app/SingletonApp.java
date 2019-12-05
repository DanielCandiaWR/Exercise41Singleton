package com.exercise41singleton.app;

import com.exercise41singleton.model.MySingleton;
public class SingletonApp {

	public static void main(String[] args) {
		String urlServer1 = "jdbc:mysql://localhost:3306/store";
		String user1 = "root1";
		String password1 = "root1";
		
		String urlServer2 = "jdbc:mysql://localhost:3306/store";
		String user2 = "root2";
		String password2 = "root2";
		
		String urlServer3 = "jdbc:mysql://localhost:3306/store";
		String user3 = "root3";
		String password3 = "root3";
		
		
		MySingleton objMySingleton = MySingleton.getInstance(urlServer1, user1, password1);
		MySingleton objMySingleton2 = MySingleton.getInstance(urlServer2, user2, password2);
		MySingleton objMySingleton3 = MySingleton.getInstance(urlServer3, user3, password3);
		

	}

}
