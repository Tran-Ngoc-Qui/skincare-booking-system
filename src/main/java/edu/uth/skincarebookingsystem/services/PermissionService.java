package edu.uth.skincarebookingsystem.services;

import edu.uth.skincarebookingsystem.repositories.PermissionRepositori;
import org.springframework.stereotype.Service;
import edu.uth.skincarebookingsystem.models.Permission;
import java.util.List;
@Service
public class PermissionService {
    private PermissionRepositori permissionRepositori;
    public List<Permission> findALL(){
        return permissionRepositori.findAll();
    }
}
