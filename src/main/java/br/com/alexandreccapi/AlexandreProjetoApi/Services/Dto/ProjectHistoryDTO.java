package br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectHistoryDTO {

    private Long id;
    private Date startDate;
    private Date endDate;
    private Department department;
    private Person pessoa;
    private Project projeto;

    public ProjectHistoryDTO (ProjectHistory projectHistory) {
        this.id = projectHistory.getId();
        this.startDate = projectHistory.getStartDate();
        this.endDate = projectHistory.getEndDate();
        this.department = projectHistory.getDepartment();
        this.pessoa = projectHistory.getPessoa();
        this.projeto = projectHistory.getProjeto();
    }

    public Long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Department getDepartment() {
        return department;
    }

    public Person getPessoa() {
        return pessoa;
    }

    public Project getProjeto() {
        return projeto;
    }

    public static List<ProjectHistoryDTO> converter(List<ProjectHistory> projectHistory) {
        return projectHistory.stream().map(ProjectHistoryDTO::new).collect(Collectors.toList());
    }
}
