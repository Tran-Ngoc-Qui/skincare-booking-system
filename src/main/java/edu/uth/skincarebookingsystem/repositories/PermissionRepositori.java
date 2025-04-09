package edu.uth.skincarebookingsystem.repositories;

import edu.uth.skincarebookingsystem.services.PermissionService;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.uth.skincarebookingsystem.models.Permission;
import java.util.List;

@Repository
public interface PermissionRepositori extends JpaRepository<Permission, Long> {
    List<Permission> findAll();
}
