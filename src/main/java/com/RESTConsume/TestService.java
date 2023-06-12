package com.RESTConsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String getStringData() {
        return restTemplate.getForObject("http://restapi.adequateshop.com/api/Tourist/227787", String.class);
    }

    public Tourist getApiData() {
        return restTemplate.getForObject("http://restapi.adequateshop.com/api/Tourist/227787", Tourist.class);
    }

    public CompleteData getCompleteApiDetails() {
        return restTemplate.getForObject("http://restapi.adequateshop.com/api/Tourist", CompleteData.class);
    }

}
