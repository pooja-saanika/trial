package com.exam.timetable.TimeTable.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Exam
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long examId;
    String examName;
    @Column(unique = true)
    String examCode;

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }
}
