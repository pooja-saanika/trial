package com.exam.timetable.TimeTable.repository;

import com.exam.timetable.TimeTable.model.Klass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlassRepository extends JpaRepository<Klass, Long> {
}
