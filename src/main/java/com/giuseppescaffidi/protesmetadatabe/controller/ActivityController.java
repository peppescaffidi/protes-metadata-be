package com.giuseppescaffidi.protesmetadatabe.controller;

import com.giuseppescaffidi.protesmetadatabe.model.dtos.ActivityDTO;
import com.giuseppescaffidi.protesmetadatabe.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @GetMapping
    public List<ActivityDTO> getActivityList() {
        System.out.println("***************** start getActivityList *******************");

        return activityService.getActivityList();
    }
}
