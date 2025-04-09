package edu.uth.skincarebookingsystem.services;
import edu.uth.skincarebookingsystem.models.User;
import edu.uth.skincarebookingsystem.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class UserServices {
    @Autowired
    private UserRepositories userRepositories;
    public Optional<User> findByUsername(String username) {
        return userRepositories.findByUsername(username);
    }
    // trien khai tiep cac methods save, detele
    public boolean existsByUsername(String username) {
        return true;
    }
    public User createUser(User user) {
        return userRepositories.save(user);
    }
}
