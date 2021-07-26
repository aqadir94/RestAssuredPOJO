package POJOs;

import java.util.ArrayList;

public class URL {
	
	private String raw;
	private String protocol;
	private ArrayList<String> host;
	private ArrayList<String> path;
	
	
	
	public URL(String raw, String protocol, ArrayList<String> host, ArrayList<String> path) {
	
		this.raw = raw;
		this.protocol = protocol;
		this.host = host;
		this.path = path;
	}
	
	
	
	
	public URL() {
		
	}




	public String getRaw() {
		return raw;
	}
	public void setRaw(String raw) {
		this.raw = raw;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public ArrayList<String> getHost() {
		return host;
	}
	public void setHost(ArrayList<String> host) {
		this.host = host;
	}
	public ArrayList<String> getPath() {
		return path;
	}
	public void setPath(ArrayList<String> path) {
		this.path = path;
	}
	
	

}
