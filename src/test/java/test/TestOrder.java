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

		order = new DtoOrder(1, 1, OrderStatus.PLACED.name().toLowerCase());
		realizarPost(order, "/store/order");

	}

	@Test
	public void TesteA4AtualizaVenda() {
		System.out.println("Exercicio A - 4");
		order = new DtoOrder(1, 1, OrderStatus.DELIVERED.name().toLowerCase());
		realizarPost(order, "/store/order");

	}

	@Test
	public void TesteA5ConsultaOrder() {
		System.out.println("Exercicio A - 5");

		String endpoint = "/store/order/".concat(String.valueOf(1));
		ValidatableResponse validatableResponse = realizarGet(endpoint);
		validatableResponse.assertThat().body("status", equalTo("delivered")).body("id", equalTo(1)).body("petId",
				equalTo(1));

	}

	@Test
	public void TesteB7VendaPet() {
		System.out.println("Exercicio B - 7");

		DtoOrder order;

		for (int i = 2; i < 7; i++) {
			// Venda dog
			order = new DtoOrder(i, i, OrderStatus.PLACED.name().toLowerCase());
			realizarPost(order, "/store/order");

			// Venda cat
			order = new DtoOrder(i + 5, i + 5, OrderStatus.PLACED.name().toLowerCase());
			realizarPost(order, "/store/order");
		}

	}

	@Test
	public void TesteB8AlteraStatusVendePet() {
		System.out.println("Exercicio B - 8");

		DtoOrder order;

		for (int i = 2; i < 7; i++) {
			// Venda dog
			order = new DtoOrder(i, i, OrderStatus.DELIVERED.name().toLowerCase());
			realizarPost(order, "/store/order");

			// Venda cat
			order = new DtoOrder(i + 5, i + 5, OrderStatus.APPROVED.name().toLowerCase());
			realizarPost(order, "/store/order");
		}

	}

	@Test
	public void TesteB9ConsultaVendaPet() {
		System.out.println("Exercicio B - 9");

		String endpoint;
		ValidatableResponse validatableResponse;

		for (int i = 2; i < 7; i++) {
			endpoint = "/store/order/".concat(String.valueOf(i));
			validatableResponse = realizarGet(endpoint);
			validatableResponse.assertThat().body("status", equalTo("delivered")).body("id", equalTo(i)).body("petId",
					equalTo(i));
		}

		for (int i = 7; i < 12; i++) {
			endpoint = "/store/order/".concat(String.valueOf(i));
			validatableResponse = realizarGet(endpoint);
			validatableResponse.assertThat().body("status", equalTo("approved")).body("id", equalTo(i)).body("petId",
					equalTo(i));
		}

	}

}
