package br.com.celari.aircraft.service;

import java.util.Map;

import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.celari.aircraft.dto.TaskInstanceDTO;

@Service
public class TaskInstanceService {

	@Autowired
	private TaskService taskService;

	public void complete(TaskInstanceDTO taskInstance) {
		taskService.complete(taskInstance.getId(), taskInstance.getVariables());
	}

	public void complete(String taskId, Map<String, Object> variables) {
		taskService.complete(taskId, variables);
	}

}
