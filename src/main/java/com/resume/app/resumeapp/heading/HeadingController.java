package com.resume.app.resumeapp.heading;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class HeadingController {
    private HeadingService headingService;

    @Inject
    public HeadingController(HeadingService headingService) {
        this.headingService = headingService;
    }

    @GetMapping(value="/heading")
    public String getHeading(){
        return headingService.getHeading();
    }
}
