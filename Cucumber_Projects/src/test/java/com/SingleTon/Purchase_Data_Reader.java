	
	package com.SingleTon;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class Purchase_Data_Reader {
		
		
		public static Properties p;
		public Purchase_Data_Reader() throws IOException {
			File f = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Cucumber_Projects\\Purchase.properties");
			FileInputStream fis = new FileInputStream(f);
			p=new Properties();
			p.load(fis);
		}

		public String username() {
				String uname = p.getProperty("Username");
				return uname;		
		}
		
		public String password() {
			String pwd = p.getProperty("Password");
			return pwd;
		}
		
		public String quantity() {
			String qty = p.getProperty("Quantity");
			return qty;
		}
		public String size() {
			String siz = p.getProperty("Size");
			return siz;
		}
	}


