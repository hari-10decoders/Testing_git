package com.API.testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base_class.API_base_class;

public class Sample_API_testing extends API_base_class {
	public static WebDriver driver1 = API_base_class.Getdriver();
//	public static API_pomclass pom = new API_pomclass(driver);
	
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
	
	public static void launchbrowser() {
		Geturl("https://reqres.in/");
		closedriver();
	}
	public static void main(String[] args) throws IOException {
		Get_Api_testing();
		POST_API_testing();
		Api_Putreq();
		Api_Delete();
		launchbrowser();
	}

}