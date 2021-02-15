package dto;

import java.sql.Timestamp;

public class DtoOrder {
	
	
	private int idOrdem;
	private int id;
	private int petId;
	private int quantity;
	private String shipDate;
	private String status;
	private boolean complete;
	
	public DtoOrder(int idOrdem, int id, int petId, int quantity, String shipDate, String status, boolean complete) {
		super();
		this.id = id;
		this.petId = petId;
		this.quantity = quantity;
		this.shipDate = shipDate;
		this.status = status;
		this.complete = complete;
		this.idOrdem = idOrdem;
	}
	
	public int getIdOrdem() {
		return idOrdem;
	}

	public void setIdOrdem(int idOrdem) {
		this.idOrdem = idOrdem;
	}

	public DtoOrder(int idOrdem, int id, int petId, String status) {
		this.id = id;
		this.petId = petId;
		this.quantity = 1;
		this.status = status;
		this.shipDate = new Timestamp(System.currentTimeMillis()).toInstant().toString();
		this.complete = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
}
