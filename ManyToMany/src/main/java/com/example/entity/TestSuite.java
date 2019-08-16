package com.example.entity;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:ceshiji
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/5 11:57
 */
@Entity
@Table(name = "test_suite")
public class TestSuite implements Serializable {

    private Integer id;
    private String name;
    private List<TestCase> testCases = new ArrayList<TestCase>();
    private List<QualityTestCase> qualityTestCases = new ArrayList<QualityTestCase>();


    public TestSuite() {
    }

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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "test_suite_case",
            joinColumns = @JoinColumn(name = "test_suite_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "test_case_id", referencedColumnName = "id"))
    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCase> testCases) {
        this.testCases = testCases;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "quality_test_suite_case",
            joinColumns = @JoinColumn(name = "test_suite_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "qualtiy_test_case_id", referencedColumnName = "id"))
    public List<QualityTestCase> getQualityTestCases() {
        return qualityTestCases;
    }

    public void setQualityTestCases(List<QualityTestCase> qualityTestCases) {
        this.qualityTestCases = qualityTestCases;
    }
}
