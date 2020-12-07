package com.exam.timetable.TimeTable.model;

import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class CreateTT
{
    java.sql.Date startDate;
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    String [] examdates;

    public String[] getExamdates() {
        return examdates;
    }

    public void setExamdates(String[] examdates) {
        this.examdates = examdates;
    }

    String texamName;
    String tklassName;
    Long tklassId;

    public Long getTklassId() {
        return tklassId;
    }

    public void setTklassId(Long tklassId) {
        this.tklassId = tklassId;
    }

    String tsubjectName;
    String tsubjectCode;

    public String getTexamName() {
        return texamName;
    }

    public void setTexamName(String texamName) {
        this.texamName = texamName;
    }

    public String getTklassName() {
        return tklassName;
    }

    public void setTklassName(String tklassName) {
        this.tklassName = tklassName;
    }

    public String getTsubjectName() {
        return tsubjectName;
    }

    public void setTsubjectName(String tsubjectName) {
        this.tsubjectName = tsubjectName;
    }

    public String getTsubjectCode() {
        return tsubjectCode;
    }

    public void setTsubjectCode(String tsubjectCode) {
        this.tsubjectCode = tsubjectCode;
    }

    }



