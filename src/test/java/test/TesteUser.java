package test;

import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dto.DtoCategory;
import dto.DtoOrder;
import dto.DtoPet;
import dto.DtoUser;
import dto.OrderStatus;
import net.bytebuddy.utility.RandomString;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteUser  extends core.Base{
	
	@Test
	public void TesteA1cadastraNovoUser()  {
		System.out.println("Exercicio 1 - A");
		
		DtoUser userDto = new DtoUser().criarUser(1,"Lucia", "Nogueira");
		realizarPost(userDto,"/user");
			
	}
	
	@Test
	public void TesteB6Cadastro() {
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
	
	
     }





				

