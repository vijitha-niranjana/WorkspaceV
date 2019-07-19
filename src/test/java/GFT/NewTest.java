package GFT;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest {
  @Test
  public void f() throws IOException, InterruptedException {
	  //define file location
	  File src=new File("C:\\selenium\\excel.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int lastrow=sheet1.getLastRowNum();
		System.out.println(lastrow);
		for(int i=1;i<=lastrow;i++){
		String un= sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(un);
		String psd= sheet1.getRow(i).getCell(1).getStringCellValue();
		System.out.println(psd);
		  System.setProperty("webdriver.chrome.driver","C:\\VIJITHA\\chromedriver_win32\\chromedriver.exe ");
	      WebDriver driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  driver.findElement(By.name("userName")).sendKeys("case1");
		  driver.findElement(By.name("firstName")).sendKeys("case1");
		  driver.findElement(By.name("lastName")).sendKeys("study");
		  driver.findElement(By.name("password")).sendKeys("case1");
		  driver.findElement(By.name("confirmPassword")).sendKeys("case1");
		  driver.findElement(By.xpath("\\input[@value='Female']")).click();
		  driver.findElement(By.name("email")).sendKeys("case1@gmail.com");
		  driver.findElement(By.id("mobileNumber")).sendKeys("9850067890");
		  driver.findElement(By.name("dob")).sendKeys("11/10/1986");
		  driver.findElement(By.id("address")).sendKeys("chennai");
		  
		  
		  
		  
		  
		  
		  
		  Thread.sleep(3000);
		  driver.close();
		}
		wb.close();
  }
}
