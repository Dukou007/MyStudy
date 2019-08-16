package com.example.service.impl;

import com.example.repository.QualityTestCaseRepository;
import com.example.service.QualityTestService;
import com.example.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:
 * @date:2019/8/5 15:34
 */
@Service
public class QualityTestCaseImpl implements QualityTestService {
    @Autowired
    private QualityTestCaseRepository qualityTestCaseRepository;



}
