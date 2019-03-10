package pl.lait.selenium;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuTest {
	
	WebDriver driver;
	
	@Before
	public void bifor() {
		//otwieranie przegladarki przed testem
		Init.log("otwietam okno przegladarki");
		driver = Init.getDriver();
	}
	
	@Test
	public void topMenu() {
		Init.log("klikam w link contact");
		driver.findElement(By.linkText("CONTACT")).click();
		Init.log("klikam w link support");
		driver.findElement(By.linkText("SUPPORT")).click();
		Init.log("klikam w link register");
		driver.findElement(By.linkText("REGISTER")).click();
		Init.log("klikam w link sign-on");
		driver.findElement(By.linkText("SIGN-ON")).click();	
		Init.log(driver.getTitle());
		Init.sleep(3);
	}
	
	@After
	public void awter() {
		//zamykanie przegladarki po tescie
		Init.close();
		
	}

}
