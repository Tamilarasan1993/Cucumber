package com.SingleTon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Purchase_Data_Manager {



		
		private Purchase_Data_Manager() {
		}

		public static Purchase_Data_Manager pdata() {
			Purchase_Data_Manager pdm = new Purchase_Data_Manager();
			return pdm;
		}
			
		public Purchase_Data_Reader datareader() throws IOException {
			Purchase_Data_Reader pdr = new Purchase_Data_Reader();
			return pdr;
		}
		
	}
	
	
	

