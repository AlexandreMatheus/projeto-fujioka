package br.com.alexandreccapi.AlexandreProjetoApi.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Long taskPoints;
    private Long status;
    private Date startDate;
    private Date endDate;

    public Task(Long id, String title, String description, Long taskPoints, Long status, Date startDate, Date endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.taskPoints = taskPoints;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTaskPoints() {
        return taskPoints;
    }

    public void setTaskPoints(Long taskPoints) {
        this.taskPoints = taskPoints;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
}
