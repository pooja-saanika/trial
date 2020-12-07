package com.exam.timetable.TimeTable.repository;

import com.exam.timetable.TimeTable.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
