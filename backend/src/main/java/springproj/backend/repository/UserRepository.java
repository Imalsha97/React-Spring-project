package springproj.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springproj.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
