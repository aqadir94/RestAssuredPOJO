package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CollectionBase {
	
	
	private Info info;

	
	
	public CollectionBase(Info info) {
		
		this.info = info;
		
	}
	public CollectionBase() {
	
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}

	

}
