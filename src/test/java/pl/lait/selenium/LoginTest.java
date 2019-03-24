package pl.lait.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.Reservation2_3Page;
import pl.lait.pageObjects.ReservationPage;

@Ignore
public class LoginTest {
	
	WebDriver driver;
	
	@Before
	public void bifor() {
		driver = Init.getDriver();
	}
	
	@Ignore
	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.goToLoginPage();
		lp.loginAs("pawel8732", "asdzxc");
	}
	
	@Test
	public void reserveTest() {
		LoginPage lp = new LoginPage(driver);
		lp.goToLoginPage();
		lp.loginAs("pawel8732", "asdzxc");
		ReservationPage rp = new ReservationPage();
		rp.from("Paris", "3", "15");
		rp.to("Sydney", "4", "20");
		rp.passCount("2");
		rp.firstClass();
		rp.airlineSelect("Unified Airlines");
		rp.oneWay();
		rp.submit();
		Reservation2_3Page rp23 = new Reservation2_3Page();
		rp23.flights(3, 4);
		rp23.reserve();
		rp23.passenger1("Pawel", "pawel", "KSML");
		rp23.passenger2("Pawel2", "pawel2", "VGML");
		rp23.card("Visa", "585854856856", "11", "2020", "Pawel", "Jakis", "aaaa");
		rp23.ticketlessTrv();
		rp23.billingAdd();
		rp23.buyTicket();
		rp23.logout();
		
	}
	@After
	public void awter() {
		//zamykanie przegladarki po tescie
		Init.sleep(1);
		Init.close();
		
	}

}
