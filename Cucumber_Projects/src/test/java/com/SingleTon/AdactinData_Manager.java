package com.SingleTon;

import java.io.IOException;

public class AdactinData_Manager {
	
	private AdactinData_Manager() {
	}

	public static AdactinData_Manager instanceForTDM() {

		AdactinData_Manager tdm = new AdactinData_Manager();
		return tdm;
	}
	
	public  AdactinData_Reader instanceForTDR() throws IOException {
		AdactinData_Reader reader = new AdactinData_Reader();
		return reader;
	}
	
	
}
