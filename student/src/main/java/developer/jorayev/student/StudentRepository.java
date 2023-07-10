package developer.jorayev.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllBySchoolId(Integer id);


}
