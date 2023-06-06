package com.sppages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.baseclass.BaseClass;

public class SP_Pages extends BaseClass {
	
	Actions ac;
	Robot r;
	
	@Test
	public  void Test_SPHomepage() throws AWTException, InterruptedException {

		getDriver("chrome");
		String className = System.getenv("SPDEV");
		System.out.println(className);
		getUrl(className);
		ac = new Actions(driver);
		r = new Robot();
		
		System.out.println("Chrome Browser ");
		
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		// Content validation in Header
		WebElement header = driver.findElement(By.xpath("//h1[text()='Best Home Inspectors in Nashville, Franklin,and Brentwood.']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header content : " + cssValueHeader);

		// Sub heading
		WebElement subHeader = driver.findElement(By.xpath("//p[text()='#1 Ranked Home Inspection Company in the US.']"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for SubHeader content : " + cssValueSubHeader);
		
		List<WebElement> headerSubtext1 = driver.findElements(By.xpath("//div[@class='subdetails-container']"));
        for (WebElement webElement : headerSubtext1) {
			String cssValue = webElement.getCssValue("font-family");
			System.out.println("Header Sub-text1 :"+cssValue);
		}
		
//		Component 1
		WebElement c1Text = driver.findElement(By.xpath("//p[@class='left-side']"));
		String cssValueC1Text = c1Text.getCssValue("font-family");
		System.out.println("C1 Header : " + cssValueC1Text);
		  
		WebElement c1Text1 = driver.findElement(By.xpath("//p[@class='right-side']"));
		String cssValueC1Text1 = c1Text1.getCssValue("font-family");
		System.out.println("C1 SubText : " + cssValueC1Text1);
		
		//Component 2 
		WebElement c2Text = driver.findElement(By.xpath("//p[@class='service-area-header']"));
		String cssValueC2Text = c2Text.getCssValue("font-family");
		System.out.println("C2 Header : " + cssValueC2Text);
		  
		WebElement c2Text1 = driver.findElement(By.xpath("//p[text()='WIN Home Inspection offers essential services to homeowners, homebuyers and sellers to help you make an informed decision before purchasing your home, assess repairs and maintenance, lead a healthier life and reduce safety risks while saving money.']"));
		String cssValueC2Text1 = c2Text1.getCssValue("font-family");
		System.out.println("C2 SubText : " + cssValueC2Text1);
		
		WebElement c2Text2 = driver.findElement(By.xpath("//h2[text()='Proudly Serving Your Neighborhood']"));
		String cssValueC2Text2 = c2Text2.getCssValue("font-family");
		System.out.println("C2 Sub-Header : " + cssValueC2Text2);
		
		WebElement c2Text3 = driver.findElement(By.xpath("//p[text()='We offer home inspection services in Nashville, Franklin, Brentwood and surrounding areas.']"));
		String cssValueC2Text3 = c2Text3.getCssValue("font-family");
		System.out.println("C2 SubText1 : " + cssValueC2Text3);
		
		WebElement c2Text4 = driver.findElement(By.xpath("//p[text()='Our inspectors are highly trained and certified professionals specializing in home inspection services including Full Home Inspection, Mold Test and Full Home Inspection. We use the latest tools and technologies to deliver comprehensive, easy-to-read home inspection reports within 24 hours and exceptional customer service to our clients. Our inspectors receive continuing education to stay at the forefront of industry trends and innovation.']"));
		String cssValueC2Text4 = c2Text4.getCssValue("font-family");
		System.out.println("C2 SubText2 : " + cssValueC2Text4);
		
		//ReviewBox
		WebElement c2ReviewBox = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[1]"));
		String cssValueC2ReviewBox = c2ReviewBox.getCssValue("font-family");
		System.out.println("C2 ReviewContent : " + cssValueC2ReviewBox);
		
		WebElement c2ReviewBox1 = driver.findElement(By.xpath("(//div[@class='name'])[1]"));
		String cssValueC2ReviewBox1 = c2ReviewBox1.getCssValue("font-family");
		System.out.println("C2 ReviewerName : " + cssValueC2ReviewBox1);
		
		WebElement c2ReviewBox2 = driver.findElement(By.xpath("(//div[@class='designation'])[1]"));
		String cssValueC2ReviewBox2 = c2ReviewBox2.getCssValue("font-family");
		System.out.println("C2 ReviewerLocation : " + cssValueC2ReviewBox2);
		
		//Learn More About Our Services
		WebElement c2LearnMore = driver.findElement(By.xpath("//a[text()='LEARN MORE ABOUT OUR SERVICES ↓']"));
		ac.contextClick(c2LearnMore).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC2LearnMore = c2LearnMore.getCssValue("font-family");
		System.out.println("C1 LearnMore :"+cssValueC2LearnMore);
		
		
		//Component 3 
		WebElement c3Text = driver.findElement(By.xpath("//p[@class='services-header']"));
		String cssValueC3Text = c3Text.getCssValue("font-family");
		System.out.println("C3 Header : " + cssValueC3Text);
		
		WebElement c3Text1 = driver.findElement(By.xpath("//button[text()='All Services']"));
		String cssValueC3Text1 = c3Text1.getCssValue("font-family");
		System.out.println("C3 Sub-Header : " + cssValueC3Text1);
		
		WebElement c3Text2 = driver.findElement(By.xpath("//button[text()='For Homeowner']"));
		String cssValueC3Text2 = c3Text2.getCssValue("font-family");
		System.out.println("C3 Sub-Header1 : " + cssValueC3Text2);
		
		WebElement c3Text3 = driver.findElement(By.xpath("//button[text()='For HomeSeller']"));
		String cssValueC3Text3 = c3Text3.getCssValue("font-family");
		System.out.println("C3 Sub-Header2 : " + cssValueC3Text3);
		
		WebElement c3Text4 = driver.findElement(By.xpath("//button[text()='For HomeBuyer']"));
		String cssValueC3Text4 = c3Text4.getCssValue("font-family");
		System.out.println("C3 Sub-Header3 : " + cssValueC3Text4);
		
		WebElement c3Text5 = driver.findElement(By.xpath("//div[@class='tabs-subtext']"));
		String cssValueC3Text5 = c3Text5.getCssValue("font-family");
		System.out.println("C3 SubText : " + cssValueC3Text5);
		
		// Services names
	    List <WebElement> c3Text6 = driver.findElements(By.xpath("//span[@class='accordian-title-txt']"));
		for (WebElement webElement : c3Text6) {
			String cssValueC3Text6 = webElement.getCssValue("font-family");
			System.out.println("C3 ServicesName : " + cssValueC3Text6);
		}
	
		// Component 4
		WebElement c4Text = driver.findElement(By.xpath("(//h2[@class='default_size'])[1]"));
		String cssValueC4Text = c4Text.getCssValue("font-family");
		System.out.println("C4 Header : " + cssValueC4Text);

		WebElement c4Text1 = driver.findElement(By.xpath("(//p[@class='default_size '])[1]"));
		String cssValueC4Text1 = c4Text1.getCssValue("font-family");
		System.out.println("C4 SubText : " + cssValueC4Text1);

		// Component 5
		WebElement c5Text = driver.findElement(By.xpath("(//h2[@class='default_size'])[2]"));
		String cssValueC5Text = c5Text.getCssValue("font-family");
		System.out.println("C5 Header : " + cssValueC5Text);

		WebElement c5Text1 = driver.findElement(By.xpath("(//div[@class='win-appliance-recall-1 type25 slider_block_services_title'])[1]"));
		String cssValueC5Text1 = c5Text1.getCssValue("font-family");
		System.out.println("C5 Sub-Header1 : " + cssValueC5Text1);
		
		WebElement c5Text2 = driver.findElement(By.xpath("(//div[@class='win-appliance-recall-1 type25 slider_block_services_title'])[2]"));
		String cssValueC5Text2 = c5Text2.getCssValue("font-family");
		System.out.println("C5 Sub-Header2 : " + cssValueC5Text2);
		
		WebElement c5Text3 = driver.findElement(By.xpath("(//div[@class='win-appliance-recall-1 type25 slider_block_services_title'])[3]"));
		String cssValueC5Text3 = c5Text3.getCssValue("font-family");
		System.out.println("C5 Sub-Header3 : " + cssValueC5Text3);

		

		// component 6
		WebElement c6Text = driver.findElement(By.xpath("//p[text()='Top Rated Home Inspection Company']"));
		String cssValueC6Text = c6Text.getCssValue("font-family");
		System.out.println("C6 Header : " + cssValueC6Text);

		// 2+ Million
		WebElement c6Text1 = driver.findElement(By.xpath("//span[text()='2+ Million']"));
		String cssValueC6Text1 = c6Text1.getCssValue("font-family");
		System.out.println("C6 Sub Header1 : " + cssValueC6Text1);

		WebElement c6Text2 = driver.findElement(By.xpath("//p[text()='Satisfied Clients']"));
		String cssValueC6Text2 = c6Text2.getCssValue("font-family");
		System.out.println("C6 SubText1 : " + cssValueC6Text2);
		
		// Explore the Win Difference
		WebElement c6WinDifference = driver.findElement(By.xpath("(//a[text()='Explore The WIN Difference →'])[1]"));
		ac.contextClick(c6WinDifference).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC6WinDifference = c6WinDifference.getCssValue("font-family");
		System.out.println("C6 HomeBuyers : " + cssValueC6WinDifference);

		// 35+
		WebElement c6Text3 = driver.findElement(By.xpath("//span[text()='35+']"));
		String cssValueC6Text3 = c6Text3.getCssValue("font-family");
		System.out.println("C6 Sub Header2 : " + cssValueC6Text3);

		WebElement c6Text4 = driver.findElement(By.xpath("//p[text()='Services']"));
		String cssValueC6Text4 = c6Text4.getCssValue("font-family");
		System.out.println("C6 SuText2 : " + cssValueC6Text4);

		// 200,000+
		WebElement c6Text5 = driver.findElement(By.xpath("//span[text()='200,000+']"));
		String cssValueC6Text5 = c6Text5.getCssValue("font-family");
		System.out.println("C6 Sub Header3 : " + cssValueC6Text5);

		WebElement c6Text6 = driver.findElement(By.xpath("//p[text()='Trusted REALTORS® ']"));
		String cssValueC6Text6 = c6Text6.getCssValue("font-family");
		System.out.println("C6 SubText3 : " + cssValueC6Text6);

		// component 7
		WebElement c7Text = driver.findElement(By.xpath("(//div[@class='text-box-1'])[2]"));
		String cssValueC7Text = c7Text.getCssValue("font-family");
		System.out.println("C7 Header : " + cssValueC7Text);

		WebElement C7Text1 = driver.findElement(By.xpath(
				"//p[text()='WIN Home Inspectors are the most frequently recommended home inspectors in Nashville by real estate agents, who appreciate our professionalism and consultative approach. "
						+ "They are also able to streamline transactions via our innovative tools and services.']"));
		String cssValueC7Text1 = C7Text1.getCssValue("font-family");
		System.out.println("C7 SubText : " + cssValueC7Text1);

		// Real Estate Dashboard
		WebElement c7SubHeader1 = driver.findElement(By.xpath("(//p[@class='point-header'])[1]"));
		String cssValueC7SubHeader1 = c7SubHeader1.getCssValue("font-family");
		System.out.println("C7 Sub Header1 : " + cssValueC7SubHeader1);

		WebElement c7SubText1 = driver.findElement(By.xpath("(//p[@class='point-description'])[1]"));
		String cssValueC7SubText1 = c7SubText1.getCssValue("font-family");
		System.out.println("C7 SubText1 : " + cssValueC7SubText1);

		// WIN360
		WebElement c7SubHeader2 = driver.findElement(By.xpath("(//p[@class='point-header'])[2]"));
		String cssValueC7SubHeader2 = c7SubHeader2.getCssValue("font-family");
		System.out.println("C7 Sub Header2 : " + cssValueC7SubHeader2);

		WebElement c7SubText2 = driver.findElement(By.xpath("(//p[@class='point-description'])[2]"));
		String cssValueC7SubText2 = c7SubText2.getCssValue("font-family");
		System.out.println("C7 SubText2 : " + cssValueC7SubText2);

		// ReviewBox
		WebElement c7ReviewBox = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[3]"));
		String cssValueC7ReviewBox = c7ReviewBox.getCssValue("font-family");
		System.out.println("C7 ReviewContent : " + cssValueC7ReviewBox);

		WebElement c7ReviewerName = driver.findElement(By.xpath("(//div[@class='name'])[3]"));
		String cssValueC7ReviewerName = c7ReviewerName.getCssValue("font-family");
		System.out.println("C7 ReviewerName : " + cssValueC7ReviewerName);

		WebElement c7ReviewText = driver.findElement(By.xpath("(//div[@class='designation'])[3]"));
		String cssValueC7ReviewText = c7ReviewText.getCssValue("font-family");
		System.out.println("C7 Review Text Designation : " + cssValueC7ReviewText);

		// Learn More
		WebElement c7LearnMore = driver.findElement(By.xpath("//a[text()='LEARN MORE →']"));
		ac.contextClick(c7LearnMore).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC7LearnMore = c7LearnMore.getCssValue("font-family");
		System.out.println("C7 Learn More : " + cssValueC7LearnMore);

		// component 8
		WebElement c8Text = driver.findElement(By.xpath("(//h2[@class='default_size'])[4]"));
		String cssValueC8Text = c8Text.getCssValue("font-family");
		System.out.println("C8 Header : " + cssValueC8Text);

		WebElement c8Text1 = driver.findElement(By.xpath("//p[text()='32,000+']"));
		String cssValueC8Text1 = c8Text1.getCssValue("font-family");
		System.out.println("C8 Sub Header1 : " + cssValueC8Text1);

		WebElement c8Text2 = driver.findElement(By.xpath("//p[text()='(5-Star Reviews)']"));
		String cssValueC8Text2 = c8Text2.getCssValue("font-family");
		System.out.println("C8 SubText2 : " + cssValueC8Text2);

		// Book AN Inspection
		WebElement c8BookAnInspection = driver.findElement(By.xpath("(//a[text()='BOOK AN INSPECTION'])[1]"));
		ac.contextClick(c8BookAnInspection).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC8BookAnInspection = c8BookAnInspection.getCssValue("font-family");
		System.out.println("C8 Book An Inspection : " + cssValueC8BookAnInspection);

		// component 9
		WebElement c9Text = driver
				.findElement(By.xpath("(//h2[text()='WIN Home Inspection: Redefining Home Inspection'])"));
		String cssValueC9Text = c9Text.getCssValue("font-family");
		System.out.println("C9 Header : " + cssValueC9Text);

		List<WebElement> c9Services = driver
				.findElements(By.xpath("//p[@class='identify-major-and-m valign-text-middle default_size']"));
		for (WebElement c9ServicesName : c9Services) {
			String cssValueC9ServicesName = c9ServicesName.getCssValue("font-family");
			System.out.println("C9 Services Name : " + cssValueC9ServicesName);

		}

		WebElement c9BookAnInspection = driver.findElement(By.xpath("(//a[text()='BOOK AN INSPECTION'])[2]"));
		ac.contextClick(c9BookAnInspection).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC9BookAnInspection = c9BookAnInspection.getCssValue("font-family");
		System.out.println("C8 Book An Inspection : " + cssValueC9BookAnInspection);

		// Year Number 30
		WebElement c9SubHeader1 = driver.findElement(By.xpath("//div[@class='year-number']"));
		String cssValueC9SubHeader1 = c9SubHeader1.getCssValue("font-family");
		System.out.println("C9 Sub Header1 : " + cssValueC9SubHeader1);

		WebElement c9SubText1 = driver.findElement(By.xpath("//div[@class='text']"));
		String cssValueC9SubText1 = c9SubText1.getCssValue("font-family");
		System.out.println("C9 SubTExt1 : " + cssValueC9SubText1);

		// component 10
		WebElement c10Text = driver.findElement(By.xpath("//p[text()='Certified Home Inspectors Near You in null '] "));
		String cssValueC10Text = c10Text.getCssValue("font-family");
		System.out.println("C10 Header : " + cssValueC10Text);

//		WebElement c10SubText = driver.findElement(By.xpath("Highly trained and experienced, Mike Hankins  and  his  team  are your local,  and Licensed and certified home inspectors with WIN, which has a track record of providing top-rated customer service for 30 years nationwide. Your journey toward peace of mind begins the moment you schedule your home inspection, which is quick and easy! "));
//		String cssValueC10SubText = c10SubText.getCssValue("font-family");
//		System.out.println("C10 SubText : " + cssValueC10SubText);

		WebElement c10Text1 = driver.findElement(By.xpath("(//p[text()='8,500+'])[1]"));
		String cssValueC10Text1 = c10Text1.getCssValue("font-family");
		System.out.println("C10 Sub Header1 : " + cssValueC10Text1);

		WebElement c10Text2 = driver.findElement(By.xpath("(//p[@class='description'])[1]"));
		String cssValueC10Text2 = c10Text2.getCssValue("font-family");
		System.out.println("C10 SubText1 : " + cssValueC10Text2);

		WebElement c10Text3 = driver.findElement(By.xpath("(//p[text()='630+'])[1]"));
		String cssValueC10Text3 = c10Text3.getCssValue("font-family");
		System.out.println("C10 Sub Header2 : " + cssValueC10Text3);

		WebElement c10Text4 = driver.findElement(By.xpath("(//p[@class='description'])[2]"));
		String cssValueC10Text4 = c10Text4.getCssValue("font-family");
		System.out.println("C10 SubText2 : " + cssValueC10Text4);

		// Component 11 (Meet the WIN Team)
		WebElement c11meetWinTeam = driver.findElement(By.xpath("//div[text()='Meet the WIN Team']"));
		String cssValueC11MeetWinTeam = c11meetWinTeam.getCssValue("font-family");
		System.out.println("Meet the Win Team : " + cssValueC11MeetWinTeam);

		// component 12
		
		WebElement c12Text1 = driver.findElement(By.xpath("//div[@class='package_bundle_section_top']//child::h2"));
		String cssValueC12Text1 = c12Text1.getCssValue("font-family");
		System.out.println("C12  Header : " + cssValueC12Text1);
		
		WebElement c12Text2 = driver.findElement(By.xpath("//div[@class='package_bundle_section_top']//child::p"));
		String cssValueC12Text2 = c12Text2.getCssValue("font-family");
		System.out.println("C12  Sub-Header : " + cssValueC12Text2);
		
		WebElement c12PricingPlans = driver.findElement(By.xpath("//div[text()='Pricing Plans']"));
		String cssValueC12PricingPlans = c12PricingPlans.getCssValue("font-family");
		System.out.println("C12 Pricing Plans : " + cssValueC12PricingPlans);

		WebElement c12Header = driver.findElement(By.xpath("//h3[text()='Save More With Bundles']"));
		String cssValueC12Header = c12Header.getCssValue("font-family");
		System.out.println("C12 Header : " + cssValueC12Header);

		WebElement c12SubText = driver.findElement(By.xpath(
				"//p[text()='Donec massa sapien faucibus molestie ac Volutpat maecenas volutpat blandit etiam. Venenatis.']"));
		String cssValueC12SubText = c12SubText.getCssValue("font-family");
		System.out.println("C12 SubText : " + cssValueC12SubText);

		// Read More
		WebElement c12ReadMore = driver.findElement(By.xpath("//a[text()='Read More']"));
		ac.contextClick(c12ReadMore).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC12ReadMore = c12ReadMore.getCssValue("font-family");
		System.out.println("C12 ReadMore : " + cssValueC12ReadMore);

		// component 13
		// Test Packages
		List<WebElement> c13PlanName = driver.findElements(By.xpath("//div[@class='plan_name']"));
		for (WebElement c13PackageName : c13PlanName) {
			String cssValueC13PackageName = c13PackageName.getCssValue("font-family");
			System.out.println("C13 Package Name : " + cssValueC13PackageName);
		}

		// Price
		List<WebElement> c13Price = driver.findElements(By.xpath("//div[@class='plan_price']"));
		for (WebElement c13PricePlan : c13Price) {
			String cssValueC13PricePlan = c13PricePlan.getCssValue("font-family");
			System.out.println("C13 Price Plan : " + cssValueC13PricePlan);
		}

		// Package Text
		List<WebElement> c13PackageText = driver.findElements(By.xpath("//ul[@class='package_bundle_list_blue']"));
		for (WebElement c13PackageTextName : c13PackageText) {
			String cssValueC13PackageTextName = c13PackageTextName.getCssValue("font-family");
			System.out.println("C13 Package Text : " + cssValueC13PackageTextName);
		}

		// BookNow
		List<WebElement> c13BookNow = driver.findElements(By.xpath("//a[@class='outline_btn']"));
		for (WebElement c13BookNowButton : c13BookNow) {
			String cssValueC13BookNowButton = c13BookNowButton.getCssValue("font-family");
			System.out.println("C13 Book Now : " + cssValueC13BookNowButton);
		}

		// component 14
		WebElement c14Text = driver.findElement(By.xpath("//h2[text()='WIN Home Inspection Reviews']"));
		String cssValueC14Text = c14Text.getCssValue("font-family");
		System.out.println("C14 Header : " + cssValueC14Text);

		WebElement c14BookAnInspection = driver.findElement(By.xpath("(//a[text()='BOOK AN INSPECTION'])[3]"));
		ac.contextClick(c14BookAnInspection).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC14BookAnInspection = c14BookAnInspection.getCssValue("font-family");
		System.out.println("C14 Book An Inspection : " + cssValueC14BookAnInspection);

		// ReviewBox
		WebElement c14ReviewBox = driver.findElement(By.xpath("(//div[text()='Very thorough in what they do!'])[1]"));
		String cssValueC14ReviewBox = c14ReviewBox.getCssValue("font-family");
		System.out.println("C14 Review Box : " + cssValueC14ReviewBox);

		WebElement c14ReviewName = driver.findElement(By.xpath("(//div[text()='Andy Kellar'])[1]"));
		String cssValueC14ReviewName = c14ReviewName.getCssValue("font-family");
		System.out.println("C14 Review Name : " + cssValueC14ReviewName);

		// WIN Home Inspection
		WebElement c14SubHeader = driver.findElement(By.xpath("//p[text()='WIN Home Inspection']"));
		String cssValueC14SubHeader = c14SubHeader.getCssValue("font-family");
		System.out.println("C14 Sub Header : " + cssValueC14SubHeader);

		WebElement c14Rating = driver.findElement(By.xpath("//p[text()='4.9']"));
		String cssValueC14Rating = c14Rating.getCssValue("font-family");
		System.out.println("C14 Rating : " + cssValueC14Rating);

		WebElement c14SubText = driver.findElement(By.xpath("//p[text()='Home Inspector']"));
		String cssValueC14SubText = c14SubText.getCssValue("font-family");
		System.out.println("C14 SubText : " + cssValueC14SubText);

		WebElement c14ContactUs = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		ac.contextClick(c14ContactUs).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC14ContactUs = c14ContactUs.getCssValue("font-family");
		System.out.println("C14 Contact Us : " + cssValueC14ContactUs);

		// component 15
		WebElement c15Text = driver.findElement(By.xpath("//h2[@class='ready-to-gain-peace default_size']"));
		String cssValueC15Text = c15Text.getCssValue("font-family");
		System.out.println("C15 Header : " + cssValueC15Text);

		WebElement c15Text1 = driver.findElement(By.xpath("//a[text()='FIND YOU HOME INSPECTOR']"));
		ac.contextClick(c15Text1).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC15Text1 = c15Text1.getCssValue("font-family");
		System.out.println("C15 FIND YOU HOME INSPECTOR " + cssValueC15Text1);

	}
	@Test
	public  void Test_SPRealEstate() throws InterruptedException, AWTException {
		
		getDriver("chrome");
		String className = System.getenv("SPDEV");
		System.out.println(className);
		getUrl(className+"/real-estate-professional");
		ac = new Actions(driver);
		r = new Robot();
		
		Actions ac = new Actions(driver);
		Robot r = new Robot();

		Thread.sleep(3000);
		WebElement header = driver.findElement(By.xpath("//h1[@class='heading banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header Content : " + cssValueHeader);

		WebElement subHeader = driver.findElement(By.xpath("//p[@class='sub-heading banner_sub_heading']"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for SubHeader Content : " + cssValueSubHeader);

		// component 1
		WebElement c1Text = driver.findElement(By.xpath("//h2[@class='gradient-heading']"));
		String cssValueC1Text = c1Text.getCssValue("font-family");
		System.out.println("C1 Header : " + cssValueC1Text);

		WebElement c1Text1 = driver.findElement(By.xpath("//div[@class='content-container']"));
		String cssValueC1Text1 = c1Text1.getCssValue("font-family");
		System.out.println("C1 SubText : " + cssValueC1Text1);

		// component 2
		WebElement c2Text = driver.findElement(By.xpath("//h2[@class='be-a-savvy-homebuyer black-heading-inner']"));
		String cssValueC2Text = c2Text.getCssValue("font-family");
		System.out.println("C2 Sub Header : " + cssValueC2Text);

		WebElement c2Text1 = driver.findElement(By.xpath("//p[@class='get-to-know-your-hom ']"));
		String cssValueC2Text1 = c2Text1.getCssValue("font-family");
		System.out.println("C2 SubText : " + cssValueC2Text1);

		List<WebElement> c2Services = driver.findElements(By.xpath("//p[@class='identify-major-and-m valign-text-middle default_size']"));
		for (WebElement c2ServicesName : c2Services) {
			String cssValueC2ServicesName = c2ServicesName.getCssValue("font-family");
			System.out.println("C2 ServicesName : " + cssValueC2ServicesName);
		}
		
		// Button An Inspection
		WebElement c2ButtonAnInspection = driver
				.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[1]"));
		ac.contextClick(c2ButtonAnInspection).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC2ButtonAnInspection = c2ButtonAnInspection.getCssValue("font-family");
		System.out.println("C2 Book An Inspection : " + cssValueC2ButtonAnInspection);

		// Year Number
		WebElement c2YearNumber = driver.findElement(By.xpath("//div[@class='year-number']"));
		String cssValueC2YearNumber = c2YearNumber.getCssValue("font-family");
		System.out.println("C2 Year Number : " + cssValueC2YearNumber);

		// Year Of Legacy
		WebElement c2YearOfLegacy = driver.findElement(By.xpath("//div[@class='text']"));
		String cssValueC2YearOfLegacy = c2YearOfLegacy.getCssValue("font-family");
		System.out.println("C2 Year Of Legacy : " + cssValueC2YearOfLegacy);

		// component 3
		WebElement c3Text = driver.findElement(By.xpath("//h2[@class='black-heading']"));
		String cssValueC3Text = c3Text.getCssValue("font-family");
		System.out.println("C3 Sub Header : " + cssValueC3Text);

		// For Home Buyers
		WebElement c3ForHomeBuyers = driver.findElement(By.xpath("//button[@class='active']"));
		String cssValueC3ForHomeBuyers = c3ForHomeBuyers.getCssValue("font-family");
		System.out.println("C3 For Home Buyers : " + cssValueC3ForHomeBuyers);

		WebElement c3SubText1 = driver.findElement(By.xpath("//p[@class='tabs-subtext']"));
		String cssValueC3SubText1 = c3SubText1.getCssValue("font-family");
		System.out.println("C3 SubText1 : " + cssValueC3SubText1);

		List<WebElement> c3Services1 = driver.findElements(By.xpath("//div[@class='accordian-title']"));
		for (WebElement c3ServicesName1 : c3Services1) {
			String cssValueC3ServicesName1 = c3ServicesName1.getCssValue("font-family");
			System.out.println("C3 ServicesName1 : " + cssValueC3ServicesName1);
		}

		// Learn More About Home Buyer Services
		WebElement c3LearnMoreBuyer = driver
				.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[1]"));
		ac.contextClick(c3LearnMoreBuyer).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC3LearnMoreBuyer = c3LearnMoreBuyer.getCssValue("font-family");
		System.out.println("C3 Learn More About Home Buyer Services : " + cssValueC3LearnMoreBuyer);

		// For Home Sellers
		WebElement c3ForHomeSellers = driver.findElement(By.xpath("//button[text()='FOR HOME SELLERS']"));
		ac.moveToElement(c3ForHomeSellers).click();
		String cssValueC3ForHomeSellers = c3ForHomeSellers.getCssValue("font-family");
		System.out.println("C3 For Home Sellers : " + cssValueC3ForHomeSellers);

		WebElement c3SubText2 = driver.findElement(By.xpath("//p[@class='tabs-subtext']"));
		String cssValueC3SubText2 = c3SubText2.getCssValue("font-family");
		System.out.println("C3 SubText2 : " + cssValueC3SubText2);

		List<WebElement> c3Services2 = driver.findElements(By.xpath("//span[@class='accordian-title-txt']"));
		for (WebElement c3ServicesName2 : c3Services2) {
			String cssValueC3ServicesName2 = c3ServicesName2.getCssValue("font-family");
			System.out.println("C3 ServicesName2 : " + cssValueC3ServicesName2);

		}

		// Learn More About Home Seller Services
//		WebElement c3LearnMoreSeller = driver.findElement(By.xpath("//a[text()='Learn More about Home Seller Services']"));
//		ac.contextClick(c3LearnMoreSeller).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		String cssValueC3LearnMoreSeller = c3LearnMoreSeller.getCssValue("font-family");
//		System.out.println("C3 Learn More About Home Seller Services : " + cssValueC3LearnMoreSeller);

		// component 4
		WebElement c4Text = driver
				.findElement(By.xpath("(//h2[@class='black-heading-inner'])[1]"));
		String cssValueC4Text = c4Text.getCssValue("font-family");
		System.out.println("C4 Header : " + cssValueC4Text);

		// C4 SubText

		// component 5
		WebElement c5Header1 = driver.findElement(By.xpath("//h3[text()='200,000+']"));
		String cssValueC5Header1 = c5Header1.getCssValue("font-family");
		System.out.println("C5 Header1 : " + cssValueC5Header1);

		WebElement c5SubText1 = driver.findElement(By.xpath("//p[text()='Trusted REALTORS® ']"));
		String cssValueC5SubText1 = c5SubText1.getCssValue("font-family");
		System.out.println("C5 SubText1 : " + cssValueC5SubText1);

		WebElement c5Header2 = driver.findElement(By.xpath("//h3[text()='45+']"));
		String cssValueC5Header2 = c5Header2.getCssValue("font-family");
		System.out.println("C5 Header2 : " + cssValueC5Header2);

		WebElement c5SubText2 = driver.findElement(By.xpath("//p[text()='States']"));
		String cssValueC5SubText2 = c5SubText2.getCssValue("font-family");
		System.out.println("C5 SubText2 : " + cssValueC5SubText2);

		WebElement c5Header3 = driver.findElement(By.xpath("//h3[text()='2 Million+']"));
		String cssValueC5Header3 = c5Header3.getCssValue("font-family");
		System.out.println("C5 Header3 : " + cssValueC5Header3);

		WebElement c5SubText3 = driver.findElement(By.xpath("//p[text()='Satisfied Clients']"));
		String cssValueC5SubText3 = c5SubText3.getCssValue("font-family");
		System.out.println("C5 SubText3 : " + cssValueC5SubText3);

		WebElement c5Review = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[2]"));
		String cssValueC5Review = c5Review.getCssValue("font-family");
		System.out.println("C5 Review : " + cssValueC5Review);

		WebElement c5ReviewName = driver.findElement(By.xpath("(//div[text()='Shawne Schulz'])[2]"));
		String cssValueC5ReviewName = c5ReviewName.getCssValue("font-family");
		System.out.println("C5 ReviewName : " + cssValueC5ReviewName);

		// Learn about the WIN Real Estate Dashboard
		WebElement c5EstateDashboard = driver.findElement(By.xpath("(//a[@class='btn-with-arrow darrow'])[2]"));
		ac.contextClick(c5EstateDashboard).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC5EstateDashboard = c5EstateDashboard.getCssValue("font-family");
		System.out.println("C5 Learn about the WIN Real Estate Dashboard : " + cssValueC5EstateDashboard);

		// component 6
		WebElement c6Text = driver.findElement(By.xpath(
				"//h3[text()='Did you know? Home listings with 3D virtual tours and 2D floor plans sell 31% faster! ']"));
		String cssValueC6Text = c6Text.getCssValue("font-family");
		System.out.println("C6 Header : " + cssValueC6Text);
		
		//Win 360
		WebElement c6Win360 = driver.findElement(By.xpath("//a[@class='white_btn']"));
		ac.contextClick(c6Win360).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC6Win360 = c6Win360.getCssValue("font-family");
		System.out.println("C5 Learn about the WIN Real Estate Dashboard : " + cssValueC6Win360);

		WebElement c6Text1 = driver.findElement(By.xpath("(//h2[text()='WIN Real Estate Dashboard '])[1]"));
		String cssValueC6Text1 = c6Text1.getCssValue("font-family");
		System.out.println("C6 Sub Header1 : " + cssValueC6Text1);

		WebElement c6SubText1 = driver.findElement(By.xpath(
				"(//p[text()='Designed with real estate agents in mind, the Real Estate Dashboard enables you to schedule inspections, view past inspection reports, and create a repair request list at your fingertips. '])[1]"));
		String cssValueC6SubText1 = c6SubText1.getCssValue("font-family");
		System.out.println("C6 SubText1 : " + cssValueC6SubText1);

		WebElement c6SubText2 = driver
				.findElement(By.xpath("//li[text()='Access your personalized dashboard anywhere, anytime']"));
		String cssValueC6SubText2 = c6SubText2.getCssValue("font-family");
		System.out.println("C6 SubText2 : " + cssValueC6SubText2);

		WebElement c6SubText3 = driver.findElement(By.xpath(
				"//li[text()='Easily stay connected with your WIN home inspector,  view past inspections and schedule new appointment instantly']"));
		String cssValueC6SubText3 = c6SubText3.getCssValue("font-family");
		System.out.println("C6 SubText3 : " + cssValueC6SubText3);

		WebElement c6SubText4 = driver.findElement(By.xpath(
				"//li[text()='Answer client question confidently with relevant information at your fingertips']"));
		String cssValueC6SubText4 = c6SubText4.getCssValue("font-family");
		System.out.println("C6 SubText4 : " + cssValueC6SubText4);
		
		// Get Started
		WebElement c6Get = driver.findElement(By.xpath("//a[text()='GET STARTED']"));
		ac.contextClick(c6Get).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC6Get = c6Get.getCssValue("font-family");
		System.out.println("C6 Get Started : " + cssValueC6Get);
		
		// Watch Video
//		WebElement c6Video = driver.findElement(By.xpath("//img[@alt='play']"));
//		c6Video.click();
		
		

		// 200,000+ Trusted REALTORS®
		WebElement badge = driver.findElement(By.xpath("//span[@class='badge']"));
		String cssValueBadge = badge.getCssValue("font-family");
		System.out.println("200,000+ Trusted REALTORS® : " + cssValueBadge);

		// component 7
		WebElement c7Text = driver
				.findElement(By.xpath("//h2[text()='3D Tours and 2D Floor Plans. That’s the Power of WIN360!']"));
		String cssValueC7Text = c7Text.getCssValue("font-family");
		System.out.println("C7 Header : " + cssValueC7Text);

		WebElement c7SubText = driver.findElement(By.xpath(
				"//p[text()='Homes with 3D Tours are saved 50% more by Zillow users. With WIN360, potential buyers can walk through your home anytime, anywhere. Paired with drone technology, home sellers can showcase their homes to buyers like never before, highlighting the property and exterior features to build trust, gain a listing advantage and sell their home faster.']"));
		String cssValueC7SubText = c7SubText.getCssValue("font-family");
		System.out.println("C7 SubText : " + cssValueC7SubText);

		// Book WIN360
		WebElement c7BookWin360 = driver.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[3]"));
		ac.contextClick(c7BookWin360).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC7BookWin360 = c7BookWin360.getCssValue("font-family");
		System.out.println("C7 BookWin360 : " + cssValueC7BookWin360);

		// LearnMore
		WebElement c7LearnMore = driver.findElement(By.xpath("//a[text()='LEARN MORE']"));
		ac.contextClick(c7LearnMore).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC7LearnMore = c7LearnMore.getCssValue("font-family");
		System.out.println("C7 Learn More : " + cssValueC7LearnMore);

		// component 8
		WebElement c8Text = driver.findElement(By.xpath("//h2[@class='our-customerslove-us']"));
		String cssValueC8Text = c8Text.getCssValue("font-family");
		System.out.println("C8 Header : " + cssValueC8Text);

		WebElement c8Review1 = driver.findElement(By.xpath("(//div[text()='Lee was great to work with. Very professional and thorough. Would highly recommend! Thanks again!'])[1]"));
		String cssValueC8Review1 = c8Review1.getCssValue("font-family");
		System.out.println("C8 Review1 : " + cssValueC8Review1);

		WebElement c8ReviewName1 = driver.findElement(By.xpath("(//div[text()='Geoff Kukula'])[1]"));
		String cssValueC8ReviewName1 = c8ReviewName1.getCssValue("font-family");
		System.out.println("C8 Review Name1 : " + cssValueC8ReviewName1);

		WebElement c8Review2 = driver.findElement(By.xpath("(//div[text()='All of the above. They made it convenient for me and were very thorough! I highly recommend them.'])[1]"));
		String cssValueC8Review2 = c8Review2.getCssValue("font-family");
		System.out.println("C8 Review2 : " + cssValueC8Review2);

		WebElement c8ReviewName2 = driver.findElement(By.xpath("(//div[text()='Lance Easley'])[1]"));
		String cssValueC8ReviewName2 = c8ReviewName2.getCssValue("font-family");
		System.out.println("C8 Review Name2 : " + cssValueC8ReviewName2);

		WebElement c8Review3 = driver.findElement(By.xpath("(//div[text()='Mike was knowledgeable and pleasant to work with. Highly recommend WIN and Mike.'])[1]"));
		String cssValueC8Review3 = c8Review3.getCssValue("font-family");
		System.out.println("C8 Review3 : " + cssValueC8Review3);

		WebElement c8ReviewName3 = driver.findElement(By.xpath("(//div[text()='Ryan Thompson'])[1]"));
		String cssValueC8ReviewName3 = c8ReviewName3.getCssValue("font-family");
		System.out.println("C8 Review Name3 : " + cssValueC8ReviewName3);
		
		// Book An Inspection
		WebElement c8BookAnInspection = driver.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[4]"));
		ac.contextClick(c8BookAnInspection).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC8BookAnInspection = c8BookAnInspection.getCssValue("font-family");
		System.out.println("C8 BookWin360 : " + cssValueC8BookAnInspection);

		// component 9
		WebElement c9Text = driver.findElement(By.xpath("//h2[@class='heading blue-heading']"));
		String cssValueC9Text = c9Text.getCssValue("font-family");
		System.out.println("C9 Header : " + cssValueC9Text);

		List<WebElement> c9SubText = driver.findElements(By.xpath("//div[@class=' accordion-wrapper']"));
		for (WebElement c9SubTextName : c9SubText) {
			String cssValueC9SubTextName = c9SubTextName.getCssValue("font-family");
			System.out.println("C9 SubText Name : " + cssValueC9SubTextName);
		}
			
		//Component 10
		WebElement c10Text = driver.findElement(By.xpath("//h2[@class='ready-to-gain-peace default_size']"));
		String cssValueC10Text = c10Text.getCssValue("font-family");
		System.out.println("C10 Header : " + cssValueC10Text);
     
		// Book An Inspection
		WebElement c10BookAnInspection = driver.findElement(By.xpath("//a[@class='explore-all-services gold-btn button_default']"));
		ac.contextClick(c10BookAnInspection).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC10BookAnInspection = c10BookAnInspection.getCssValue("font-family");
		System.out.println("C10 BookAnInspection : " + cssValueC10BookAnInspection);
	}

	@Test
	public void Test_SPHomeSeller() throws InterruptedException, AWTException {
//		getDriver("chrome");
		String className = System.getenv("SPDEV");
		System.out.println(className);
		getUrl(className+"/home-seller");
		ac = new Actions(driver);
		r = new Robot();
		
		ac = new Actions(driver);
		r = new Robot();
//   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          Thread.sleep(3000);
		// Content validation in Header
		WebElement header = driver.findElement(By.xpath("//h1[@class='heading banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header : " + cssValueHeader);
//
//		// Sub heading
		
		WebElement subHeader = driver.findElement(By.xpath("(//p[@class='sub-heading banner_sub_heading'])"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for Sub-Header : " + cssValueSubHeader);

//		// Book An Inspection in Header
//		WebElement bookAnInspection = driver.findElement(By.xpath("//button[@class='booking-button']"));
//		bookAnInspection.click();
//		Thread.sleep(3000);
//		WebElement close = driver.findElement(By.xpath("//div[@class='close-btn']"));
//		close.click();

		// Component 1
		WebElement c1Text = driver.findElement(By.xpath("//h2[@class='gradient-heading']"));
		String cssValueC1Text = c1Text.getCssValue("font-family");
		System.out.println("C1 Header : " + cssValueC1Text);

		WebElement c1Text1 = driver.findElement(By.xpath("//div[@class='secondary-titles']/child::div[@class='content-container']/child::p[1]"));
		String cssValueC1Text1 = c1Text1.getCssValue("font-family");
		System.out.println("C1 SubText : " + cssValueC1Text1);

		// 'Learn more about Home Seller Services
		WebElement c1HomeSellerServices = driver.findElement(By.xpath("(//a[text()='Learn more about Home Seller Services ↓'])[1]"));
		ac.contextClick(c1HomeSellerServices).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC1HomeSellerServices = c1HomeSellerServices.getCssValue("font-family");
		System.out.println("C1 HomeSellerServices : " + cssValueC1HomeSellerServices);

		// Component 2
		WebElement c2Text = driver.findElement(By.xpath("//h2[@class='be-a-savvy-homebuyer black-heading-inner']"));
		String cssValueC2Text = c2Text.getCssValue("font-family");
		System.out.println("C2 Header : " + cssValueC2Text);

		WebElement c2Text1 = driver.findElement(By.xpath("//p[@class='get-to-know-your-hom ']"));
		String cssValueC2Text1 = c2Text1.getCssValue("font-family");
		System.out.println("C2 SubText : " + cssValueC2Text1);

		// Review Box
		WebElement c2ReviewBox = driver.findElement(By.xpath("//div[@class='card-desription_inner']"));
		String cssValueC2ReviewBox = c2ReviewBox.getCssValue("font-family");
		System.out.println("C2 ReviewBox : " + cssValueC2ReviewBox);
		
		WebElement c2Reviews1 = driver.findElement(By.xpath("(//div[@class='name'])[1]"));
		String cssValueC2Reviews1 = c2Reviews1.getCssValue("font-family");
		System.out.println("C2 ReviewerName : " + cssValueC2Reviews1);

		List<WebElement> c2Text2 = driver.findElements(By.xpath("//div[@class='item']"));
		for (WebElement webElement : c2Text2) {
			String cssValueC2Text3 = webElement.getCssValue("font-family");
			System.out.println("C2 SubText1 : " + cssValueC2Text3);
		}
//		 Book An Inspection
		WebElement c2BookAnInspection = driver.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[1]"));
		ac.contextClick(c2BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC2BookAnInspection = c2BookAnInspection.getCssValue("font-family");
		System.out.println("C2 BookAnInspection : " + cssValueC2BookAnInspection);

		// Component 3
		WebElement c3Text = driver.findElement(By.xpath("//h3[@class='virtual-tour-header black-heading-inner']"));
		String cssValueC3Text = c3Text.getCssValue("font-family");
		System.out.println("C3 Header : " + cssValueC3Text);

		WebElement c3Text1 = driver.findElement(By.xpath("//p[@class='virtual-tour-subtext']"));
		String cssValueC3Text1 = c3Text1.getCssValue("font-family");
		System.out.println("C3 SubText1 : " + cssValueC3Text1);

		List<WebElement> c3Text2 = driver.findElements(By.xpath("//h5[@class='why-card-header gradient-heading']"));
		for (WebElement webElement : c3Text2) {
			String cssValueC3Text2 = webElement.getCssValue("font-family");
			System.out.println("C3 SubHeaders : " + cssValueC3Text2);
		}
		List<WebElement> c3Text3 = driver.findElements(By.xpath("//div[@class='why-card-text-wrapper']"));
		for (WebElement webElement : c3Text3) {
			String cssValueC3Text3 = webElement.getCssValue("font-family");
			System.out.println("C3 SubText : " + cssValueC3Text3);
		}
		// Learn more about WIN360 
		WebElement c3Win360 = driver.findElement(By.xpath("//a[@class='win-360-link btn-with-arrow rarrow']"));
		ac.contextClick(c3Win360).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC3Win360 = c3Win360.getCssValue("font-family");
		System.out.println("C3 Hyperlink : " + cssValueC3Win360);

		// Component 4
		WebElement c4Text = driver.findElement(By.xpath("//div[@class='home_highly_rated_banner_inner']/child::h3"));
		String cssValueC4Text = c4Text.getCssValue("font-family");
		System.out.println("C4 Header : " + cssValueC4Text);

		WebElement c4Text1 = driver.findElement(By.xpath("//div[@class='heading-margin description']"));
		String cssValueC4Text1 = c4Text1.getCssValue("font-family");
		System.out.println("C4 SubText1 : " + cssValueC4Text1);
		
//		 Book An Inspection
//		WebElement c4BookAnInspection = driver.findElement(By.xpath("//button[@class='white_btn']"));
//		ac.contextClick(c4BookAnInspection).perform();
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		String cssValueC4BookAnInspection = c4BookAnInspection.getCssValue("font-family");
//		System.out.println("C4 BookAnInspection : " + cssValueC4BookAnInspection);



		// Component 5
		WebElement c5Text = driver.findElement(By.xpath("(//h2[@class='black-heading'])[1]"));
		String cssValueC5Text = c5Text.getCssValue("font-family");
		System.out.println("C5 Header : " + cssValueC5Text);

		WebElement c5Text1 = driver.findElement(By.xpath("(//p[@class='desktop-readmore'])[1]"));
		String cssValueC5Text1 = c5Text1.getCssValue("font-family");
		System.out.println("C5 SubText1 : " + cssValueC5Text1);
		
		List<WebElement> c5Services = driver.findElements(By.xpath("//span[@class='accordian-title-txt']"));
		for (WebElement webElement : c5Services) {
			String cssValueC5Services = webElement.getCssValue("font-family");
			System.out.println("C5 Services : " + cssValueC5Services);
		}
	
		// Component 6
		WebElement c6Text = driver.findElement(By.xpath("(//h2[@class='black-heading'])[2]"));
		String cssValueC6Text = c6Text.getCssValue("font-family");
		System.out.println("C6 Header : " + cssValueC6Text);

		WebElement c6Text1 = driver.findElement(By.xpath("(//p[@class='desktop-readmore'])[2]"));
		String cssValueC6Text1 = c6Text1.getCssValue("font-family");
		System.out.println("C6 SubText1 : " + cssValueC6Text1);

		// Component 7
		WebElement c7Text = driver.findElement(By.xpath("(//h2[@class='black-heading'])[3]"));
		String cssValueC7Text = c7Text.getCssValue("font-family");
		System.out.println("C7 Header : " + cssValueC7Text);
		
		List <WebElement> c7Text1 = driver.findElements(By.xpath("//div[@class='icon-box']//child::p"));
		for (WebElement webElement : c7Text1) {
			String cssValueC7Text1 = webElement.getCssValue("font-family");
			System.out.println("C7 SubText : " + cssValueC7Text1);
		}
		// Book An Inspection
		WebElement c7BookAnInspection = driver.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[2]"));
		ac.contextClick(c7BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC7BookAnInspection = c7BookAnInspection.getCssValue("font-family");
		System.out.println("C7 BookAnInspection : " + cssValueC7BookAnInspection);

		// Component 8
		WebElement c8Text = driver.findElement(By.xpath("//h2[@class='our-customerslove-us']"));
		String cssValueC8Text = c8Text.getCssValue("font-family");
		System.out.println("C8 Header : " + cssValueC8Text);

		List<WebElement> c8Reviews = driver.findElements(By.xpath("//div[@class='review-card-wrapper desktop']//child::div[@class='card-inner']"));
		for (WebElement webElement : c8Reviews) {
			String cssValueC8Text1 = webElement.getCssValue("font-family");
			System.out.println("C8 Reviews : " + cssValueC8Text1);
		}
		// Find Your Local Inspector
		WebElement c8BookAnInspection = driver.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[3]"));
		ac.contextClick(c8BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC8BookAnInspection = c8BookAnInspection.getCssValue("font-family");
		System.out.println("C8 BookAnInspection : " + cssValueC8BookAnInspection);


//		// Component 9
		WebElement c9Text = driver.findElement(By.xpath("//h2[@class='heading blue-heading']"));
		String cssValueC9Text = c9Text.getCssValue("font-family");
		System.out.println("C9 Header : " + cssValueC9Text);
		
		List <WebElement> c9Text1 = driver.findElements(By.xpath("//span[@class='Collapsible__trigger is-closed']"));
		for (WebElement webElement : c9Text1) {
			String cssValueC9Text1 = webElement.getCssValue("font-family");
			System.out.println("C9 SubText1 : " + cssValueC9Text1);
		}
	
		
		//Component 10
		WebElement c10Text2 = driver.findElement(By.xpath("//h2[@class='ready-to-gain-peace default_size']"));
		String cssValueC10Text2 = c10Text2.getCssValue("font-family");
		System.out.println("C10 Header : " + cssValueC10Text2);

		// Book An Inspection
		WebElement c10BookAnInspection = driver.findElement(By.xpath("//a[@class='explore-all-services gold-btn button_default']"));
		ac.contextClick(c10BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC10BookAnInspection = c10BookAnInspection.getCssValue("font-family");
		System.out.println("C10 BookAnInspection : " + cssValueC10BookAnInspection);

	}

	@Test
	public void Test_SPHomeOwner() throws AWTException, InterruptedException {

		
		
		getDriver("chrome");
		
		String className = System.getenv("SPDEV");
		System.out.println(className);
		getUrl(className+"/home-owner");
		
		ac = new Actions(driver);	
		r = new Robot();
	
//		getUrl("http://wini-dev.winrecall.com/home-owner");
		Actions ac = new Actions(driver);
		Robot r = new Robot();

		Thread.sleep(3000);

		WebElement header = driver.findElement(By.xpath("//h1[@class='heading banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header : " + cssValueHeader);

		WebElement subHeader = driver.findElement(By.xpath("//div[@class='content-container']/child::p[1]"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for Sub-Header : " + cssValueSubHeader);

		// component 1
		WebElement c1Text = driver.findElement(By.xpath("//h2[@class='gradient-heading']"));
		String cssValueC1Text = c1Text.getCssValue("font-family");
		System.out.println("C1 Header : " + cssValueC1Text);

		WebElement c1Text1 = driver.findElement(
				By.xpath("//div[@class='secondary-titles']/child::div[@class='content-container']/child::p[1]"));
		String cssValueC1Text1 = c1Text1.getCssValue("font-family");
		System.out.println("C1 SubText : " + cssValueC1Text1);

		// component 2
		WebElement c2Text = driver.findElement(By.xpath("(//h2[@class='black-heading-inner'])[1]"));
		String cssValueC2Text = c2Text.getCssValue("font-family");
		System.out.println("C2 Header : " + cssValueC2Text);

		WebElement c2Text1 = driver.findElement(By.xpath("//p[@class='protect_investment_inner_right_main ']"));
		String cssValueC2Text1 = c2Text1.getCssValue("font-family");
		System.out.println("C2 SubText : " + cssValueC2Text1);

		List<WebElement> c2Text2 = driver
				.findElements(By.xpath("//div[@class='protect_investment_inner_right_inner flexed']"));
		for (WebElement string : c2Text2) {
			String cssValueC2Text2 = string.getCssValue("font-family");
			System.out.println("C2 SubText1 : " + cssValueC2Text2);
		}

//		 Book An Inspection
		WebElement c2BookAnInspection = driver.findElement(By.xpath("//a[@class='gradient-btn button_default']"));
		ac.contextClick(c2BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC2BookAnInspection = c2BookAnInspection.getCssValue("font-family");
		System.out.println("C2 BookAnInspection : " + cssValueC2BookAnInspection);

		// Review Box
		WebElement c2Reviews = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[1]"));
		String cssValueC2Reviews = c2Reviews.getCssValue("font-family");
		System.out.println("C2 Reviews : " + cssValueC2Reviews);

		WebElement c2Reviews1 = driver.findElement(By.xpath("(//div[@class='name'])[1]"));
		String cssValueC2Reviews1 = c2Reviews1.getCssValue("font-family");
		System.out.println("C2 ReviewerName : " + cssValueC2Reviews1);

		// component 3
		WebElement c3Text = driver.findElement(By.xpath("//h3[text()='First-Time Homeowner? You’re Not Alone!']"));
		String cssValueC3Text = c3Text.getCssValue("font-family");
		System.out.println("C3 Header : " + cssValueC3Text);

		WebElement c3SubText1 = driver.findElement(By.xpath("//div[@class=' description']"));
		String cssValueC3SubText1 = c3SubText1.getCssValue("font-family");
		System.out.println("C3 SubText1 : " + cssValueC3SubText1);

		// Read Our HomeOwner Tips
		WebElement c3HomeOwner = driver.findElement(By.xpath("(//a[@class='btn-with-arrow white rarrow'])[1]"));
		ac.contextClick(c3HomeOwner).perform();
		
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC3HomeOwner = c3HomeOwner.getCssValue("font-family");
		System.out.println("C3 HomeOwner : " + cssValueC3HomeOwner);

		// component 4
		WebElement c4Text = driver.findElement(By.xpath("(//h2[@class='black-heading'])[1]"));
		String cssValueC4Header = c4Text.getCssValue("font-family");
		System.out.println("C4 Header : " + cssValueC4Header);

		WebElement c4SubText = driver.findElement(By.xpath("//p[@class='desktop-readmore']"));
		String cssValueC4SubText = c4SubText.getCssValue("font-family");
		System.out.println("C4 SubText : " + cssValueC4SubText);

		List<WebElement> c4Services = driver.findElements(By.xpath("//span[@class='accordian-title-txt']"));
		for (WebElement c4ServicesName : c4Services) {
			String cssValueC4ServicesName = c4ServicesName.getCssValue("font-family");
			System.out.println("C4 ServicesName : " + cssValueC4ServicesName);

		}

		// component 5
		WebElement c5Text = driver.findElement(By.xpath(
				"//h3[text()='Savvy homeowners budget 1% of the purchase price annually for home maintenance and repairs. '] "));
		String cssValueC5Text = c5Text.getCssValue("font-family");
		System.out.println("C5 Header : " + cssValueC5Text);

		// View Our HomeOwner's Guide
		WebElement c5HomeOwner = driver.findElement(By.xpath("(//a[@class='btn-with-arrow white rarrow'])[2]"));
		ac.contextClick(c5HomeOwner).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		String cssValueC5HomeOwner = c5HomeOwner.getCssValue("font-family");
		System.out.println("C5 HomeOwner : " + cssValueC5HomeOwner);

		// component 6
		WebElement c6Text = driver.findElement(By.xpath("//h6[@class='gradient-heading']"));
		String cssValueC6Text = c6Text.getCssValue("font-family");
		System.out.println("C6 TitleHeader : " + cssValueC6Text);

		WebElement c6Text1 = driver.findElement(By.xpath("(//h2[@class='black-heading'])[2]"));
		String cssValuec6Text1 = c6Text1.getCssValue("font-family");
		System.out.println("C6 Header : " + cssValuec6Text1);

		WebElement c6SubText = driver.findElement(By.xpath("(//div[@class='content-container'])[2]"));
		String cssValueC6SubText = c6SubText.getCssValue("font-family");
		System.out.println("C6 SubText : " + cssValueC6SubText);

		List<WebElement> c6SubHeader1 = driver.findElements(By.xpath("(//h5[@class='gradient-heading'])"));
		for (WebElement webElement : c6SubHeader1) {
			String cssValueC6SubHeader1 = webElement.getCssValue("font-family");
			System.out.println("C6 Sub Headers : " + cssValueC6SubHeader1);
		}

		List<WebElement> c6SubText1 = driver.findElements(By.xpath("//p[@class='subtext']"));
		for (WebElement webElement : c6SubText1) {
			String cssValueC6SubText1 = webElement.getCssValue("font-family");
			System.out.println("C6 SubText1 : " + cssValueC6SubText1);
		}

		// Learn More About Healthy Home Check
		WebElement c6HealthyHome = driver.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[1]"));
		ac.moveToElement(c6HealthyHome).contextClick().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC6HealthyHome = c6HealthyHome.getCssValue("font-family");
		System.out.println("C6 HealthyHome : " + cssValueC6HealthyHome);

		// component 7
		WebElement c7Text = driver.findElement(By.xpath("(//h2[@class='gradient-heading'])[2]"));
		String cssValueC7Text = c7Text.getCssValue("font-family");
		System.out.println("C7 Header : " + cssValueC7Text);

		WebElement c7SubText = driver.findElement(By.xpath("//div[@class='content-container']/child::p"));
		String cssValueC7SubText = c7SubText.getCssValue("font-family");
		System.out.println("C7 SubText : " + cssValueC7SubText);

		// HomeOwners Insurance Inspection Checklist
		WebElement c7Insurance = driver.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[2]"));
		ac.moveToElement(c7Insurance).contextClick().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC7Insurance = c7Insurance.getCssValue("font-family");
		System.out.println("C7 HomeOwners Insurance : " + cssValueC7Insurance);

		// component 8
		WebElement c8Text = driver.findElement(By.xpath("(//h2[@class='header black-heading-inner'])[1]"));
		String cssValueC8Text = c8Text.getCssValue("font-family");
		System.out.println("C8 Header : " + cssValueC8Text);

		WebElement c8SubHeader1 = driver
				.findElement(By.xpath("(//h5[@class='description-title gradient-heading'])[1]"));
		String cssValueC8SubHeader1 = c8SubHeader1.getCssValue("font-family");
		System.out.println("C8 SubHeader1 : " + cssValueC8SubHeader1);

		WebElement c8SubText1 = driver.findElement(By.xpath("(//p[@class='description-subtitle '])[1]"));
		String cssValueC8SubText1 = c8SubText1.getCssValue("font-family");
		System.out.println("C8 SubText1 : " + cssValueC8SubText1);

		WebElement c8SubHeader2 = driver
				.findElement(By.xpath("(//h5[@class='description-title gradient-heading'])[2]"));
		String cssValueC8SubHeader2 = c8SubHeader2.getCssValue("font-family");
		System.out.println("C8 SubHeader2 : " + cssValueC8SubHeader2);

		WebElement c8SubText2 = driver.findElement(By.xpath("(//p[@class='description-subtitle '])[2]"));
		String cssValueC8SubText2 = c8SubText2.getCssValue("font-family");
		System.out.println("C8 SubText2 : " + cssValueC8SubText2);

		// Energy Saving Tips For HomeOwners
		WebElement c8SavingTips = driver.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[3]"));
		ac.contextClick(c8SavingTips).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC8SavingTips = c8SavingTips.getCssValue("font-family");
		System.out.println("C8 SavingTips : " + cssValueC8SavingTips);

		// Review Box
		WebElement c8Reviews = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[3]"));
		String cssValueC8Reviews = c8Reviews.getCssValue("font-family");
		System.out.println("C8 Reviews : " + cssValueC8Reviews);

		WebElement c8Reviews1 = driver.findElement(By.xpath("(//div[@class='name'])[3]"));
		String cssValueC8Reviews1 = c8Reviews1.getCssValue("font-family");
		System.out.println("C8 ReviewerName : " + cssValueC8Reviews1);

		// component 9
		WebElement c9Text = driver.findElement(By.xpath("(//h2[@class='header black-heading-inner'])[2]"));
		String cssValueC9Text = c9Text.getCssValue("font-family");
		System.out.println("C9 Header : " + cssValueC9Text);

		WebElement c9Text1 = driver.findElement(By.xpath("(//p[@class='subtext '])[1]"));
		String cssValueC9SubText = c9Text1.getCssValue("font-family");
		System.out.println("C9 SubText : " + cssValueC9SubText);

//		WebElement c9SubText1 = driver.findElement(By.xpath("(//div[@class='content'])[1]"));
//		String cssValueC9SubText1 = c9SubText1.getCssValue("font-family");
//		System.out.println("C9 SubText1 : " + cssValueC9SubText1);

		// Book An Inspection
		WebElement c9BookInspection = driver.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[4]"));
		ac.moveToElement(c9BookInspection).contextClick().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC9BookInspection = c9BookInspection.getCssValue("font-family");
		System.out.println("C9 Book An Inspection : " + cssValueC9BookInspection);

		// component 10
		WebElement c10Text = driver.findElement(By.xpath("(//h2[@class='header black-heading-inner'])[3]"));
		String cssValueC10Text = c10Text.getCssValue("font-family");
		System.out.println("C10 Header : " + cssValueC10Text);
		
		WebElement c10SubText = driver.findElement(By.xpath("(//p[@class='subtext '])[2]"));
		String cssValueC10SubText = c10SubText.getCssValue("font-family");
		System.out.println("C10 SubText : " + cssValueC10SubText);

		// Learn How To Age In Place
		WebElement c10AgeInPlace = driver.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[4]"));
		ac.contextClick(c10AgeInPlace).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC10AgeInPlace = c10AgeInPlace.getCssValue("font-family");
		System.out.println("C10 Learn How to Age in Place : " + cssValueC10AgeInPlace);
		
		// Review Box
		WebElement c10Reviews = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[3]"));
		String cssValueC10Reviews = c10Reviews.getCssValue("font-family");
		System.out.println("C10 Reviews : " + cssValueC10Reviews);

		WebElement c10Reviews1 = driver.findElement(By.xpath("(//div[@class='name'])[5]"));
		String cssValueC10Reviews1 = c10Reviews1.getCssValue(""
				+ "font-family");
		System.out.
		println("C10 ReviewerName : " + cssValueC10Reviews1);

		
		
		// component 11
		
		WebElement c11Text = driver.findElement(By.xpath("(//h2[@class='black-heading-inner'])[2]"));
		String cssValueC11Text = c11Text.getCssValue("font-family");
		System.out.println("C11 Header : " + cssValueC11Text);

		WebElement c11SubHeader = driver.findElement(By.xpath("//h5[@class='point-header']"));
		String cssValueC11SubHeader = c11SubHeader.getCssValue("font-family");
		System.out.println("C11 Sub Header : " + cssValueC11SubHeader);

		WebElement c11SubText = driver.findElement(By.xpath("//p[@class='point-description ']"));
		String cssValueC11SubText = c11SubText.getCssValue("font-family");
		System.out.println("C11 SubText : " + cssValueC11SubText);

		// Learn More
		WebElement c11LearnMore = driver.findElement(By.xpath("(//a[@class='btn-with-arrow rarrow'])[5]"));
		ac.contextClick(c11LearnMore).perform();
		Thread.sleep(3000);
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC11LearnMore = c11LearnMore.getCssValue("font-family");
		System.out.println("C11 LearnMore : " + cssValueC11LearnMore);

		// Reviews
		WebElement c11Reviews = driver.findElement(By.xpath("//h2[@class='our-customerslove-us']"));
		String cssValueC11Reviews = c11Reviews.getCssValue("font-family");
		System.out.println("C11 Reviews Header : " + cssValueC11Reviews);
		
		WebElement c11Reviews1 = driver.findElement(By.xpath("(//div[@class='card-inner'])[1]"));
		String cssValueC11Reviews1 = c11Reviews1.getCssValue("font-family");
		System.out.println("C11 Reviews1 : " + cssValueC11Reviews1);

		WebElement c11Reviews2 = driver.findElement(By.xpath("(//div[@class='name'])[7]"));
		String cssValueC11Reviews2 = c11Reviews2.getCssValue("font-family");
		System.out.println("C11 ReviewerName : " + cssValueC11Reviews2);

		WebElement c11SubText1 = driver.findElement(By.xpath("(//div[@class='card-inner'])[2]"));
		String cssValueC11SubText1 = c11SubText1.getCssValue("font-family");
		System.out.println("C11 Reviews2 : " + cssValueC11SubText1);

		WebElement c11SubText2 = driver.findElement(By.xpath("(//div[@class='name'])[8]"));
		String cssValueC11SubText2 = c11SubText2.getCssValue("font-family");
		System.out.println("C11 ReviewerName : " + cssValueC11SubText2);

		WebElement c11SubText3 = driver.findElement(By.xpath("(//div[@class='card-inner'])[3]"));
		String cssValueC11SubText3 = c11SubText3.getCssValue("font-family");
		System.out.println("C11 Reviews3 : " + cssValueC11SubText3);
		
		WebElement c11SubText4 = driver.findElement(By.xpath("(//div[@class='name'])[9]"));
		String cssValueC11SubText4 = c11SubText4.getCssValue("font-family");
		System.out.println("C11 ReviewerName : " + cssValueC11SubText4);


		// component 12
		WebElement c12Text = driver.findElement(By.xpath("//h2[@class='heading blue-heading']"));
		String cssValueC12Text = c12Text.getCssValue("font-family");
		System.out.println("C12 Header : " + cssValueC12Text);

		List<WebElement> c12SubHeader1 = driver.findElements(By.id("//div[@class='collapsible-wrapper']"));
		for (WebElement webElement : c12SubHeader1) {
			String cssValueC12SubHeader1 = webElement.getCssValue("font-family");
			System.out.println("C12 SubHeaders : " + cssValueC12SubHeader1);
		}

		List <WebElement> c12SubHeader2 = driver.findElements(By.id("//div[@class='Collapsible__contentInner']"));
		for (WebElement webElement : c12SubHeader2) {
			String cssValueC12SubHeader2 = webElement.getCssValue("font-family");
			System.out.println("C12 Sub-Texts : " + cssValueC12SubHeader2);	
		}
		
		WebElement c12Text1 = driver.findElement(By.xpath("//h2[@class='ready-to-gain-peace default_size']"));
		String cssValueC12Text1 = c12Text1.getCssValue("font-family");
		System.out.println("C12 Header 1  : " + cssValueC12Text1);
		
//		 Book An Inspection
		WebElement c12BookAnInspection = driver.findElement(By.xpath("//a[@class='explore-all-services gold-btn button_default']"));
		ac.moveToElement(c12BookAnInspection).contextClick().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC12BookAnInspection = c12BookAnInspection.getCssValue("font-family");
		System.out.println("C2 BookAnInspection : " + cssValueC12BookAnInspection);

	}
	@Test
	public void Test_A() throws InterruptedException, AWTException {
		
//		getDriver("chrome");
		ac = new Actions(driver);
		r = new Robot();
		String className = System.getenv("SPDEV");
		System.out.println(className);
		getUrl(className+"/home-buyer");
		

		// Content validation in Header
		WebElement header = driver.findElement(By.xpath("//h1[@class='heading banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header content : " + cssValueHeader);

		// Gain peace of mind and buy your dream home with confidence
		WebElement subHeader = driver
				.findElement(By.xpath("//p[text()='Gain peace of mind and buy your dream home with confidence.']"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for Gain peace of mind and buy your dream home with confidence (SubHeader) : "
				+ cssValueSubHeader);

		// WIN Is The Buyer’s Choice For Home Inspection
		WebElement c1Text = driver.findElement(By.xpath("//h2[@class='gradient-heading']"));
		String cssValueC1Text = c1Text.getCssValue("font-family");
		System.out
				.println("Font Family for WIN Is The Buyer’s Choice For Home Inspection (Header) : " + cssValueC1Text);

		// Your home is your most valuable investment
		WebElement c1Text1 = driver.findElement(By.xpath("//div[@class='content-container']"));
		String cssValueC1Text1 = c1Text1.getCssValue("font-family");
		System.out.println("Font Family for Your home is your most valuable investment (SubText) : " + cssValueC1Text1);

		// Home Inspections Protect You and Your Most Valuable Investment
		WebElement c2Text = driver.findElement(By.xpath("//h2[@class='black-heading-inner']"));
		String cssValueC2Text = c2Text.getCssValue("font-family");
		System.out.println("Font Family for Home Inspections Protect You and Your Most Valuable Investment (Header) : "
				+ cssValueC2Text);

		// Without a professional home inspection, underlying issues are often
		// overlooked
		WebElement c2Text1 = driver.findElement(By.xpath("//p[@class='inspection-content']"));
		String cssValueC2Text1 = c2Text1.getCssValue("font-family");
		System.out.println(
				"Font Family for Without a professional home inspection, underlying issues are often overlooked (SubText) : "
						+ cssValueC2Text1);

		// Home Inspections bring peace of mind by identifying health and safety issues
		WebElement c2Text2 = driver.findElement(By.xpath(
				"(//h5[text()='Home Inspections bring peace of mind by identifying health and safety issues '])[1]"));
		String cssValueC2Text2 = c2Text2.getCssValue("font-family");
		System.out.println(
				"Font Family for Home Inspections bring peace of mind by identifying health and safety issues (Sub-Header) : "
						+ cssValueC2Text2);

		// WIN home inspectors are highly trained
		WebElement c2Text3 = driver.findElement(By.xpath(
				"(//p[text()='WIN home inspectors are highly trained, certified and use the latest tools and technologies to detect and help develop mitigation plans for key issues that can affect your health, safety, and investment.'])[1]"));
		String cssValueC2Text3 = c2Text3.getCssValue("font-family");
		System.out.println("Font Family for WIN home inspectors are highly trained (SubText1) : " + cssValueC2Text3);

		// Learn more about Home Buyer Services
		WebElement c2HomeBuyer = driver.findElement(By.xpath("(//a[@class='btn-with-arrow darrow'])[1]"));
		ac.contextClick(c2HomeBuyer).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC2HomeBuyer = c2HomeBuyer.getCssValue("font-family");
		System.out.println("Font Family for Learn more about Home Buyer Services : " + cssValueC2HomeBuyer);

		// Review Box content
		WebElement c2Text4 = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[1]"));
		String cssValueC2Text4 = c2Text4.getCssValue("font-family");
		System.out.println("Font Family for ReviewBox : " + cssValueC2Text4);

		// Reviewer Name
		WebElement c2Text5 = driver.findElement(By.xpath("//div[text()='Emily R. Smith']"));
		String cssValueC2Text5 = c2Text5.getCssValue("font-family");
		System.out.println("Font Family for Reviewer Name : " + cssValueC2Text5);

		// First-Time Home Buyer? WIN is Here For You!
		WebElement c3Text = driver.findElement(By.xpath("//h3[text()='First-Time Home Buyer? WIN is Here For You!']"));
		String cssValueC3Text = c3Text.getCssValue("font-family");
		System.out.println("font family for First-Time Home Buyer? WIN is Here For You! (Header) : " + cssValueC3Text);

		// Congratulations, you’re on your way to homeownership!
		// It’s understandable if you’re excited as well as anxious.
		WebElement c3SubText = driver.findElement(By.xpath("//p[@class=' description']"));
		String cssValueC3SubText = c3SubText.getCssValue("font-family");
		System.out.println("font family for Congratulations, you’re on your way to homeownership! (SubText) : "
				+ cssValueC3SubText);

		// Here’s Your Home Buyer Inspection Checklist
		WebElement c3CheckList = driver.findElement(By.xpath("//a[@class='btn-with-arrow white rarrow']"));
		ac.contextClick(c3CheckList).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC3CheckList = c3CheckList.getCssValue("font-family");
		System.out.println("font family for Here’s Your Home Buyer Inspection Checklist : " + cssValueC3CheckList);

		// Home Inspection Services to Help You Buy with Confidence
		WebElement c3Text1 = driver
				.findElement(By.xpath("//h2[text()='Home Inspection Services to Help You Buy with Confidence']"));
		String cssValueC3Text1 = c3Text1.getCssValue("font-family");
		System.out.println("font family for Home Inspection Services to Help You Buy with Confidence (Header) : "
				+ cssValueC3Text1);

		// Our rigorous training and certifications paired with state-of-the-art
		WebElement c3SubText2 = driver.findElement(By.xpath("(//p[@class='desktop-readmore'])[1]"));
		String cssValueC3SubText2 = c3SubText2.getCssValue("font-family");
		System.out.println(
				"font family for Our rigorous training and certifications paired with state-of-the-art (Subtext1) : "
						+ cssValueC3SubText2);

		// Services
		List<WebElement> c3Services = driver.findElements(By.xpath("//span[@class='accordian-title-txt']"));
		for (WebElement c3ServicesName : c3Services) {
			String cssC3ServicesName = c3ServicesName.getCssValue("font-family");
			System.out.println("font family for ServicesName : " + cssC3ServicesName);

		}

		// Home Inspectors Play a Key Role in the Homebuying Process
		WebElement c4Text = driver.findElement(By.xpath("//h2[@class='hi-heading hi-desktop black-heading-inner']"));
		String cssValueC4Text = c4Text.getCssValue("font-family");
		System.out.println("font family for Home Inspectors Play a Key Role in the Homebuying Process (Header) : "
				+ cssValueC4Text);

		// Once your offer is accepted and you’re under contract,
		// it’s important to get your new home inspected
		// while still in the contingency period
		WebElement c4Text1 = driver.findElement(By.xpath("//p[@class='subtext']"));
		String cssValueC4Text1 = c4Text1.getCssValue("font-family");
		System.out.println("font family for Once your offer is accepted and you’re under contract (SubText1) : "
				+ cssValueC4Text1);

		// Identify major and minor issues with the home before buying it
		WebElement c4Text2 = driver
				.findElement(By.xpath("//li[text()='Identify major and minor issues with the home before buying it']"));
		String cssValueC4Text2 = c4Text2.getCssValue("font-family");
		System.out
				.println("font family for Identify major and minor issues with the home before buying it (SubText2) : "
						+ cssValueC4Text2);

		// Avoid unexpected surprises
		WebElement c4Text3 = driver.findElement(By.xpath("//li[text()='Avoid unexpected surprises']"));
		String cssValueC4Text3 = c4Text3.getCssValue("font-family");
		System.out.println("font family for Avoid unexpected surprises (SubText3) : " + cssValueC4Text3);

		// Assess repairs and enhancement estimates
		WebElement c4Text4 = driver.findElement(By.xpath("//li[text()='Assess repairs and enhancement estimates']"));
		String cssValueC4Text4 = c4Text4.getCssValue("font-family");
		System.out.println("font family for Assess repairs and enhancement estimates (SubText4) : " + cssValueC4Text4);

		// Gain peace of mind on your most valuable purchase
		WebElement c4Text5 = driver
				.findElement(By.xpath("//li[text()='Gain peace of mind on your most valuable purchase']"));
		String cssValueC4Text5 = c4Text5.getCssValue("font-family");
		System.out.println(
				"font family for Gain peace of mind on your most valuable purchase (SubText5) : " + cssValueC4Text5);

		// What Home Buyers Should Do During The Home Inspection
		WebElement c4Text6 = driver
				.findElement(By.xpath("//h5[text()='What Home Buyers Should Do During The Home Inspection']"));
		String cssValueC4Text6 = c4Text6.getCssValue("font-family");
		System.out.println("font family for What Home Buyers Should Do During The Home Inspection (Sub-Header) : "
				+ cssValueC4Text6);

		// Buyers are not required to be at the inspection, however, they
		WebElement c4Text7 = driver.findElement(
				By.xpath("//p[contains(text(),'Buyers are not required to be at the inspection, however, they')]"));
		String cssValueC4Text7 = c4Text7.getCssValue("font-family");
		System.out.println("font family for Buyers are not required to be at the inspection, however, they (SubText1: "
				+ cssValueC4Text7);

		// See What Questions To Ask A HomeInspector
		WebElement c4QuestionsToAskAHomeInspector = driver
				.findElement(By.xpath("//a[text()='See What Questions To Ask A Home Inspector']"));
		ac.contextClick(c4QuestionsToAskAHomeInspector).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC4QuestionsToAskAHomeInspector = c4QuestionsToAskAHomeInspector.getCssValue("font-family");
		System.out.println("font family for See What Questions To Ask A Home Inspector : "
				+ cssValueC4QuestionsToAskAHomeInspector);

		// Thorough and very good and communicating issues with the home. Highly
		// recommend
		// Review box
		WebElement c4ReviewBox = driver.findElement(By.xpath("(//div[@class='card-desription_inner'])[2]"));
		String cssValueC4ReviewBox = c4ReviewBox.getCssValue("font-family");
		System.out.println(
				"font family for Thorough and very good and communicating issues with the home. Highly recommend (Review Box) : "
						+ cssValueC4ReviewBox);

		// Shawne Schulz
		// Rviewer Name
		WebElement c4ReviewerName = driver.findElement(By.xpath("//div[text()='Shawne Schulz']"));
		String cssValue$4ReviewerName = c4ReviewerName.getCssValue("font-family");
		System.out.println("font family for Shawne Schulz (Reviewer Name) : " + cssValue$4ReviewerName);

		// What’s included in a Full Home Inspection by WIN?'
		WebElement c5Text = driver
				.findElement(By.xpath("//h2[text()='What’s included in a Full Home Inspection by WIN?']"));
		String cssValueC5Text = c5Text.getCssValue("font-family");
		System.out.println(
				"font family for What’s included in a Full Home Inspection by WIN?' (Header) : " + cssValueC5Text);

		// A Full Home Inspection by WIN thoroughly examines over 300 items in your home
		WebElement c5Text1 = driver.findElement(By.xpath("(//p[@class='desktop-readmore'])[2]"));
		String cssValueC5Text1 = c5Text1.getCssValue("font-family");
		System.out.println(
				"font family for A Full Home Inspection by WIN thoroughly examines over 300 items in your home (SubText1) : "
						+ cssValueC5Text1);

		// Getting Your Home Inspected Has Never Been Easier!
		WebElement c6Text = driver
				.findElement(By.xpath("//h3[text()='Getting Your Home Inspected Has Never Been Easier!']"));
		String cssValueC6Text = c6Text.getCssValue("font-family");
		System.out.println(
				"font family for Getting Your Home Inspected Has Never Been Easier! (Header) : " + cssValueC6Text);

		// We make the home inspection process smooth and seamless
		WebElement c6Text1 = driver.findElement(By.xpath("//p[@class='technical-skills-de']"));
		String cssValueC6Text1 = c6Text1.getCssValue("font-family");
		System.out.println("font family for We make the home inspection process smooth and seamless (SubText) : "
				+ cssValueC6Text1);

		List<WebElement> c6SubText = driver.findElements(By.xpath("//button[@class='collapsed']"));
		for (WebElement c6SubTextList : c6SubText) {
			String cssValueC6SubText = c6SubTextList.getCssValue("font-family");
			System.out.println("font family for Schedule with Ease (SubText) : " + cssValueC6SubText);
		}

		// Book An Inspection
		WebElement c6BookAnInspection = driver
				.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[1]"));
		ac.contextClick(c6BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC6BookAnInspection = c6BookAnInspection.getCssValue("font-family");
		System.out.println("C6 BookAnInspection : " + cssValueC6BookAnInspection);

		// Component 7
		WebElement c7Text = driver.findElement(By.xpath("(//h2[@class='black-heading'])[3]"));
		String cssValueC7Text = c7Text.getCssValue("font-family");
		System.out.println("C7 Header : " + cssValueC7Text);

		List <WebElement> c7Text1 = driver.findElements(By.xpath("(//p[@class='identify-major-and-m valign-text-middle default_size'])"));
		for (WebElement webElement : c7Text1) {
			String cssValueC7Text1 = webElement.getCssValue("font-family");
			System.out.println("C7 SubText1 : " + cssValueC7Text1);
		}
		

		// Book An Inspection
		WebElement c7BookAnInspection = driver
				.findElement(By.xpath("(//a[@class='gradient-btn button_default'])[2]"));
		ac.contextClick(c7BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC7BookAnInspection = c7BookAnInspection.getCssValue("font-family");
		System.out.println("C7 BookAnInspection : " + cssValueC7BookAnInspection);

		// Component 8
		WebElement c8Text = driver.findElement(By.xpath("(//div[@class='home_highly_rated_banner_inner ']//child::h3)[1]"));
		String cssValueC8Text = c8Text.getCssValue("font-family");
		System.out.println("C8 Header : " + cssValueC8Text);

		// Read Our Reviews
		WebElement c8ReadOurReviews = driver.findElement(By.xpath("//a[text()='READ OUR REVIEWS']"));
		ac.contextClick(c8ReadOurReviews).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC8ReadOurReviews = c8ReadOurReviews.getCssValue("font-family");
		System.out.println("C8 BookAnInspection : " + cssValueC8ReadOurReviews);

		WebElement c8Text1 = driver.findElement(By.xpath("//h2[@class='our-customerslove-us']"));
		String cssValueC8Text1 = c8Text1.getCssValue("font-family");
		System.out.println("C8 Header1 : " + cssValueC8Text1);

		// Review Box
		List<WebElement> c8ReviewBox = driver.findElements(By.xpath("//div[@class='review-card-wrapper desktop']//child::div[@class='card-inner']"));
		for (WebElement webElement : c8ReviewBox) {
			String cssValueC8ReviewBox = webElement.getCssValue("font-family");
			System.out.println("C8 Review Box : " + cssValueC8ReviewBox);
		}

		// Component 9
		WebElement c9Text = driver.findElement(By.xpath("//h2[@class='heading blue-heading']"));
		String cssValueC9Text = c9Text.getCssValue("font-family");
		System.out.println("C9 Header : " + cssValueC9Text);

//		List<WebElement> c9Text1 = driver.findElements(By.xpath(""));
//		for (WebElement webElement : c9Text1) {
//			String cssValueC9Text1 = webElement.getCssValue("font-family");
//			System.out.println("C9 SubText1 : " + cssValueC9Text1);
//		}

		// Component 10
		WebElement c10Text = driver.findElement(By.xpath("//h2[@class='ready-to-gain-peace default_size']"));
		String cssValueC10Text = c10Text.getCssValue("font-family");
		System.out.println("C10 Header : " + cssValueC10Text);

		// Book An Inspection
		WebElement c10BookAnInspection = driver
				.findElement(By.xpath("(//a[@class='explore-all-services gold-btn button_default'])"));
		ac.contextClick(c7BookAnInspection).perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueC10BookAnInspection = c10BookAnInspection.getCssValue("font-family");
		System.out.println("C10 BookAnInspection : " + cssValueC10BookAnInspection);

	}



}
