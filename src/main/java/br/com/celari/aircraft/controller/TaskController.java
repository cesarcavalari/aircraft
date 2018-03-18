package br.com.celari.aircraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.celari.aircraft.dto.TaskInstanceDTO;
import br.com.celari.aircraft.dto.TaskFilterDTO;
import br.com.celari.aircraft.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public List<TaskInstanceDTO> findTasks(@RequestBody TaskFilterDTO filter){
		return taskService.getTasks(filter);
	}

}
