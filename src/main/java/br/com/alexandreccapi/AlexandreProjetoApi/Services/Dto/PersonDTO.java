package br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Person;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;

    private List<Project> projects = new ArrayList<Project>();

    public PersonDTO (Person person) {
        this.id = person.getId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.phoneNumber = person.getPhoneNumber();
        this.hireDate = person.getHireDate();
        this.projects = person.getProjects();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public static List<PersonDTO> converter(List<Person> persons) {
        return persons.stream().map(PersonDTO::new).collect(Collectors.toList());
    }
}
