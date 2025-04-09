package edu.uth.skincarebookingsystem.models;

import jakarta.persistence.*;

@Entity
public class Permission {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private long id;

    @Column(name = "permission_name", length = 50)
    private String permissionname;

    @Column(name = "code", length = 20)
    private String code;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
