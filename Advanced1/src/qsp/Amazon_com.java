package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_com 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("adidas shoe");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='a-button-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='submit.addToCart']")).click();
}
}