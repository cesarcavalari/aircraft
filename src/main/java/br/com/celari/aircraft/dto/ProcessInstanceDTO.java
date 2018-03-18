package br.com.celari.aircraft.dto;

public class ProcessInstanceDTO {

	private String id;
	
	public ProcessInstanceDTO(org.flowable.engine.runtime.ProcessInstance processInstance) {
		this.id = processInstance.getId();
	}
	
	public String getId() {
		return id;
	}

}
