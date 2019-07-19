package Dropdown;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testcase1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\VIJITHA\\chromedriver_win32\\chromedriver.exe");
	  WebDriver ff=new ChromeDriver();
	 String loginpagetitle = ff.getTitle();
	 System.out.println(loginpagetitle);
	  ff.get("http://newtours.demoaut.com/");
	  ff.findElement(By.name("username")).sendKeys("mercury");
	  ff.findElement(By.name("password")).sendKeys("mercury");
	  ff.findElement(By.name("login")).click();
	  String bookpagetitle=ff.getTitle();
	  System.out.println(bookpagetitle);
	  ff.findElement(By.xpath("\\input[@value='oneway']")).click();
	 Select Passenger=new Select(ff.findElement(By.name("passcount")));
	 Passenger.selectByIndex(2);
	 ff.findElement(By.linkText("SIGN-OFF"));
	assertEquals(ff.getTitle(),"sign-on:Mercury Tours");
	 ff.close();
  }
}
