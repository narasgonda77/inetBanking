package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig();
	public String baseUrl = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr454346";
	public String password = "ugAhyvU";
	public static WebDriver driver;
	// public static Logger logger;

	@BeforeClass
	public void setup(String br) {
//		logger = LogManager.getLogger(BaseClass.class);
//		logger.info("this is from looger");
//		logger.debug("Hello from Log4j 2");
//		logger.debug("This is a Debug Message!");
//		logger.info("This is an Info Message!");
//		logger.error("And here comes the Error Message!");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
