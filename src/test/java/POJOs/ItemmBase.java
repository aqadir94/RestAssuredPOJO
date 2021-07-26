package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ItemmBase {
	
	private String Name;
	
	
	
	
	public ItemmBase() {
		
	}
	
	
	public ItemmBase(String name) {
		Name = name;
		
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	
	
	

	
	
	
	





}
