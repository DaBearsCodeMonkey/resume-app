package com.resume.app.resumeapp.employment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class WorkController {
    private WorkService workService;

    @Inject
    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping(value="/work")
    public String getWork(){
        return workService.getWork();
    }
}
