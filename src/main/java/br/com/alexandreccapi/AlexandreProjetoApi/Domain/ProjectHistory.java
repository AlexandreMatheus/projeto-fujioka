package br.com.alexandreccapi.AlexandreProjetoApi.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProjectHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;

    @OneToOne
    private Department department;

    @OneToOne
    private Person pessoa;

    @OneToOne
    private Project projeto;

    public ProjectHistory(Long id, Date startDate, Date endDate, Department department, Person pessoa, Project projeto) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.department = department;
        this.pessoa = pessoa;
        this.projeto = projeto;
    }

    public ProjectHistory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getPessoa() {
        return pessoa;
    }

    public void setPessoa(Person pessoa) {
        this.pessoa = pessoa;
    }

    public Project getProjeto() {
        return projeto;
    }

    public void setProjeto(Project projeto) {
        this.projeto = projeto;
    }
}
