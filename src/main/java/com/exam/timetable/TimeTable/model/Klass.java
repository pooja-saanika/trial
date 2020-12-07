package com.exam.timetable.TimeTable.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Component
@Entity
public class Klass
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long klassId;
    String klassName;
    @Column(unique = true)
    String klassCode;

    @OneToMany(mappedBy = "klass" , cascade = CascadeType.ALL)
    private Set<Subject> subjectSet = new HashSet<>();

    @OneToMany(mappedBy = "klass" , cascade = CascadeType.ALL)
    private Set<Student> studentSet = new HashSet<>();

    public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public void setSubjectSet(Set<Subject> subjectSet) {
        this.subjectSet = subjectSet;
    }

    public Long getKlassId() {
        return klassId;
    }

    public void setKlassId(Long klassId) {
        this.klassId = klassId;
    }

    public String getKlassName() {
        return klassName;
    }

    public void setKlassName(String klassName) {
        this.klassName = klassName;
    }

    public String getKlassCode() {
        return klassCode;
    }

    public void setKlassCode(String klassCode) {
        this.klassCode = klassCode;
    }
}
