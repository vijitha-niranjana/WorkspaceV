package GFT;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class dashboard {
ExtentReports report;
ExtentTest test;
WebDriver driver;
@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\VIJITHA\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  if(driver.getTitle().contains("mercury")){
		  test.log(LogStatus.PASS, "login Passed", "Login executed successfully");
		  
	  }else{
		  test.log(LogStatus.FAIL, "login failed","Login is not executed successfully");

	  }
	  driver.close();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  report=new ExtentReports("C:\\selenium\\myreport.html",false);
	  test=report.startTest("dashboard");
  }

  @AfterClass
  public void afterClass() {
	  report.flush();
	  report.endTest(test);
  }
}
