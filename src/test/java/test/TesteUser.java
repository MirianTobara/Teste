package test;

import org.junit.Test;

import dto.DtoUser;

public class TesteUser  extends core.Base{
	
	@Test
	public void cadastraNovoUser()  {			
		
		DtoUser userDto = new DtoUser().criarUser("Lucia", "Nogueira");
		realizarPost(userDto,"/user");
			
	}
	

}
