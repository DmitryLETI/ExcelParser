package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


public class GoogleMapsAPIImplementation {

public static void main(String args[])
{
String result = calculateDistance("Sunnyvale, CA", "San Jose, CA");
System.out.println(result);
}

public static String calculateDistance(String source, String destination)
{
	try {
		
		String baseURL = "http://maps.google.com/maps/api/distancematrix/json?";
		baseURL +="origins="+URLEncoder.encode(source, "UTF-8")+"&destinations="+URLEncoder.encode(destination, "UTF-8")+"&units=imperial&sensor=false";
		URL url = new URL(baseURL);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		if(connection.getResponseCode()==200){	// successfully get response
			System.out.println(connection.getResponseMessage());
			// Buffer the result into a string
			  BufferedReader rd = new BufferedReader(
			      new InputStreamReader(connection.getInputStream()));
			  StringBuilder sb = new StringBuilder();
			  String line;
			  while ((line = rd.readLine()) != null) {
			    sb.append(line);
			  }
			  rd.close();

			  connection.disconnect();
			  return sb.toString();
		}else{
			throw new IOException(connection.getResponseMessage());
		}
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	return null;
}

}