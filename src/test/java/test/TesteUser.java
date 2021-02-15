package test;

import java.util.Random;

import org.junit.Test;

import dto.DtoCategory;
import dto.DtoOrder;
import dto.DtoPet;
import dto.DtoUser;
import dto.OrderStatus;
import net.bytebuddy.utility.RandomString;

public class TesteUser  extends core.Base{
	
	@Test
	public void cadastraNovoUser()  {			
		
		DtoUser userDto = new DtoUser().criarUser(1,"Lucia", "Nogueira");
		realizarPost(userDto,"/user");
			
	}
	
	@Test
	public void testeB6Cadastro() {
		System.out.println("Exercicio B - 6");
		
		for (int i = 2; i < 7; i++) {
			DtoUser userDto = new DtoUser().criarUser(i,RandomString.make(4), RandomString.make(5));
			realizarPost(userDto,"/user");
		}
			for (int a = 2; a <7; a++) {
				DtoCategory category = new DtoCategory().criarCategoriaDog();
				DtoPet pet = new DtoPet().criarPet(a,RandomString.make(4), category);
				realizarPost(pet, "/pet");
			}
				
				for (int b = 7; b <12; b++) {
					DtoCategory category = new DtoCategory().criarCategoriaCat();
					DtoPet pet = new DtoPet().criarPet(b,RandomString.make(4), category);
					realizarPost(pet, "/pet");
				}
		
	}
	
	
     @Test
	public void TesteB7vendaPetsDog () {
		System.out.println("Exercicio 7 - B");
		
		int i;
		int a;
		int b;
		
		//Venda Dogs
		for ( i = 2; i < 7; i++) {
			DtoUser userDto = new DtoUser().criarUser(i,RandomString.make(4), RandomString.make(5));
			realizarPost(userDto,"/user");
			}
			
			for ( a = 2; a <7; a++) {
				DtoCategory category = new DtoCategory().criarCategoriaDog();
				DtoPet pet = new DtoPet().criarPet(a,RandomString.make(4), category);
				realizarPost(pet, "/pet");
				
			}
		
			for ( b = 1; b< 5; b++) {
				
		
			
		
		DtoOrder order = new DtoOrder(b,i,a, OrderStatus.PLACED.name().toLowerCase());
			realizarPost(order, "/store/order");
			}
			
	
     }
}




				

