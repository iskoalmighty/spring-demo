package com.iskoalmighty.springdemo.model.user;

import com.iskoalmighty.springdemo.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class CreateUserRequest {

    @NotBlank(message = "Last Name Must Not Be Blank")
    private String lastName;
    @NotBlank
    private String firstName;
    private String middleName;
    private String suffix;
    @Email
    private String email;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private LocalDate birthdate;
    private boolean active;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User toUser() {
        User user = new User();
        user.setLastName(this.lastName);
        user.setFirstName(this.firstName);
        user.setMiddleName(this.middleName);
        user.setSuffix(this.suffix);
        user.setEmail(this.email);
        user.setUsername(this.username);
        user.setPassword(this.password);
        user.setBirthdate(this.birthdate);
        user.setActive(this.active);
        return user;
    }
}
