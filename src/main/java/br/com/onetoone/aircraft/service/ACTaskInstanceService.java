package br.com.onetoone.aircraft.service;

import java.util.List;
import java.util.Map;

import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onetoone.aircraft.dto.ACTaskInstance;
import br.com.onetoone.aircraft.dto.ACTaskFilter;

@Service
public class ACTaskInstanceService {

	@Autowired
	private TaskService taskService;

	public void complete(ACTaskInstance taskInstance) {
		taskService.complete(taskInstance.getId(), taskInstance.getVariables());
	}

	public void complete(String taskId, Map<String, Object> variables) {
		taskService.complete(taskId, variables);
	}

}
