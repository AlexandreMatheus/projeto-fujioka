package br.com.alexandreccapi.AlexandreProjetoApi.Domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;

    @OneToMany
    private List<Person> pessoas = new ArrayList<Person>();

    public Department(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Person> getPessoas() {
        return pessoas;
    }

}
