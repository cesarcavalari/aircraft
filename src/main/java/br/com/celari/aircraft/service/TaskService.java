package br.com.celari.aircraft.service;

import java.util.List;

import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.celari.aircraft.dto.TaskFilterDTO;
import br.com.celari.aircraft.dto.TaskInstanceDTO;

@Service
public class TaskService {
	
	@Autowired
	private org.flowable.engine.TaskService taskService;
	
	public List<TaskInstanceDTO> getTasks(TaskFilterDTO filter) {
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(filter.getAssignee()).list();
		return null;
	}

}
