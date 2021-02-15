package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dto.DtoOrder;
import dto.OrderStatus;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrder extends core.Base {
	
	DtoOrder order;

	@Test
	public void TesteA3VendePet() {
		System.out.println("Exercicio A - 3");
		
		order = new DtoOrder(1,1,1, OrderStatus.PLACED.name().toLowerCase());
		realizarPost(order, "/store/order");

	}
	
	@Test
	public void TesteA4AtualizaVenda () {
		System.out.println("Exercicio A - 4");
		order = new DtoOrder(1,1,1, OrderStatus.DELIVERED.name().toLowerCase());
		realizarPost(order, "/store/order");
		
	}
	
	
	@Test
	public void TesteA5ConsultaOrder() {
		System.out.println("Exercicio A - 5");
		
		String endpoint = "/store/order/".concat(String.valueOf(1));
		ValidatableResponse validatableResponse = realizarGet(endpoint);
		validatableResponse.assertThat()
			.body("status", equalTo("delivered"))
			.body("id", equalTo(1))
			.body("petId", equalTo(1));

	}
	
	
	
	
	
	

}
