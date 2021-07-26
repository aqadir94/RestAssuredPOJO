package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionRequest extends CollectionBase{
	
	

	private ArrayList<ItemmRequest> item;
	
	
	
	public CollectionRequest(Info info, ArrayList<ItemmRequest> item) {
		
		super(info);
		this.item = item;
	}
	public CollectionRequest() {
	
	}
	
	public ArrayList<ItemmRequest> getItem() {
		return item;
	}
	public void setItem(ArrayList<ItemmRequest> item) {
		this.item = item;
	}
	
	
	
	


}
