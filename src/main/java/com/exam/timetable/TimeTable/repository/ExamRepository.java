package com.exam.timetable.TimeTable.repository;

import com.exam.timetable.TimeTable.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
