package guterres.adriano.selenium.testsuites;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import guterres.adriano.selenium.testscases.FillCepTestCaseWithChrome;
import guterres.adriano.selenium.testscases.FillCepTestCaseWithFirefox;
import guterres.adriano.selenium.testscases.FillCepWithChromeFromFileTestCase;
import guterres.adriano.selenium.testscases.FillCepWithFirefoxFromFileTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	FillCepTestCaseWithChrome.class,
	FillCepWithChromeFromFileTestCase.class,
	FillCepTestCaseWithFirefox.class,
	FillCepWithFirefoxFromFileTestCase.class
})
public class AllTests {

	@BeforeClass
	public static void initTest() {
		System.out.println("Iniciando os testes...");;
	}

	@AfterClass
	public static void endTest() {
		System.out.println("Finalizando os testes...");;
	}
	

}
