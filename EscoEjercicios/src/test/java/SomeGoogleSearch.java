import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SomeGoogleSearch {
	
	static WebDriver driver;
	
	@Before
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver"); // seteamos la property para llamar al driver y al navegador
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize(); // maximizo el navegador
		driver.get("http://www.google.com/"); // paso la URL
	}
		public boolean result(By.ByName) {
		
		if (!result) {

		try {	
	
			result = SomeGoogleSearch.clickLastResult();
			} catch(Exception e)
			{
				e.printStackTrace();
				result = false;
			} 
		System.out.println("Test " + (result? "pased." : "failed."));
			
			//finally {
				driver.close();
				
	System.exit(1);
}
	}



@Test
public void clickLastResult() {  //Ingresar Busqueda
driver.findElement(By.name("q")).sendKeys("qa automation\n");

// Click en Buscar
driver.findElement(By.name("btnG")).click();

// Esperar 1 segundo para que se complete la búsqueda
//Thread.sleep(10000);
Thread.sleep(1000);

// Obtenga el enlace del último resultado de búsqueda y hacerle click
//ArrayLIst links = driver.findElements(By.tagName("a"));
List<WebElement> links = driver.findElements(By.tagName("a"));


//driver.click(links.get(links.size() -1)));
//driver.click(links.get(links.size() -1));

}

@After

public void tearDown() { // metodo de cierre
	
	driver.quit();
	
}
}