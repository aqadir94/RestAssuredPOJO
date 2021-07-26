package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionResponse extends CollectionBase {
	
	

	private ArrayList<ItemmResponse> item;
	
	
	
	public CollectionResponse(Info info, ArrayList<ItemmResponse> item) {
		
		super(info);
		this.item = item;
	}
	public CollectionResponse() {
	
	}
	

	public ArrayList<ItemmResponse> getItem() {
		return item;
	}
	public void setItem(ArrayList<ItemmResponse> item) {
		this.item = item;
	}
	
	
	
	


}
