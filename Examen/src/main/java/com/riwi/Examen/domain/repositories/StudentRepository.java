package com.riwi.Examen.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.Examen.domain.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
