package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromePath {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//create a reference webDriver  interface and create object of ChromeDriver:
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.viata-libera.ro/");
		String title=driver.getTitle();
				System.out.println("Title : " + title);
		
driver.close();
	}

}
