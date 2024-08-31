package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage {

		@FindBy(xpath = "//a[text()='https://www.getcalley.com/']")
		private WebElement url1;

		@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-lifetime-offer/']")
		private WebElement url2;

		@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-lifetime-offer/']")
		private WebElement url3;

		@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-teams-features/']")
		private WebElement url4;
		
		@FindBy(xpath = "//a[text()='https://www.getcalley.com/calley-pro-features/']")
		private WebElement url5;

		public WebPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement url1() {
			return url1 ;
		}

		public WebElement url2() {
			return url2;
		}

		public WebElement url3() {
			return url3;
		}

		public WebElement url4() {
			return url4;
		}

		public WebElement url5() {
			return url5;
		}
		
		public void getUrl1() {
			url1.click();
		}

		public void getUrl2() {
			url2.click();
		}
		
		public void getUrl3() {
			url3.click();
		}
		
		public void getUrl4() {
			url4.click();
		}
		
		public void getUrl5() {
			url5.click();
		}

}
