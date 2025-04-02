package edu.uth.skincarebookingsystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.uth.skincarebookingsystem.models.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UserRepositories extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}