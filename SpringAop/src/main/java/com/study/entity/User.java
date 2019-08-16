package com.study.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * @description:entity
 * @author:zhou_xiaolong
 * @date:2019/7/23 15:45
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private List<UserAddress> addresses = new ArrayList<UserAddress>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    public List<UserAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<UserAddress> addresses) {
        this.addresses = addresses;
    }


    public User() {
    }
}
