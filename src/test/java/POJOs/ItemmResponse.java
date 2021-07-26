package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemmResponse extends ItemmBase {
	
	private ArrayList<ItemsdfResponse> item;
	
	
	
	public ItemmResponse() {
		
	}
	
	
	public ItemmResponse(String name, ArrayList<ItemsdfResponse> item) {
		super(name);
		this.item = item;
	}

	public ArrayList<ItemsdfResponse> getItem() {
		return item;
	}
	public void setItem(ArrayList<ItemsdfResponse> item) {
		this.item = item;
	}
	
	
	

	
	
	
	





}
