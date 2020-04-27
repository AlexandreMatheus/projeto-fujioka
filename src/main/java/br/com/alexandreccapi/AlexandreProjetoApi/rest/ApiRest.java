package br.com.alexandreccapi.AlexandreProjetoApi.rest;

import java.util.Date;
import java.util.List;

import br.com.alexandreccapi.AlexandreProjetoApi.Services.*;
import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiRest {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private DepartmentService departamentService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private PersonService personService;

    @Autowired
    private ProjectHistoryService projectHistoryService;

    @GetMapping("/projects")
    public ResponseEntity<List<ProjectDTO>> getProjects() {
        List<ProjectDTO> list = projectService.getProjects();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<DepartmentDTO>> getDepartments(){
        List<DepartmentDTO> list = departamentService.getDepartments();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskDTO>> getTasks(){
        List<TaskDTO> list = taskService.getTasks();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDTO>> getPersons(){
        List<PersonDTO> list = personService.getPersons();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/projectHistory")
    public ResponseEntity<List<ProjectHistoryDTO>> getProjectsHistory(){
        List<ProjectHistoryDTO> list = projectHistoryService.getProjectsHistory();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/task/busca/datas/{dataInicial}/{dataFinal}")
    public ResponseEntity<List<TaskDTO>> buscaTaskEntreDatas(
        @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date dataInicial,
        @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date dataFinal
    ){
        return ResponseEntity.ok(taskService.getTaskByDatas(dataInicial, dataFinal));
    }

    @GetMapping("/task/busca/datas/{dataInicial}/{dataFinal}/status/{status}")
    public ResponseEntity<List<TaskDTO>> buscaTaskEntreDatas(
            @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date dataInicial,
            @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date dataFinal,
            @PathVariable Long status
    ) {
        return ResponseEntity.ok(taskService.getTaskByDatasAndStatus(dataInicial, dataFinal, status));
    }

    @GetMapping("/task/busca/pontos/{pontoInicial}/{pontoFinal}")
    public ResponseEntity<List<TaskDTO>> buscaTaskEntreDatas(
            @PathVariable Long pontoInicial,
            @PathVariable Long pontoFinal
    ) {
        return ResponseEntity.ok(taskService.getTaskByPoints(pontoInicial, pontoFinal));
    }
}
