package edu.uth;

abstract class User {
    // Thuộc tính
    protected String id;
    protected String name_user;
    protected String email;
    protected String phone;

    // Constructor không tham số
    public User() {
    }

    // Constructor có tham số
    public User(String id, String name_user, String email, String phone) {
        this.id = id;
        this.name_user = name_user;
        this.email = email;
        this.phone = phone;
    }

    // Các phương thức getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name_user;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // Các phương thức setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name_user) {
        this.name_user = name_user;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Các phương thức đăng nhập/đăng xuất
    public void login() { /* Logic đăng nhập */ }

    public void logout() { /* Logic đăng xuất */ }

}