package test;

import org.junit.Test;

import dto.DtoOrder;
import dto.OrderStatus;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;

public class TestOrder extends core.Base {

	@Test
	public void vendePet() {
		System.out.println("Exercicio A - 4");
		
		DtoOrder order = new DtoOrder(1,1, OrderStatus.PLACED.name().toLowerCase());
		realizarPost(order, "/store/order");

	}
	
	@Test
	public void ConsultaOrder() {
		System.out.println("Exercicio A - 5");
		
		String endpoint = "/store/order/".concat(String.valueOf(1));
		ValidatableResponse validatableResponse = realizarGet(endpoint);
		validatableResponse.assertThat()
			.body("status", equalTo("delivered"))
			.body("id", equalTo(1))
			.body("petId", equalTo(1));

	}
	
	
	
	

}
