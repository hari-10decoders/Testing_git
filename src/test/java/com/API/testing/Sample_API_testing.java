package com.API.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.API_base_class;
import Pom_class.API_pomclass;

public class Sample_API_testing extends API_base_class {
//	public static WebDriver driver1 = API_base_class.Getdriver();
//	public static API_pomclass pom = new API_pomclass(driver1);
//	
	
	public static void Get_Api_testing() throws IOException  {
		Getstatus_method("https://reqres.in/api/users?page=2","GET");
		getAPIdata("https://reqres.in/api/users?page=2", "GET");
	}
	public static void POST_API_testing() throws IOException {
		PostStatus("https://reqres.in/api/users", "POST");
	}
	public static void Api_Putreq() throws IOException {
		API_PUT("https://reqres.in/api/users/2", "PUT");
	}
	public static void Api_Delete() throws IOException {
		API_Delete("https://reqres.in/api/users/2", "DELETE");
	}
	public static void main(String[] args) throws IOException {
		Get_Api_testing();
		POST_API_testing();
		Api_Putreq();
		Api_Delete();
	}

}