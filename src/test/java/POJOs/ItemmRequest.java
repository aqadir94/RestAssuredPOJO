package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemmRequest extends ItemmBase {
	
	private ArrayList<ItemsdfRequest> item;
	
	
	
	public ItemmRequest() {
		
	}
	
	
	public ItemmRequest(String name, ArrayList<ItemsdfRequest> item) {
		super(name);
		this.item = item;
	}


	
	public ArrayList<ItemsdfRequest> getItem() {
		return item;
	}
	public void setItem(ArrayList<ItemsdfRequest> item) {
		this.item = item;
	}
	
	
	

	
	
	
	





}
