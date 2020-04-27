package br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Task;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TaskDTO {

    private Long id;
    private String title;
    private String description;
    private Long taskPoints;
    private Long status;
    private Date startDate;
    private Date endDate;

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.taskPoints = task.getTaskPoints();
        this.status = task.getStatus();
        this.startDate = task.getStartDate();
        this.endDate = task.getEndDate();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getTaskPoints() {
        return taskPoints;
    }

    public Long getStatus() {
        return status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public static List<TaskDTO> converter(List<Task> tasks) {
        return tasks.stream().map(TaskDTO::new).collect(Collectors.toList());
    }
}
