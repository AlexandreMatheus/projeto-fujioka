package br.com.alexandreccapi.AlexandreProjetoApi.Services;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Task;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.TaskRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.ProjectHistoryDTO;
import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.TaskDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskDTO getTaskById(Long id) throws NotFoundException {
        Optional<Task> task = taskRepository.findById(id);

        if (!task.isPresent()) {
            throw new NotFoundException("department not found!");
        }

        return new TaskDTO(task.get());
    }

    public List<TaskDTO> getTaskByDatas(Date anoInicial, Date anoFinal){
        List<TaskDTO> tasks =
                TaskDTO.converter(taskRepository.findByStartDateBetween(anoInicial, anoFinal));

        return tasks;
    }

    public List<TaskDTO> getTaskByDatasAndStatus(Date anoInicial, Date anoFinal, Long status){
        List<TaskDTO> tasks =
                TaskDTO.converter(taskRepository.findByStartDateBetweenAndStatus(anoInicial, anoFinal, status));

        return tasks;
    }

    public List<TaskDTO> getTaskByPoints(Long pontoInicial, Long pontoFinal){
        List<TaskDTO> tasks =
                TaskDTO.converter(taskRepository.findByTaskPointsBetween(pontoInicial, pontoFinal));

        return tasks;
    }

    public List<TaskDTO> getTasks(){
        return new ArrayList<TaskDTO>(TaskDTO.converter(taskRepository.findAll()));
    }
}
