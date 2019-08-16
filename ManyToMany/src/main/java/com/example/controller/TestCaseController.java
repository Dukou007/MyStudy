package com.example.controller;

import com.example.service.QualityTestService;
import com.example.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:
 * @date:2019/8/5 15:32
 */
@RestController
@RequestMapping(value = "testcase")
public class TestCaseController {
    @Autowired
    QualityTestService qualityTestService;
    @Autowired
    TestCaseService testCaseService;
    @ResponseBody
    @RequestMapping(value = "/changePository", method = RequestMethod.POST)
    public String changePosition(@RequestBody Map<String, Object> map) {
        List<Integer> caseId = null;
        Integer suiteId = 0;
        if (map.containsKey("caseId") && map.containsKey("suiteId")) {
            caseId = (List<Integer>) map.get("caseId");
            suiteId = (Integer) map.get("suiteId");
        }
        try {
            testCaseService.changePosition(suiteId, caseId);
            return "true";
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }

}
