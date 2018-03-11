package br.com.onetoone.aircraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.onetoone.aircraft.dto.ACProcessInstance;
import br.com.onetoone.aircraft.service.ACProcessInstanceService;

@RestController
@RequestMapping("/processintances")
public class ProcessInstanceController {
	
	@Autowired
	private ACProcessInstanceService processInstanceService;

	@GetMapping("/echo")
	public String echo(){
		return "echo";
	}
	
	@PostMapping("/start/{processKey}")
	public ACProcessInstance startProcessInstance(@PathVariable String processKey){
		return processInstanceService.start(processKey);
	}
}
