package com.resume.app.resumeapp.objective;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class ObjectiveController {
    private ObjectiveService objectiveService;

    @Inject
    public ObjectiveController(ObjectiveService objectiveService) {
        this.objectiveService = objectiveService;
    }

    @GetMapping(value="/objective")
    public String getObjective(){
        return objectiveService.getObjective();
    }
}
