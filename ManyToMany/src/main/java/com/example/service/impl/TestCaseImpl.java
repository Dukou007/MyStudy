package com.example.service.impl;

import com.example.entity.QualityTestCase;
import com.example.entity.TestCase;
import com.example.entity.TestSuite;
import com.example.repository.TestCaseRepository;
import com.example.repository.TestSuiteRepository;
import com.example.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author:
 * @date:2019/8/5 15:30
 */
@Service
public class TestCaseImpl implements TestCaseService {
    @Autowired
    private TestCaseRepository testCaseRepository;
    @Autowired
    private TestSuiteRepository testSuiteRepository;

    @Override
    @Transactional
    public void changePosition(Integer suiteId, List<Integer> caseId) {
        TestSuite testSuite = testSuiteRepository.getOne(suiteId);
        for (Integer id : caseId) {
            TestCase testCase = testCaseRepository.getOne(id);
            if(testSuite.getTestCases().contains(testCase)){
                System.out.println("exits………………………………………………………………");
                testSuite.getTestCases().remove(testCase);
            }
            testSuite.getTestCases().add(testCase);
        }

    }
}
