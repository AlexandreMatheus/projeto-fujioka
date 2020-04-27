package br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Project;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectDTO {

    private Long id;
    private String projectTitle;
    private Long salarioMinimo;
    private Long salarioMaximo;

    private List<Task> tasks = new ArrayList<Task>();

    public ProjectDTO(Project project) {
        this.id = project.getId();
        this.projectTitle = project.getProjectTitle();
        this.salarioMaximo = project.getSalarioMaximo();
        this.salarioMinimo = project.getSalarioMinimo();
        this.tasks = project.getTasks();
    }

    public Long getId() {
        return id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public Long getSalarioMinimo() {
        return salarioMinimo;
    }

    public Long getSalarioMaximo() {
        return salarioMaximo;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public static List<ProjectDTO> converter(List<Project> projects) {
        return projects.stream().map(ProjectDTO::new).collect(Collectors.toList());
    }
}
