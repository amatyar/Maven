import org.openqa.selenium.WebDriver;

public class first {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rabindra\\Downloads\\geckodriver-v0.33.0-win64" );
	driver = new googleChrome();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
