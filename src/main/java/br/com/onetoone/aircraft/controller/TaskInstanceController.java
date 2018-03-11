package br.com.onetoone.aircraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.onetoone.aircraft.dto.ACTaskInstance;
import br.com.onetoone.aircraft.dto.ACTaskFilter;
import br.com.onetoone.aircraft.service.ACTaskInstanceService;

@RestController
@RequestMapping("taskinstances")
public class TaskInstanceController {

	@Autowired
	private ACTaskInstanceService taskInstanceService;
	
	@PostMapping("/complete")
	public void complete(@RequestBody ACTaskInstance taskInstance){
		taskInstanceService.complete(taskInstance);
	}
	
}
