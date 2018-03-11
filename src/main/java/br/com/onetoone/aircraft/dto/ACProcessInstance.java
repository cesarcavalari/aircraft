package br.com.onetoone.aircraft.dto;

public class ACProcessInstance {

	private String id;
	
	public ACProcessInstance(org.flowable.engine.runtime.ProcessInstance processInstance) {
		this.id = processInstance.getId();
	}
	
	public String getId() {
		return id;
	}

}
