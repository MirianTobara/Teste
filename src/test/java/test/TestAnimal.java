package test;

import org.junit.Test;

import dto.DtoCategory;
import dto.DtoPet;

public class TestAnimal extends core.Base {

	@Test
	public void cadastraNovoPet() {
		System.out.println("Exercicio A - 2");
		
		DtoCategory category = new DtoCategory().criarCategoriaDog();
		DtoPet pet = new DtoPet().criarPet(1,"Mel", category);
		
		realizarPost(pet, "/pet");

	}
	
}
