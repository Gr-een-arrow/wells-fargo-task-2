package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.time.Year;

@Entity
public class Qualification {

    @Id
    @GeneratedValue()
    private long qualificationId;

    @ManyToOne
    @JoinColumn(name="advisorId")
    private Advisor advisor;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String institute;

    @Column(nullable = false)
    private Year startYear;

    @Column(nullable = false)
    private Year endYear;

    @Column(nullable = false)
    private String description;

    protected Qualification() {

    }

    public Qualification(Advisor advisor, String title, String institute, Year startYear, Year endYear, String description){
        this.advisor = advisor;
        this.title = title;
        this.institute = institute;
        this.startYear = startYear;
        this.endYear = endYear;
        this.description = description;
    }

    public Long getQualificationId() {
        return qualificationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public Year getStartYear() {
        return startYear;
    }

    public void setStartYear(Year sy) {
        this.startYear = sy;
    }

    public Year getEndYear() {
        return endYear;
    }

    public void setEndYear(Year ey) {
        this.endYear = ey;
    }
}
