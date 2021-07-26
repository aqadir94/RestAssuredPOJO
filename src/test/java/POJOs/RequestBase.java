package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RequestBase {


	private String method;
	ArrayList<HeaderInner> header;
	Body body;
	String description;

	public RequestBase( String method, ArrayList<HeaderInner> header, Body body, String description) {
		
		
		this.method = method;
		this.header = header;
		this.body = body;
		this.description = description;
	}

	public RequestBase() {

	}



	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public ArrayList<HeaderInner> getHeader() {
		return header;
	}

	public void setHeader(ArrayList<HeaderInner> header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
