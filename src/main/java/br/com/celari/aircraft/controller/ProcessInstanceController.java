package br.com.celari.aircraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.celari.aircraft.dto.ProcessInstanceDTO;
import br.com.celari.aircraft.service.ProcessInstanceService;

@RestController
@RequestMapping("/processintances")
public class ProcessInstanceController {
	
	@Autowired
	private ProcessInstanceService processInstanceService;

	@GetMapping("/echo")
	public String echo(){
		return "echo";
	}
	
	@PostMapping("/start/{processKey}")
	public ProcessInstanceDTO startProcessInstance(@PathVariable String processKey){
		return processInstanceService.start(processKey);
	}
}
