package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actions {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\VIJITHA\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement src=driver.findElement(By.id("draggable"));
	  WebElement target=driver.findElement(By.id("droppable"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,target).build().perform();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Demos")).click();
	  Assert.assertTrue(driver.getTitle().contains("Demos"));
	  driver.close();
  }
}
