package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsdfRequest extends ItemsdfBase {

	private RequestRequest request;

	public ItemsdfRequest() {

	}

	public ItemsdfRequest(String name, RequestRequest request) {
	
		super(name);
		this.request = request;
	}

	

	public RequestRequest getRequest() {
		return request;
	}

	public void setRequest(RequestRequest request) {
		this.request = request;
	}

}
