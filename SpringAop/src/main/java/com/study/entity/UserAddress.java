package com.study.entity;

import javax.persistence.*;

@Entity
public class UserAddress {
    private Integer id;
    private Integer userId;
    private String city;
    private User user;

    public UserAddress() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
