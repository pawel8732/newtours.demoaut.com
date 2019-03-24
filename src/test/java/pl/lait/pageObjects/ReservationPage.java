package pl.lait.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium.Init;

public class ReservationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
			+ "table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayXpath; 
	
	@FindBy(name = "passCount")
	WebElement passCountSelect;

	@FindBy(name = "fromPort")
	WebElement fromPortSelect;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonthSelect;
	
	@FindBy(name = "fromDay")
	WebElement fromDaySelect;
	
	@FindBy(name = "toPort")
	WebElement toPortSelect;
	
	@FindBy(name = "toMonth")
	WebElement toMonthSelect;
	
	@FindBy(name = "toDay")
	WebElement toDaySelect;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement bisClassRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement ecoClassRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement firClassRadio;
	
	@FindBy(name = "airline")
	WebElement airlineSelect;
	
	@FindBy(name = "findFlights")
	WebElement continueBtn;
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);		
	}
	
	public void oneWay() {
		oneWayXpath.click();
	}
	
	public void from(String port, String month, String day) {
		Select p = new Select(fromPortSelect);
		p.selectByVisibleText(port);
		
		Select m = new Select(fromMonthSelect);
		m.selectByValue(month);
		
		Select d = new Select(fromDaySelect);
		d.selectByValue(day);
	}
	
	public void to(String port, String month, String day) {
		Select p = new Select(toPortSelect);
		p.selectByVisibleText(port);
		
		Select m = new Select(toMonthSelect);
		m.selectByValue(month);
		
		Select d = new Select(toDaySelect);
		d.selectByValue(day);
	}
	
	public void passCount(String passangers) {
		Select pass = new Select(passCountSelect);
		pass.selectByValue(passangers);
	}
	
	public void firstClass() {
		firClassRadio.click();
	}
	
	public void airlineSelect(String airline ) {
		Select a = new Select(airlineSelect);
		a.selectByVisibleText(airline);
	}
	
	public void submit() {
		//TODO
		continueBtn.click();
	}

}
