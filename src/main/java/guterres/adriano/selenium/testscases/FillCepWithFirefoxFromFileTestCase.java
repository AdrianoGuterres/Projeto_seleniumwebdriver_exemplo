package guterres.adriano.selenium.testscases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import guterres.adriano.selenium.ressources.DriverSetup;
import guterres.adriano.selenium.tasks.FillCepTask;
import guterres.adriano.selenium.verificationpoints.CepVerificationPoint;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FillCepWithFirefoxFromFileTestCase {
	private CepVerificationPoint cepVerificationPoint;
	private FillCepTask tasks;
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = DriverSetup.getDriverConfigForChrome(
				"http://eliasnogueira.com/arquivos_blog/selenium/desafio/4desafio/");
		this.cepVerificationPoint = new CepVerificationPoint(driver);
		this.tasks = new FillCepTask(driver);		
	}			
	@Test
	@FileParameters("src/cepsBase.csv")
	public void main(String cpf) {
		this.tasks.fillCep(cpf);
		boolean result = cepVerificationPoint.cepResult();		
		assertTrue(result);	
	}	
	@After
	public void tearDown() {
		driver.quit();
	}
	

}
