package br.com.celari.aircraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.celari.aircraft.dto.TaskInstanceDTO;
import br.com.celari.aircraft.service.TaskInstanceService;
import br.com.celari.aircraft.dto.TaskFilterDTO;
@RestController
@RequestMapping("taskinstances")
public class TaskInstanceController {

	@Autowired
	private TaskInstanceService taskInstanceService;
	
	@PostMapping("/complete")
	public void complete(@RequestBody TaskInstanceDTO taskInstance){
		taskInstanceService.complete(taskInstance);
	}
	
}
