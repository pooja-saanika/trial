package com.exam.timetable.TimeTable.repository;

import com.exam.timetable.TimeTable.model.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<TimeTable , Long> {
}
