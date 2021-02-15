package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dto.DtoCategory;
import dto.DtoPet;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAnimal extends core.Base {

	@Test
	public void TesteA2cadastraNovoPet() {
		System.out.println("Exercicio A - 2");
		
		DtoCategory category = new DtoCategory().criarCategoriaDog();
		DtoPet pet = new DtoPet().criarPet(1,"Mel", category);
		
		realizarPost(pet, "/pet");

	}
	
	 
	
}
