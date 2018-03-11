package br.com.onetoone.aircraft.dto;

import java.util.Map;

public class ACTaskInstance {
	
	private String id;
	private Map<String, Object> variables;
	
	public String getId() {
		return id;
	}
	
	public Map<String, Object> getVariables() {
		return variables;
	}

}
