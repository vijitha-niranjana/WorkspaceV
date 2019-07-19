package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Keyboard {
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\VIJITHA\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  Assert.assertTrue(driver.getTitle().contains("demowebshop"));
	  WebElement search=driver.findElement(By.name("q"));
	  Actions act=new Actions(driver);
	  act.moveToElement(search).sendKeys("computer").build().perform();
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).click().build().perform();
	  Thread.sleep(1000); 
	  driver.findElement(By.xpath("//input[value@value='search']"));
	  driver.close();
  }}
