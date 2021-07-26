package POJOs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ItemsdfBase {

	private String name;


	public ItemsdfBase() {

	}

	public ItemsdfBase(String name) {
	
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
