package pasos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import selenium.selenium;
public class pasos {
	selenium local=new selenium();
	@Given("^abrir el localhost$")
	public void abrir_el_localhost() throws Exception{
	  local.abrir();
	    
	}

	@Then("^inscribir datos$")
	public void inscribir_datos() throws Exception{
	    local.registrar();
	    
	}

	@Then("^consultar si fueron creados los datos$")
	public void consultar_si_fueron_creados_los_datos() throws Exception{
	  local.consultar();
	}

}
