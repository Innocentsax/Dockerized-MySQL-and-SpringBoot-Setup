package dev.innocentudo.docker_practice.Repository;

import dev.innocentudo.docker_practice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
