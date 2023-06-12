package com.RESTConsume;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist {
    private int id;
    private String tourist_name;
    private String tourist_email;
    private String tourist_location;
    private String createdat;
}
