package dto;

public class DtoTag {

	private int id;
	private String name;
	
	public DtoTag(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DtoTag() {}
	
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

	public DtoTag criarTag() {
		return new DtoTag(1, "tag1");
	}
	
	
}
