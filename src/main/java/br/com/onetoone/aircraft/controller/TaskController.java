package br.com.onetoone.aircraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.onetoone.aircraft.dto.ACTaskInstance;
import br.com.onetoone.aircraft.dto.ACTaskFilter;
import br.com.onetoone.aircraft.service.ACTaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private ACTaskService taskService;
	
	@GetMapping
	public List<ACTaskInstance> findTasks(@RequestBody ACTaskFilter filter){
		return taskService.getTasks(filter);
	}

}
