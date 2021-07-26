package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsdfResponse extends ItemsdfBase{

	private String id;
	private RequestResponse request;
	private ArrayList<?> response;

	public ItemsdfResponse() {

	}

	public ItemsdfResponse(String name,String id, RequestResponse request,ArrayList<?> response) {
	
	super(name);
	this.id=id;
		this.request = request;
		this.response=response;
		
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestResponse getRequest() {
		return request;
	}

	public void setRequest(RequestResponse request) {
		this.request = request;
	}

	public ArrayList<?> getResponse() {
		return response;
	}

	public void setResponse(ArrayList<?> response) {
		this.response = response;
	}

}
