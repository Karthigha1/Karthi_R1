package sampleproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFactorFacebook
{

	static ChromeOptions options = new ChromeOptions();
	static ChromeDriver driver = new ChromeDriver(options.setHeadless(true));

	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	static WebElement registerPage;
	@FindBy(xpath = "//input[@name='firstname']")
	static WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	static WebElement lastName;
	@FindBy(xpath = "//input[@name='reg_email__']")
	static WebElement regEmail;
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	static WebElement confirmEmail;
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	static WebElement pswd;
	@FindBy(id = "day")
	static WebElement day;
	@FindBy(id = "month")
	static WebElement month;
	@FindBy(id = "year")
	static WebElement year;
	@FindBy(xpath = "//label[text()='Female']")
	static WebElement gender;

	public static void main(String[] args) throws Exception
	{
		initPage();
		openURL();
		Thread.sleep(1000);
		regPage();
		closeURL();

	}

	private static void openURL()
	{

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		try
		{
			driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	private static void closeURL()
	{
		System.out.println("Executed Successfully");
		driver.close();
	}

	private static void initPage()
	{
		PageFactory.initElements(driver, PageFactorFacebook.class);
	}

	private static void regPage()
	{
		registerPage.click();
		firstName.sendKeys("Software");
		lastName.sendKeys("Testing");
		regEmail.sendKeys("7894561230");
		boolean bConfirm = confirmEmail.isDisplayed();
		if (bConfirm == true)
		{
			confirmEmail.sendKeys("softwaretesting@gmail.com");
		}
		pswd.sendKeys("software@123");
		new Select(day).selectByVisibleText("12");
		new Select(month).selectByVisibleText("Jun");
		new Select(year).selectByVisibleText("2013");
		gender.click();

	}

}
