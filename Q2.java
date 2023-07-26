package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Driver\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();

	        driver.get("https://www.google.com");

	        WebElement searchInput = driver.findElement(By.name("q"));

	        searchInput.sendKeys("Selenium Browser Driver");

			try {
				Thread.sleep(3000); //3 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	
			searchInput.submit();
			
			try {
				Thread.sleep(5000); //5 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

			driver.close();
			
	    }

}
