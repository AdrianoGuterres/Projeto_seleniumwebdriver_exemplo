package guterres.adriano.selenium.verificationpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import guterres.adriano.selenium.appobjects.CepAppObject;
import guterres.adriano.selenium.tasks.FillCepTask;

public class CepVerificationPoint {

	private WebDriver driver;
	private FillCepTask fillCepTask;
	
	public CepVerificationPoint(WebDriver driver) {
		this.driver = driver;		
	}
	
	public boolean cepResult() {
		
		WebElement elementCep = this.driver.findElement(By.xpath("//*[@id=\"cep\"]"));
		elementCep.sendKeys(Keys.TAB);
		

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement elementRua = this.driver.findElement(By.xpath("//*[@id=\"rua\"]"));		
		
		String innerTextBox = elementRua.getAttribute("value");
		
		System.out.println(innerTextBox.length());
		
		if(innerTextBox.length() > 2) {
			return true;			
		}else {
			return false;
		}
	}
	
	

}
