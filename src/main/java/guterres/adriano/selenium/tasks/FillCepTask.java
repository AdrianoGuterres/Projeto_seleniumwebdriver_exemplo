package guterres.adriano.selenium.tasks;

import org.openqa.selenium.WebDriver;

import guterres.adriano.selenium.appobjects.CepAppObject;


public class FillCepTask {
	
	private CepAppObject cepAppObject;	
	
	public FillCepTask(WebDriver driver) {
		this.cepAppObject = new CepAppObject(driver);		
	}
	
	public void fillCep(String cep) {
		this.cepAppObject.getCepTextfield().sendKeys(cep);		
	}
	
	public void clearCep(){
		this.cepAppObject.getLimparButton().click();
	}

}
