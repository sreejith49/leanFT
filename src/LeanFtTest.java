

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Image;
import com.hp.lft.sdk.web.ImageDescription;

import unittesting.UnitTestClassBase;

public class LeanFtTest extends UnitTestClassBase {

	public LeanFtTest() {
		//Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws GeneralLeanFtException, InterruptedException {
		try {
			Browser browser = BrowserFactory.launch(BrowserType.CHROME);			
			browser.navigate("https://leapahead.headstrong.com/OA_HTML/AppsLocalLogin.jsp?");
			EditField userName = browser.describe(EditField.class, new EditFieldDescription.Builder().id("M__Id").build());
			EditField passWord = browser.describe(EditField.class, new EditFieldDescription.Builder().id("M__Ida").build());
			Image btnLogin = browser.describe(Image.class, new ImageDescription.Builder().alt("Login").build());
			//Button btnLogin = browser.describe(Button.class, new ButtonDescription.Builder().)
			userName.setValue("703163651");
			passWord.setValue("Welcome3");
			btnLogin.click();
			//browser.describe(EditField.class, new EditFieldDescription.Builder().type("text").tagName("INPUT").name("username").build()).setValue("703163651");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
 