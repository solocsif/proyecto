package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import page_home.page_home;
import org.openqa.selenium.WebElement;
public class selenium extends page_home{
	public void abrir() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javiercastillo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/INDEX/admon/Administrador/admonregis.html");
	}
	public void registrar() throws InterruptedException {
		Thread.sleep(2000);
		WebElement cisf=driver.findElement(By.id("nombre"));
		cisf.sendKeys("natalia paris");
		Thread.sleep(2000);
		WebElement apellido=driver.findElement(By.id("td"));
		apellido.sendKeys("cedula");
		Thread.sleep(2000);
		WebElement cedula=driver.findElement(By.id("nd"));
		cedula.sendKeys("123456");
		Thread.sleep(2000);
		WebElement fecha=driver.findElement(By.id("fn"));
		fecha.sendKeys("250318");
		Thread.sleep(2000);
		WebElement correo=driver.findElement(By.id("correo"));
		correo.sendKeys("melomamas@hotmail.com");
		Thread.sleep(2000);
		WebElement direccion=driver.findElement(By.id("dr"));
		direccion.sendKeys("altamira 265");
		Thread.sleep(2000);
		WebElement telefono=driver.findElement(By.id("tl"));
		telefono.sendKeys("4715597");
		Thread.sleep(2000);
		WebElement boton=driver.findElement(By.id("rg"));
		boton.click();
	}
	public void consultar() throws InterruptedException {
		
	}
}
