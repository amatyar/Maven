import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	WebDriver Driver;
	
public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Rabindra\\Downloads\\chromedriver_win32");
	Driver=new ChromeDriver();
	Driver.get("https://www.yahoo.com/");
	
	
}
public static void main(String[] args) {
	test tt=new test();
	tt.launchBrowser();
}
}
