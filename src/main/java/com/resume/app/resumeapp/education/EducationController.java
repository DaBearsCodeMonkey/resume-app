package com.resume.app.resumeapp.education;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class EducationController {
    private EducationService educationService;

    @Inject
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping(value="/education")
    public String getEducation(){
        return educationService.getEducation();
    }
}
