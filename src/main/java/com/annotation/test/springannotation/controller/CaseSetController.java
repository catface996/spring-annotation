package com.annotation.test.springannotation.controller;

import com.annotation.test.springannotation.config.TestCaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 张钟
 * @date 2018/2/5
 */
@Controller
public class CaseSetController {

    @Autowired
    private Map<String,TestCaseVO> testCaseVOMap;

    @RequestMapping(value = "/case/list")
    public String getTestSet(Model model){
        List<TestCaseVO> testCaseVOList = new ArrayList<>();
        for(String caseName:testCaseVOMap.keySet()){
            testCaseVOList.add(testCaseVOMap.get(caseName));
        }
        model.addAttribute("caseList",testCaseVOList);
        return "case";
    }
}
