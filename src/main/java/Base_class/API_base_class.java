package Base_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class API_base_class {

	public static WebDriver driver;

	public static WebDriver Getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\10Decoders\\Decoder_new\\API_testing\\driver\\chromedriver.exe");
		return driver = new ChromeDriver();
	}

	public static void Getstatus_method(String URL, String type) throws IOException {
		URL url = new URL(URL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(type);
		connection.connect();
		int code = connection.getResponseCode();
		String message = connection.getResponseMessage();
		System.out.println("Response code--" + " " + code);
		System.out.println("Response message--" + " " + message);
	}

	public static void getAPIdata(String URL, String Type) throws IOException {
		URL url = new URL(URL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(Type);
		connection.connect();
		InputStream stream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader bufferread = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferread.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void PostStatus(String URL, String Type) throws IOException {
		URL url = new URL(URL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(Type);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String Jsonbody = "{\r\n" + "\"name\":\"morpheus\",\r\n" + "\"job\":\"leader\"\r\n" + "}";
		byte[] bytes = Jsonbody.getBytes();
		OutputStream stream = connection.getOutputStream();
		stream.write(bytes);
		int code = connection.getResponseCode();
		String message = connection.getResponseMessage();
		System.out.println("Response code--" + " " + code);
		System.out.println("Response message--" + " " + message);
		InputStream stream1 = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(stream1);
		BufferedReader bufferread = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferread.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void API_PUT(String URL, String Type) throws IOException {
		URL url = new URL(URL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String json ="{\r\n" + "\"name\":\"john\",\r\n" + "\"job\":\"leader\"\r\n" + "}";
		byte[] bytes = json.getBytes();
		OutputStream stream = connection.getOutputStream();
		stream.write(bytes);
		int code = connection.getResponseCode();
		String message = connection.getResponseMessage();
		System.out.println("Response code--" + " " + code);
		System.out.println("Response message--" + " " + message);
		InputStream stream2 = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(stream2);
		BufferedReader bufferreader = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferreader.readLine()) !=null) {
		buffer.append(line);	
		}
		System.out.println(buffer);
	}
	
	public static void API_Delete(String URL,String Type) throws IOException {
		URL url = new URL(URL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(Type);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		int code = connection.getResponseCode();
		String message = connection.getResponseMessage();
		System.out.println("Response code--" + " " + code);
		System.out.println("Response message--" + " " + message);
		InputStream stream = connection.getInputStream();
		InputStreamReader read = new InputStreamReader(stream);
		BufferedReader bufferreader = new BufferedReader(read);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line =bufferreader.readLine())!=null) {
			buffer.append(line);
		}
	System.out.println(line);
	}
	
	public static void Geturl(String url) {
		driver.get(url);
	}
	}
