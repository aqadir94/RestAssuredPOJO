package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestRequest extends RequestBase{

	private String url;
	

	public RequestRequest(String url, String method, ArrayList<HeaderInner> header, Body body, String description) {
		super(method,header,body,description);
		this.url = url;
		
	}

	public RequestRequest() {

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}
