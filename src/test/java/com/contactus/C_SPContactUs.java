package com.contactus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class C_SPContactUs extends BaseClass {
	Actions ac;
	Robot r;

	@Test
	public void Test_A() throws InterruptedException, AWTException {
		getDriver("chrome");
		getUrl("http://wini-dev.winrecall.com/brentwood/contact-us");
		System.out.println("Chrome Browser ");
		ac = new Actions(driver);
		r = new Robot();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000);
//		// Get in Touch
		WebElement get_in_touch = driver.findElement(By.xpath("//h1[text() = 'Get in Touch']"));
		String cssValueget_in_touch = get_in_touch.getCssValue("font-family");
		System.out.println("Header of the Get in Touch:" + cssValueget_in_touch);

		// Have any questions or comments? Let us know!
		WebElement question_comments = driver
				.findElement(By.xpath("//p[text() = 'Have any questions or comments? Let us know!']"));
		String cssValuequestion_comments = question_comments.getCssValue("font-family");
		System.out.println("SubText of the questions or comments:" + cssValuequestion_comments);

		// Get in Touch
		WebElement get_touch = driver.findElement(By.xpath("//h3[text() = 'Get in Touch']"));
		String cssValueget_touch = get_touch.getCssValue("font-family");
		System.out.println("Header of the get_touch:" + cssValueget_touch);

		// Customer Service
		WebElement customer_service = driver.findElement(By.xpath("//h4[text() = 'Customer Service']"));
		String cssValuecustomer_service = customer_service.getCssValue("font-family");
		System.out.println("Header of the Customer Service:" + cssValuecustomer_service);


		// First Name*
		WebElement firstname = driver.findElement(By.xpath("//label[text() = 'First Name*']"));
		String cssValuefirstname = firstname.getCssValue("font-family");
		System.out.println("Header of the First Name:" + cssValuefirstname);

		// Last Name*
		WebElement lastname = driver.findElement(By.xpath("//label[text() = 'Last Name*']"));
		String cssValuelastname = lastname.getCssValue("font-family");
		System.out.println("Header of the Last Name:" + cssValuelastname);

		// Email*
		WebElement email = driver.findElement(By.xpath("//label[text() = 'Email*']"));
		String cssValueemail = email.getCssValue("font-family");
		System.out.println("Header of the Email:" + cssValueemail);

		// Phone Number*
		WebElement phonenumber = driver.findElement(By.xpath("//label[text() = 'Phone Number*']"));
		String cssValuephonenumber = phonenumber.getCssValue("font-family");
		System.out.println("Header of the Phone Number:" + cssValuephonenumber);

		// Zip Code*
		WebElement zipcode = driver.findElement(By.xpath("//label[text() = 'Zip Code*']"));
		String cssValuezipcode = zipcode.getCssValue("font-family");
		System.out.println("Header of the Zip Code:" + cssValuezipcode);

		// Address (optional)
		WebElement address = driver.findElement(By.xpath("//label[text() = 'Address (optional)']"));
		String cssValueaddress = address.getCssValue("font-family");
		System.out.println("Header of the Address (optional):" + cssValueaddress);


		// Message
		WebElement message = driver.findElement(By.xpath("//label[text() = 'Message']"));
		String cssValuemessage = message.getCssValue("font-family");
		System.out.println("Header of the Message:" + cssValuemessage);

		// Get the Latest Insights!
		WebElement latestinsight = driver.findElement(By.xpath("//h3[text() = 'Get the Latest Insights!']"));
		String cssValuelatestinsight = latestinsight.getCssValue("font-family");
		System.out.println("Header of the Latest Insight:" + cssValuelatestinsight);

		// Sign up to stay up to date with latest tips, trends and updates from WIN.
		WebElement signup = driver.findElement(
				By.xpath("//div[@class = 'subscribe_emails_box']//child::p"));
		String cssValuesignup = signup.getCssValue("font-family");
		System.out.println("Header of the signup:" + cssValuesignup);

		// Put Your Trust in the #1 Home Inspection Services Company.
		WebElement trust = driver
				.findElement(By.xpath("//div[@class = 'blue_leftcontent_right_img_footerbanner_wrap']//child::h2"));
		String cssValuetrust = trust.getCssValue("font-family");
		System.out.println("Header of the trust:" + cssValuetrust);
		
		Thread.sleep(3000);
		//Passing values in the field
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Roaylton");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Scott Dugan");
		
		WebElement mailID = driver.findElement(By.xpath("//input[@placeholder='e.g. xyz@abc.com']"));
		mailID.sendKeys("bkathirvel@winhomeoffice.com");
		Thread.sleep(3000);
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='e.g. (123) 456-7890']"));
		phoneNumber.sendKeys("1234567890");
		
		WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='e.g. 39204']"));
		zipCode.sendKeys("12345");
		
		WebElement address1 = driver.findElement(By.xpath("//input[@placeholder='Address']"));
		address1.sendKeys("123 ABC road");
		
		mailID.clear();
		mailID.sendKeys("bkathirvel@winhomeoffice.com");
		Thread.sleep(3000);
		
	
//		WebElement tag = driver.findElement(By.tagName("//div[@class=' css-1dimb5e-singleValue']"));
//		WebElement tag = driver.findElement(By.tagName("//div[@class=' css-hlgwow']/child::div[@class=' css-1dimb5e-singleValue']"));
//		tag.click();
//		
		WebElement submit = driver.findElement(By.xpath("//input[@value='SUBMIT']"));
		submit.click();

         Thread.sleep(10000);
		// Thank you for contacting WIN Home Inspection!
		WebElement thankyou = driver.findElement(By.xpath("//h1[text() = 'Thank you for contacting WIN Home Inspection!']"));
		String cssValuethankyou = thankyou.getCssValue("font-family");
		System.out.println("Header of the tank you:" + cssValuethankyou);
//
//		// We'll be in touch shortly.
		WebElement intouch = driver.findElement(By.xpath("//p[@class = 'sub-text']"));
		String cssValueintouch = intouch.getCssValue("font-family");
		System.out.println("Header of the in touch:" + cssValueintouch);
	    
		//Home
		WebElement home = driver.findElement(By.xpath("//a[@class = 'home-button gradient-btn button_default']"));
		ac.contextClick(home).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		String cssValuehome= home.getCssValue("font-family");
		System.out.println("Header of the in home_inspection:" + cssValuehome);

//
//		// Need a home inspection?
		WebElement home_inspection = driver.findElement(By.xpath("//p[text() = 'Need a home inspection?']"));
		String cssValuehome_inspection = home_inspection.getCssValue("font-family");
		System.out.println("Header of the in home_inspection:" + cssValuehome_inspection);

	}

}
