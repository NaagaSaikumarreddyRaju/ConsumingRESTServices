package com.RESTConsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/getStringData")
    public String getStringData(){
        return testService.getStringData();
    }

    @GetMapping("/getApiData")
    public Tourist getApiData(){
        return testService.getApiData();
    }

    // To get the whole details create new Page CompleteData

    @GetMapping("/CompleteApiDetails")
    public CompleteData getCompleteApiDetails(){
        return testService.getCompleteApiDetails();
    }

}
