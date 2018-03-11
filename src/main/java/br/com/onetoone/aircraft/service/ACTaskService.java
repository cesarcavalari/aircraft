package br.com.onetoone.aircraft.service;

import java.util.List;

import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.onetoone.aircraft.dto.ACTaskFilter;
import br.com.onetoone.aircraft.dto.ACTaskInstance;

public class ACTaskService {
	
	@Autowired
	private TaskService taskService;
	
	public List<ACTaskInstance> getTasks(ACTaskFilter filter) {
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(filter.getAssignee()).list();
		return null;
	}

}
