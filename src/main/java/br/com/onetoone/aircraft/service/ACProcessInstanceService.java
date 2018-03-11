package br.com.onetoone.aircraft.service;

import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onetoone.aircraft.dto.ACProcessInstance;

@Service
public class ACProcessInstanceService {

	@Autowired
    private RuntimeService runtimeService;
	
	public ACProcessInstance start(String processKey) {
		org.flowable.engine.runtime.ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processKey);
		return new ACProcessInstance(processInstance);
	}

}
