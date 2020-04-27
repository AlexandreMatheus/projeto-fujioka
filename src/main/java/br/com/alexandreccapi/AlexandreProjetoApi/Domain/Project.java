package br.com.alexandreccapi.AlexandreProjetoApi.Domain;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectTitle;
    private Long salarioMinimo;
    private Long salarioMaximo;

    @OneToOne
    private Person manager;

    @ManyToMany
    private List<Task> tasks = new ArrayList<Task>();

    public Project(Long id, String projectTitle, Person manager, Long salarioMinimo, Long salarioMaximo) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.salarioMinimo = salarioMinimo;
        this.salarioMaximo = salarioMaximo;
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Long getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(Long salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public Long getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(Long salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Person getManager() {
        return manager;
    }
}
