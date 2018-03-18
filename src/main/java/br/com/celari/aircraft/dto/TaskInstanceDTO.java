package br.com.celari.aircraft.dto;

import java.util.Map;

public class TaskInstanceDTO {
	
	private String id;
	private Map<String, Object> variables;
	
	public String getId() {
		return id;
	}
	
	public Map<String, Object> getVariables() {
		return variables;
	}

}
