/*
 
Introduction:

	Selenium WebDriver is a powerful tool for automating web application testing. Whether you are a beginner or an experienced tester, creating a simple WebDriver script is a great way to get started with automation testing. In this blog, we will walk you through the step-by-step process of creating a simple WebDriver script using Java and Selenium WebDriver.

Step 1: Set Up Your Environment

prerequisites:

	Java Development Kit (JDK) installed on your machine.
	Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA.
	Selenium WebDriver Java bindings downloaded and configured.
Step 2: Create a New Java Project

	Start by creating a new Java project.

Step 3: Add Selenium WebDriver Dependencies

	Add the Selenium WebDriver dependencies. If we're using Maven, we can include the following dependencies in pom.xml file:
 
 
 <dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
</dependencies>


	For other build tools or manual setup, we can download the Selenium Java bindings and include the JAR files in project.

Step 4: Write Your First WebDriver Script

Step 5: Run the WebDriver Script

Step 6: Observe the Script Execution

	The WebDriver script will open Google Chrome, search for "Selenium WebDriver," and print the title of the search results page. After completing the execution, the browser will close automatically.

	
	
	
	It's time to write the first WebDriver script.
 
 
 */

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	
	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Driver\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.google.com");

	        WebElement searchInput = driver.findElement(By.name("q"));

	        searchInput.sendKeys("Selenium WebDriver");

	        searchInput.submit();

	        System.out.println("Search results page title: " + driver.getTitle());

	        driver.quit();
	    }

}



