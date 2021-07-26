package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestResponse extends RequestBase{

	private URL url;
	ArrayList<String>path;
	
	

	public RequestResponse(URL url, String method, ArrayList<HeaderInner> header, Body body, String description,ArrayList<String>path) {
		super(method,header,body,description);
		this.path=path;
		this.url = url;
		
	}

	public ArrayList<String> getPath() {
		return path;
	}

	public void setPath(ArrayList<String> path) {
		this.path = path;
	}

	public RequestResponse() {

	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}


}
