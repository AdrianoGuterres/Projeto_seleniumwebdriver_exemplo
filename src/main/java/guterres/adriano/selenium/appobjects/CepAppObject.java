package guterres.adriano.selenium.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CepAppObject {
	
private WebDriver driver;
	
	public CepAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getCepTextfield() {		
		return this.driver.findElement(By.xpath("//*[@id=\"cep\"]")) ;
	}
	
	public WebElement getLogradouroTextfield() {		
		return this.driver.findElement(By.xpath("//*[@id=\"rua\"]")) ;
	}
	
	public WebElement getNumeroTextField() {		
		return this.driver.findElement(By.xpath("//*[@id=\"numero\"]")) ;
	}
	
	public WebElement getComplementoTextField() {		
		return this.driver.findElement(By.xpath("//*[@id=\"complemento\"]")) ;
	}
	
	public WebElement getBairroTextField() {		
		return this.driver.findElement(By.xpath("//*[@id=\"bairro\"]")) ;
	}
	
	public WebElement getCidadeTextField() {		
		return this.driver.findElement(By.xpath("//*[@id=\"cidade\"]")) ;
	}
	
	public WebElement getEstadoTextField() {		
		return this.driver.findElement(By.xpath("//*[@id=\"estado\"]")) ;
	}
	
	public WebElement getLimparButton() {		
		return this.driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[2]/form/input")) ;
	}


}
