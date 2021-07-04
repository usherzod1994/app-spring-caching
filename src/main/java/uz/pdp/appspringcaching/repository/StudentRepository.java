package uz.pdp.appspringcaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appspringcaching.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
