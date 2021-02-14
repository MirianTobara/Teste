package dto;

public class DtoCategory {

	private int id;
	private String name;
	
	public DtoCategory(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DtoCategory() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public DtoCategory criarCategoriaDog() {
		DtoCategory category = new DtoCategory(2, "dog");
		return category;
	}
	
	public DtoCategory criarCategoriaCat() {
		DtoCategory category = new DtoCategory(1, "cat");
		return category;
	}
}
