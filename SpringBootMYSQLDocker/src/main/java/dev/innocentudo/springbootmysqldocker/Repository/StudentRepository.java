package dev.innocentudo.springbootmysqldocker.Repository;

import dev.innocentudo.springbootmysqldocker.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
