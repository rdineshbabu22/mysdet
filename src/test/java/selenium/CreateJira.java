package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v113.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateJira {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String summary="Story by sdetssa";
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hari.radhakrishnan@testleaf.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("India@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		WebElement myProject=driver.findElement(By.xpath("//p[text()='SDET-5']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(myProject));
		myProject.click();
		Thread.sleep(5000);
		WebElement create = driver.findElement(By.id("createGlobalItem"));
		wait.until(ExpectedConditions.visibilityOf(create));
		create.click();
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys(summary);
		WebElement formCreate=driver.findElement(By.xpath("//button[@form='issue-create.ui.modal.create-form']/span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", formCreate);
		WebElement backlog=driver.findElement(By.xpath("//span[text()='Backlog']"));
		wait.until(ExpectedConditions.visibilityOf(backlog));
		backlog.click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(summary);
		WebElement serachItem=driver.findElement(By.xpath("//mark[text()='Story by sdetssa']"));
		wait.until(ExpectedConditions.visibilityOf(serachItem));
		String verificationtext=driver.findElement(By.xpath("//mark[text()='Story by sdetssa']")).getText();
		Assert.assertEquals(verificationtext, summary);

	}

}
