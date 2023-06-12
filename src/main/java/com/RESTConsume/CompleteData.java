package com.RESTConsume;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteData {

    private int page;
    private int per_page;
    private int totalrecord;
    private int total_pages;
    private List<Tourist> data;
}
