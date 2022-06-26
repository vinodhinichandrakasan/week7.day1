package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	public WebDriver driver;
	@Given("open the chrome browser")
	public void launchBroswer()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Given("launch the application Url as {string}")
	public void launchUrl(String url)
	{
		driver.get(url);
		
	    driver.manage().window().maximize();
	}
	@Given("enter the username as {string}")
	public void enterUserName(String uName)
	{
		 driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("enter the password as {string}")
	public void enterPassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@Given("click on Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Given("check the homepage is loaded")
	public void verify()
	{
		String text = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		if(text.contains("Demo"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
	}



}
