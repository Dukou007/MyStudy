package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:
 * @date:2019/8/5 11:59
 */
@Entity
@Table(name = "test_case")
public class TestCase implements Serializable {

    private Integer id;
    private String name;
    private List<TestSuite> testSuites = new ArrayList<TestSuite>();

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

    @ManyToMany(mappedBy = "testCases", fetch = FetchType.EAGER)
    public List<TestSuite> getTestSuites() {
        return testSuites;
    }

    public void setTestSuites(List<TestSuite> testSuites) {
        this.testSuites = testSuites;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testSuites=" + testSuites +
                '}';
    }

    public TestCase() {
    }

    public TestCase(Integer id, String name, List<TestSuite> testSuites) {
        this.id = id;
        this.name = name;
        this.testSuites = testSuites;
    }
}
