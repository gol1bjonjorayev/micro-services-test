package developer.jorayev.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SchoolRepository extends JpaRepository<School,Integer> {
}
