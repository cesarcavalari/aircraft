package br.com.celari.aircraft.service;

import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.celari.aircraft.dto.ProcessInstanceDTO;

@Service
public class ProcessInstanceService {

	@Autowired
    private RuntimeService runtimeService;
	
	public ProcessInstanceDTO start(String processKey) {
		org.flowable.engine.runtime.ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processKey);
		return new ProcessInstanceDTO(processInstance);
	}

}
