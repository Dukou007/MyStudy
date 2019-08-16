package com.study.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @description:entity
 * @author:zhou_xiaolong
 * @date:2019/7/23 15:45
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Collection<UserAddress> userAddresses=new ArrayList<UserAddress>();

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
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy ="user")
    public Collection<UserAddress> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(Collection<UserAddress> userAddresses) {
        this.userAddresses = userAddresses;
    }

    public User() {
    }
}
