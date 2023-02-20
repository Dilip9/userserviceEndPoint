package com.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "fname",nullable = false)
    private String fname;

    @Column(name = "lname", nullable = true)
    private String lname;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "contact",nullable = false)
    private String contact;

    @Column(name = "answer1", nullable = false)
    private String ans1;

    @Column(name = "answer1", nullable = false)
    private String ans2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return Objects.equals(getId(), users.getId()) && Objects.equals(getUsername(), users.getUsername()) && Objects.equals(getFname(), users.getFname()) && Objects.equals(getLname(), users.getLname()) && Objects.equals(getEmail(), users.getEmail()) && Objects.equals(getContact(), users.getContact()) && Objects.equals(getAns1(), users.getAns1()) && Objects.equals(getAns2(), users.getAns2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getFname(), getLname(), getEmail(), getContact(), getAns1(), getAns2());
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", ans1='" + ans1 + '\'' +
                ", ans2='" + ans2 + '\'' +
                '}';
    }
}
