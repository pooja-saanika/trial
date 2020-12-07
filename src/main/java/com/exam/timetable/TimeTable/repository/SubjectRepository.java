package com.exam.timetable.TimeTable.repository;

import com.exam.timetable.TimeTable.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject , Long>
{

    @Query("select s from  Subject s left join Klass k on s.klass.klassId = k.klassId where s.klass.klassId = :klassId")
    public  List<Subject> selectByKlass(Long klassId);

//    @Query("select s from  Subject s left join Klass k on s.klass.klassId = k.klassId " +
//            "where s.klass.klassId = :klassId")
//    public  List<Subject> selectByKlass(String klassName);
}
