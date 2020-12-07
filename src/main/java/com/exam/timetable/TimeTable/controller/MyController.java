package com.exam.timetable.TimeTable.controller;

import com.exam.timetable.TimeTable.model.*;
import com.exam.timetable.TimeTable.repository.ExamRepository;
import com.exam.timetable.TimeTable.repository.KlassRepository;
import com.exam.timetable.TimeTable.repository.StudentRepository;
import com.exam.timetable.TimeTable.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class MyController
{
    @Autowired
    KlassRepository klassRepository;
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    ExamRepository examRepository;
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/")
    public String start()
    {
        return "home";
    }

    @RequestMapping("addStudent")
    public  ModelAndView addStudent(ModelAndView modelAndView , Klass klass , Student student)
    {
        studentRepository.save(student);
        List<Klass> allKlass = klassRepository.findAll();
        modelAndView.addObject("allKlass",allKlass);
        modelAndView.setViewName("addStudent");
        return modelAndView;
    }


    @RequestMapping("addKlass")
    public ModelAndView addKlass(Klass klass , ModelAndView modelAndView)
    {
        klassRepository.save(klass);
        modelAndView.setViewName("addKlass");
        return modelAndView;
    }

    @RequestMapping("addSubject")
    public ModelAndView addSubject(Subject subject , Klass klass , ModelAndView modelAndView)
    {
        subjectRepository.save(subject);
        List<Klass> allKlass = klassRepository.findAll();
        modelAndView.addObject("allKlass",allKlass);
        modelAndView.setViewName("addSubject");
        return modelAndView;
    }

    @RequestMapping("addExam")
    public ModelAndView addExam(Exam exam , ModelAndView modelAndView)
    {
        examRepository.save(exam);
        modelAndView.setViewName("addExam");
        return modelAndView;
    }

    @RequestMapping("create")
    public  ModelAndView create(ModelAndView modelAndView , Klass klass , Exam exam , CreateTT createTT)
    {
        List<Klass> allKlass = klassRepository.findAll();
        modelAndView.addObject("allKlass",allKlass);

        List<Exam> allExam = examRepository.findAll();
        modelAndView.addObject("allExam",allExam);

        Long klassId = createTT.getTklassId();
        List<Subject> timetable = subjectRepository.selectByKlass(klassId);

        modelAndView.addObject("timetable",timetable);
        modelAndView.setViewName("createTimeTable");
        return modelAndView;
    }

    @RequestMapping("createtimetable")
    public  ModelAndView createtimetable(ModelAndView modelAndView , Klass klass , Exam exam , CreateTT createTT)
    {
        Date startdate = createTT.getStartDate();

        List<Klass> allKlass = klassRepository.findAll();
        modelAndView.addObject("allKlass",allKlass);

        List<Exam> allExam = examRepository.findAll();
        modelAndView.addObject("allExam",allExam);

        Long klassId = createTT.getTklassId();

        List<Subject> timetable = subjectRepository.selectByKlass(klassId);
        modelAndView.addObject("timetable",timetable);
        int c = timetable.size();
        List examdates = new ArrayList();
        for(int i=0; i<c; i++)
        {
           examdates.add(getNextDate(startdate,i));
        }
        modelAndView.addObject("examdates",examdates);
        modelAndView.setViewName("createTimeTable");
        return modelAndView;
    }

    public static String getNextDate(Date  startDate , int count)
    {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Calendar c = Calendar.getInstance();
            c.setTime(startDate);
            c.add(Calendar.DATE, count);
            System.out.println(dateFormat.format(c.getTime()));
            String examdate = dateFormat.format(c.getTime());
        return examdate;
    }
}
