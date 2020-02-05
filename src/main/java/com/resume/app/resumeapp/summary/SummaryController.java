package com.resume.app.resumeapp.summary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class SummaryController {
    SummaryService summaryService;

    @Inject
    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping(value = "/summary")
    public String getSummary(){
        return summaryService.getSummary();
    }
}
