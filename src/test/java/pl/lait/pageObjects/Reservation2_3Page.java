package pl.lait.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium.Init;

public class Reservation2_3Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input")
	WebElement radio_d_1;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")
	WebElement radio_d_2;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement radio_d_3;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
	WebElement radio_d_4;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")
	WebElement radio_r_1;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	WebElement radio_r_2;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
	WebElement radio_r_3;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")
	WebElement radio_r_4;
	
	@FindBy(name = "reserveFlights")
	WebElement reserveBtn;
	
	@FindBy(name = "passFirst0")
	WebElement passengerName1;
	
	@FindBy(name = "passLast0")
	WebElement passengerLast1;
	
	@FindBy(name = "pass.0.meal")
	WebElement passengerMeal1;
	
	@FindBy(name = "passFirst1")
	WebElement passengerName2;
	
	@FindBy(name = "passLast1")
	WebElement passengerLast2;
	
	@FindBy(name = "pass.1.meal")
	WebElement passengerMeal2;
	
	@FindBy(name = "creditCard")
	WebElement creditCard;
	
	@FindBy(name = "creditnumber")
	WebElement creditNumber;
	
	@FindBy(name = "cc_exp_dt_mn")
	WebElement expMonth;
	
	@FindBy(name = "cc_exp_dt_yr")
	WebElement expYear;
	
	@FindBy(name = "cc_frst_name")
	WebElement cardName;
	
	@FindBy(name = "cc_mid_name")
	WebElement cardMid;
	
	@FindBy(name = "cc_last_name")
	WebElement cardLast;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
	WebElement ticketless;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	WebElement billing;
	
	@FindBy(name = "buyFlights")
	WebElement buyFlightsBtn;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
	WebElement logout;
		
	public Reservation2_3Page() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	public void flights(int departing, int returning) {
		switch (departing) {
		case 1:
			radio_d_1.click();
			break;
		case 2:
			radio_d_2.click();
			break;
		case 3:
			radio_d_3.click();
			break;
		case 4:
			radio_d_4.click();
			break;
		default:
			break;
		}
		switch (returning) {
		case 1:
			radio_r_1.click();
			break;
		case 2:
			radio_r_2.click();
			break;
		case 3:
			radio_r_3.click();
			break;
		case 4:
			radio_r_4.click();
			break;
		default:
			break;
		}
	}
			
	public void reserve() {
		reserveBtn.click();
	}
	
	public void passenger1(String name, String last, String meal) {
		passengerName1.sendKeys(name);
		passengerLast1.sendKeys(last);
		Select m = new Select(passengerMeal1);
		m.selectByValue(meal);
	}
	
	public void passenger2(String name, String last, String meal) {
		passengerName2.sendKeys(name);
		passengerLast2.sendKeys(last);
		Select m = new Select(passengerMeal2);
		m.selectByValue(meal);
	}
	
	public void card(String card, String creditNum, String creditMon, String creditYear, String creditName, String creditMid, String creditLast) {
		creditCard.sendKeys(card);
		creditNumber.sendKeys(creditNum);
		expMonth.sendKeys(creditMon);
		expYear.sendKeys(creditYear);
		cardName.sendKeys(creditName);
		cardMid.sendKeys(creditMid);
		cardLast.sendKeys(creditLast);		
	}
	
	public void ticketlessTrv() {
		ticketless.click();
	}
	
	public void billingAdd() {
		billing.click();
	}
	
	public void buyTicket() {
		buyFlightsBtn.click();
	}
	
	public void logout() {
		logout.click();
	}
	

}
