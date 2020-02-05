package com.resume.app.resumeapp.skills;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class SkillsController {
    private SkillsService skillsService;

    @Inject
    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping(value="/skills")
    public String getSkills(){
        return skillsService.getSkills();
    }
}
