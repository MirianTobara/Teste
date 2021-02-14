package dto;

import java.util.ArrayList;
import java.util.List;

public class DtoPet {
	
	private int id;
	private String name;
	private String status;
	private List<String> photoUrls;
	private DtoCategory category;
	private List<DtoTag> tags;
	
	public DtoPet(int id, String name, String status, List<String> photoUrls, DtoCategory category, List<DtoTag> tags) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.photoUrls = photoUrls;
		this.category = category;
		this.tags = tags;
	}
	
	public DtoPet criarPet(int code, String name, DtoCategory category) {
		
		DtoPet pet = new DtoPet(); 
		
		pet.setId(code);
		pet.setCategory(category);
		pet.setName(name);
		pet.setStatus("available");
		
		List<String> photoUrls = new ArrayList<String>();
		photoUrls.add("http://www.teste.com");
		pet.setPhotoUrls(photoUrls);	
		
		List<DtoTag> tags = new ArrayList<DtoTag>();
		tags.add(new DtoTag().criarTag());
		pet.setPhotoUrls(photoUrls);
		pet.setTags(tags);
		
		return pet;
				
	}
	
	public DtoPet() {
	}

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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public DtoCategory getCategory() {
		return category;
	}
	public void setCategory(DtoCategory category) {
		this.category = category;
	}
	public List<DtoTag> getTags() {
		return tags;
	}
	public void setTags(List<DtoTag> tags) {
		this.tags = tags;
	}
	
}
