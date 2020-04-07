package bibodemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


  @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\fidel\\Downloads/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  public class NewTest {
	  @Test
	  public void f() {
	  }

}
