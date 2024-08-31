package TC_Repositry;
import org.testng.annotations.Test;
import ObjectRepositry.WebPage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ScreenShotUtility;
import genericUtilityOrLib.SeleniumUtility;

public class ASSESSMENT1 extends BaseClass {
	

	

	@Test
	public void UITesting() throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		WebPage hp = new WebPage(driver);
		hp.getUrl1();
		ScreenShotUtility.Screenshot(driver, "url1");
		SUTIL.navigateBack(driver);
		hp.getUrl2();
		ScreenShotUtility.Screenshot(driver, "url2");
		SUTIL.navigateBack(driver);
		hp.getUrl3();
		ScreenShotUtility.Screenshot(driver, "url3");
		SUTIL.navigateBack(driver);
		hp.getUrl4();
		ScreenShotUtility.Screenshot(driver, "url4");
		SUTIL.navigateBack(driver);
		hp.getUrl5();
	    ScreenShotUtility.Screenshot(driver, "url5");
		SUTIL.navigateBack(driver);
	}
		
}


