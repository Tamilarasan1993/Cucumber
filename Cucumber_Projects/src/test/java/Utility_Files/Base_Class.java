package Utility_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base_Class {
	public static WebDriver driver;
	public static String value;
	//BROWSERS
	public static WebDriver Browser(String type) {
		if(type.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	
	//URL
	public static void GetUrl(String url) {
		driver.get(url);	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	//SENDKEYS
	public static void Sendkeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	//CLICK
	public static void Click(WebElement element) {
		element.click();	
	}
	//CLEAR
	public static void Clear(WebElement element) {
		element.clear();
	}
	//CLOSE
	public static void CLOSE(WebDriver driver) {
		driver.close();
	}
	//QUIT
	public static void QUIT(WebDriver driver) {
		driver.quit();
	}
	//IsEnabled
	public static boolean ISEnabled(WebElement element) {
		boolean isenabled = element.isEnabled();
		return isenabled;
	}
	//IsDisplayed
	public static  boolean ISdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
			return displayed;
	}
	//IsSelected
	public static boolean Isselected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	
	//SELECT
	public static void SelectIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void SelectValue(WebElement element,String value) {
		Select s0 = new Select(element);
		s0.selectByValue(value);
	}
	public static void SelectVisibleText(WebElement element,String text) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(text);
	}		
	//SCREENSHOT
	public static void  ScreenShot(String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
//GetTAGNAME
	public static String GetTitle() {
		String title = driver.getTitle();
		return title;
	}
	//GET CURRENT URL
	public static String GetCurrentURL() {
		  String currentUrl = driver.getCurrentUrl();
		  	return currentUrl;
	}
	//FRAMES
	public static WebDriver FRAMES(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;
	}
	public	static WebDriver PARENTFRAME() {		
		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;
	}
		public static WebDriver DEFAULTCONTENT() {
		WebDriver defaultContent = driver.switchTo().defaultContent();
		return defaultContent;
	}
	//JAVASCRIPT
	public static Object JAVASCRIPTEXECUTOR(String args,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript(args,element);
		return executeScript;
		}
	//ACTIONS
	public static void ACTIONS(WebElement element , String action) {
		Actions act = new Actions(driver);
		if (action.equalsIgnoreCase("MoveTo")) {

			act.moveToElement(element).perform();
		}
			else if (action.equalsIgnoreCase("Click")) {

				act.click(element).perform();
			}
			else if (action.equalsIgnoreCase("RightClick")) {
			act.contextClick(element).perform();

		}
			else if(action.equalsIgnoreCase("DoubleClick")) {
				act.doubleClick(element).perform();
			}
			else {
				System.out.println("Actions ERROR");
			}
	}
	public static void ACTIONCLICK(WebElement element) {
		Actions ac1 = new Actions(driver);
		ac1.click(element).perform();		
	}
//Navigate
	public static void NAVIGATE(String type) {
		if (type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
		else if (type.equalsIgnoreCase("Back")) {
			driver.navigate().back();
		}
		else if (type.equalsIgnoreCase("Forward")) {
			driver.navigate().forward();
		}
	}
	//NAVIGATE TO
	public static void NavigateTO(String url) {
		driver.navigate().to(url);
	}
	
	//WindowHandle
//	public static void SingleWindow(WebDriver driver) {
//		String parent = driver.getWindowHandle();
//		Set<String> child = driver.getWindowHandles();
//		for (String id : child) {
//			if (id.equals(parent)) {
//				continue;
//			}
//			else {
//				driver.switchTo().window(id);
//					}
	
	//Particular WINDOW
	public static  void WindowTO(WebDriver driver,int index) {
		Set<String> all_id=driver.getWindowHandles();
		List<String> li = new ArrayList<String>(all_id);
		String id = li.get(index);
		driver.switchTo().window(id);
	}
	
	//DATA DRIVEN
	public static String DATADRIVEN_PartCell(int sheet,int row,int cell) throws IOException {
		File f = new File("C:\\\\Users\\\\Jayasri\\\\Desktop\\\\MyStore_TestCases.xlsx");
		FileInputStream fis =  new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();
			System.out.println(value);
		}
		else if (type.equals(CellType.NUMERIC)) {
			double d =c.getNumericCellValue();
			int a = (int)d;
			value=String.valueOf(a);
			System.out.println(value);
			}
		else {
			System.out.println("Not Found or Blank");
			}
		wb.close();
		return value;
	}
	//PARTICULAR ROW
	public static String DATADRIVEN_PartRow(int sheet,int row) throws IOException {
		File f = new File("C:\\Users\\Jayasri\\Desktop\\MyStore_TestCases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		for(int i=0;i<r.getPhysicalNumberOfCells();i++) {
			Cell c =r.getCell(i);
			CellType type = c.getCellType();
			if(type.equals(CellType.STRING)) {
			value =	c.getStringCellValue();
			System.out.println(value);
			}
			else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				int a = (int)d;
				value =String.valueOf(a);
				System.out.println(value);
			}
			else {
				System.out.println("Not Found or Blank");
			}
			wb.close();
		}
		return value;
	}
	//Particular Column
		public static String DATADRIVEN_PARCOLUMN(String path,int sheet,int cell) throws IOException {
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheetAt(sheet);
			for(int i =0;i<s.getPhysicalNumberOfRows();i++) {
				Row r =s.getRow(i);
				Cell c = r.getCell(cell);
				CellType type = c.getCellType();
				if(type.equals(CellType.STRING)) {
					value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int a = (int)d;
					value = String.valueOf(a);
					System.out.println(value);
				}
				else {
					System.out.println("Not Found or Blank");
				}
				wb.close();
			}	
			return value;
		}
		//ALL DATA
		public static String DATADRIVEN_ALLDATA(String path,int sheet) throws IOException {
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheetAt(sheet);
			for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
				Row r =	s.getRow(i);
				for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c= r.getCell(j);
				CellType type = c.getCellType();
				if(type.equals(CellType.STRING)) {
					value = c.getStringCellValue();
				}
				else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
				int a = (int)d;
				 value = String.valueOf(a);
						
				}
				else {
					System.out.println("Not Found Or Blank");
				}
			}
		wb.close();
			}
			return value;	
		}
		
		
		//ALLDATA FOR TestNG
		public static String[][] DataProvider_ALLDATA(String path,int sheet) throws IOException {
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheetAt(sheet);
			
			int rows = s.getPhysicalNumberOfRows();
			Row col = s.getRow(rows);
			int cells = col.getPhysicalNumberOfCells();
			String[][] data = new String[rows][cells];
			
			for(int i=0;i<rows;i++) {
				Row r =	s.getRow(i);
				for(int j=0;j<cells;j++) {
				Cell c= r.getCell(j);
				
				CellType type = c.getCellType();				
				if(type.equals(CellType.STRING)) {
					c.getStringCellValue();
				}
				else if (type.equals(CellType.NUMERIC)) {
					c.getNumericCellValue();
				}
				else {
					System.out.println("Not Found Or Blank");
				}
			}
		wb.close();
			}
			return data;
		}
	
	
	






}
	




