package com.SingleTon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AdactinData_Reader {
	public static Properties p;
	
	public AdactinData_Reader() throws IOException {
		File f = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\Adactin_data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}
	public String getUsername() {
		String name = p.getProperty("Username");
		return name;
	}
	public String getPassword(){
		String pwd = p.getProperty("Password");
		return pwd;
		}
	public String getLocation(){
		String loc = p.getProperty("Location");
		return loc;
		}
	public String getHotel(){
		String hotel = p.getProperty("Hotel");
		return hotel;
		}
	public String getRoomType() {
		String type = p.getProperty("RoomType");
		return type;
	}
	
	
	
	
	
	
	
	
}
