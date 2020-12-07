package com.exam.timetable.TimeTable.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
public class TimeTable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String examDate;
    String subjectCode;
    String subjectName;
}
