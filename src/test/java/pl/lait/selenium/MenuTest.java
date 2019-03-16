package pl.lait.selenium;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuTest {
	
	WebDriver driver;
	
	public void linkClick(String linkText) {
		Init.log("klikam w link: " + linkText);
		driver.findElement(By.linkText(linkText)).click();
	}
	public void nameClick(String name) {
		Init.log("klikam w link: " + name);
		driver.findElement(By.name(name)).click();
	}
	public void nameInput(String name, String input) {
		Init.log("klikam w link: " + name);
		driver.findElement(By.name(name)).sendKeys(input);
	}
	public void radioClick(String xpath) {
		Init.log("klikam w element z xpath: " + xpath);
		driver.findElement(By.xpath(xpath)).click();
	}
	public void selectByValue(String nazwa, String value) {
		Init.log("klikam w rozwijane: "+ nazwa + " i " + value);
		WebElement webElem = driver.findElement(By.name(nazwa));
		Select wybor = new Select(webElem);
		wybor.selectByValue(value);
	}
	public void selectByText(String nazwa, String text) {		
		Init.log("klikam w rozwijane: "+ nazwa + " i " + text);
		WebElement webElem = driver.findElement(By.name(nazwa));
		Select wybor = new Select(webElem);
		wybor.selectByVisibleText(text);
	}
	
	@Before
	public void bifor() {
		//otwieranie przegladarki przed testem
		Init.log("otwietam okno przegladarki");
		driver = Init.getDriver();
	}
	
	@Ignore
	@Test
	public void topMenu() {
		linkClick("CONTACT");
		linkClick("SUPPORT");
		linkClick("REGISTER");
		linkClick("SIGN-ON");
		driver.findElement(By.name("userName")).sendKeys("pawel8732");
		driver.findElement(By.name("password")).sendKeys("asdzxc");
		driver.findElement(By.name("login")).click();	


	}
	@Ignore
	@Test
	public void leftMenu() {
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.linkText("Car Rentals")).click();
		driver.findElement(By.linkText("Cruises")).click();
		driver.findElement(By.linkText("Destinations")).click();
		driver.findElement(By.linkText("Vacations")).click();
	}
	
	@Test
	public void loginAndReservationLevel1() {
		driver.findElement(By.linkText("SIGN-ON")).click();	
		driver.findElement(By.name("userName")).sendKeys("pawel8732");
		driver.findElement(By.name("password")).sendKeys("asdzxc");
		driver.findElement(By.name("login")).click();
		String oneWayXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
				+ "table/tbody/tr[2]/td[2]/b/font/input[2]";
		driver.findElement(By.xpath(oneWayXpath)).click();
		WebElement passCountWebElem = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCountWebElem);
		passCountSelect.selectByVisibleText("2");
		//driver.findElement(By.name("fromPort")).sendKeys("L");
		
		Select fromPortSelect = new Select(driver.findElement(By.name("fromPort")));
		fromPortSelect.selectByVisibleText("Paris");	
		Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByValue("3");
		Select fromDay = new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByValue("15");
		
		selectByText("toPort", "Sydney");
		//Select toPortSelect = new Select(driver.findElement(By.name("toPort")));
		//toPortSelect.selectByVisibleText("Sydney");	
		selectByValue("toMonth", "4");
		//Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		//toMonth.selectByValue("4");
		selectByValue("toDay", "20");
		//Select toDay = new Select(driver.findElement(By.name("toDay")));
		//toDay.selectByValue("18");
		
		String bis = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		String eco = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input";
		String fir = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
		
		radioClick(fir);
		radioClick(bis);
		radioClick(eco);
		radioClick(fir);
		
		Select airlineSelect = new Select(driver.findElement(By.name("airline")));
		airlineSelect.selectByVisibleText("Unified Airlines");	
		Init.sleep(3);
		
		nameClick("findFlights");	
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")).click();
		Init.sleep(3);
		
		nameClick("reserveFlights");
		
		nameInput("passFirst0", "Pawel");
		nameInput("passLast0", "Pawel");
		selectByValue("pass.0.meal", "LFML");
		nameInput("passFirst1", "Pawel2");
		nameInput("passLast1", "Pawel2");
		selectByValue("pass.1.meal", "MOML");
		
		nameClick("ticketLess");
		Init.sleep(2);
		nameClick("buyFlights");

		radioClick("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img");
		
	}
	
	@After
	public void awter() {
		//zamykanie przegladarki po tescie
		Init.sleep(3);
		Init.close();
		
	}

}
