package guterres.adriano.selenium.testscases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import guterres.adriano.selenium.ressources.DriverSetup;
import guterres.adriano.selenium.tasks.FillCepTask;
import guterres.adriano.selenium.verificationpoints.CepVerificationPoint;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FillCepTestCaseWithFirefox {
	private CepVerificationPoint cepVerificationPoint;
	private FillCepTask tasks;
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = DriverSetup.getDriverConfigFirefox(
				"http://eliasnogueira.com/arquivos_blog/selenium/desafio/4desafio/");
		this.driver.manage().window().maximize();
		this.cepVerificationPoint = new CepVerificationPoint(driver);
		this.tasks = new FillCepTask(driver);		
	}	
	@Test
	public void main() {
		this.tasks.fillCep("94814230");
		boolean result = cepVerificationPoint.cepResult();		
		assertTrue(result);	
	}	
	@After
	public void tearDown() {
		driver.quit();
	}
}
