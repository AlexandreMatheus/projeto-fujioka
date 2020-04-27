package br.com.alexandreccapi.AlexandreProjetoApi.WebConfig;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Department;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Person;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Project;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Task;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.ProjectHistory;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.DepartmentRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.ProjectRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.TaskRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.PersonRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.ProjectHistoryRepository;

@Configuration
public class WebConfig implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ProjectHistoryRepository projectHistoryRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");

        Person pe1 =  new Person(null, "MICHAEL", "FASSBENDER", "michael@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe2 =  new Person(null, "BRUCE", "WILLIS", "bruce@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe3 =  new Person(null, "Arnold", "Schwarzenegger", "Arnold@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe4 =  new Person(null, "Kaique", "Leonardo", "Kaique@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe5 =  new Person(null, "Leonardo", "Marcos", "Leonardo@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe6 =  new Person(null, "Vitoria", "Allana", "Vitória@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe7 =  new Person(null, "Thales", "Mário", "Thales@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe8 =  new Person(null, "Pietro", "Joao", "Pietro@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe9 =  new Person(null, "Arthur", "Daniel", "Arthur@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe10 =  new Person(null, "Caio", "Guilherme", "Caio@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe11 =  new Person(null, "Gabriel", "Fábio", "Gabriel@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe12 =  new Person(null, "Brenda", "Maya", "Brenda@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe13 =  new Person(null, "Tatiane", "Sueli", "Tatiane@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe14 =  new Person(null, "Yuri", "Anderson", "Yuri@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe15 =  new Person(null, "Nicole", "Jaqueline", "Nicole@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe16 =  new Person(null, "Tiago", "Manoel", "Tiago@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe17 =  new Person(null, "Luzia", "Emanuelly", "Luzia@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        Person pe18 =  new Person(null, "Renato", "Matheus", "Renato@gmail.com", "(83)-9999-99999", formataData.parse("2020-01-10T19:53:07Z"));
        personRepository.saveAll(Arrays.asList(pe1,pe2,pe3,pe4,pe5,pe6,pe7,pe8,pe9,pe10,pe11,pe12,pe13,pe14,pe15,pe16,pe17,pe18));


        Department dep1 = new  Department(null, "Tecnologia");
        Department dep2 = new  Department(null, "Administracao");
        Department dep3 = new  Department(null, "Marketing");
        departmentRepository.saveAll(Arrays.asList(dep1,dep2,dep3));

        dep1.getPessoas().add(pe1);
        dep1.getPessoas().add(pe2);
        dep1.getPessoas().add(pe3);
        dep1.getPessoas().add(pe4);
        dep1.getPessoas().add(pe5);
        dep1.getPessoas().add(pe6);


        dep2.getPessoas().add(pe7);
        dep2.getPessoas().add(pe8);
        dep2.getPessoas().add(pe9);
        dep2.getPessoas().add(pe10);
        dep2.getPessoas().add(pe11);
        dep2.getPessoas().add(pe12);

        dep3.getPessoas().add(pe13);
        dep3.getPessoas().add(pe14);
        dep3.getPessoas().add(pe15);
        dep3.getPessoas().add(pe16);
        dep3.getPessoas().add(pe17);
        dep3.getPessoas().add(pe18);

        departmentRepository.saveAll(Arrays.asList(dep1,dep2,dep3));


        Project p1 = new Project(null, "Prometheus", pe1 , 1000L, 2000L);
        Project p2 = new Project(null, "Armageddon", pe2, 20000L, 30000L);
        Project p3 = new Project(null, "Predador", pe3, 30000L, 40000L);
        Project p4 = new Project(null, "Apocalipse", pe4, 500000L, 700000L);
        projectRepository.saveAll(Arrays.asList(p1,p2,p3,p4));

        pe1.getProjects().add(p1);
        pe2.getProjects().add(p2);
        pe3.getProjects().add(p3);
        pe4.getProjects().add(p4);
        personRepository.saveAll(Arrays.asList(pe1,pe2,pe3,pe4));

        Task t1 = new Task(null, "Tarefa 1", "Projeto 1 Criado", 1L, 1L,formataData.parse("20-02-2020"), null);
        Task t2 = new Task(null, "Tarefa 2", "Projeto 2 Criado", 2L, 2L,formataData.parse("15-02-2020"), formataData.parse("2020-04-18T19:53:07Z"));
        Task t3 = new Task(null, "Tarefa 3", "Projeto 3 Criado", 3L, 1L,formataData.parse("10-02-2020"), null);
        Task t4 = new Task(null, "Tarefa 4", "Projeto 4 Criado", 4L, 2L,formataData.parse("10-02-2020"), formataData.parse("2020-04-14T19:53:07Z"));
        taskRepository.saveAll(Arrays.asList(t1,t2,t3,t4));



        p1.getTasks().add(t1);
        p2.getTasks().add(t2);
        p3.getTasks().add(t3);
        p4.getTasks().add(t4);
        projectRepository.saveAll(Arrays.asList(p1,p2,p3,p4));



        ProjectHistory  pr1 = new ProjectHistory(null, t1.getStartDate(), t1.getEndDate(), dep1, p1.getManager(), p1);
        ProjectHistory  pr2 = new ProjectHistory(null, t2.getStartDate(), t2.getEndDate(), dep2, p2.getManager(), p2);
        ProjectHistory  pr3 = new ProjectHistory(null, t3.getStartDate(), t3.getEndDate(), dep3, p3.getManager(), p3);
        ProjectHistory  pr4 = new ProjectHistory(null, t4.getStartDate(), t4.getEndDate(), dep1, p4.getManager(), p4);
        projectHistoryRepository.saveAll(Arrays.asList(pr1,pr2,pr3,pr4));
    }



}
