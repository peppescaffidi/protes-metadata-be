package com.giuseppescaffidi.protesmetadatabe.service.impl;

import com.giuseppescaffidi.protesmetadatabe.model.dtos.ActivityDTO;
import com.giuseppescaffidi.protesmetadatabe.model.entities.mongodb.ActivityDocument;
import com.giuseppescaffidi.protesmetadatabe.repository.ActivityRepository;
import com.giuseppescaffidi.protesmetadatabe.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityRepository activityRepository;

    @Override
    public List<ActivityDTO> getActivityList() {
        List<ActivityDocument> activityDocuments = activityRepository.findAll();
        List<ActivityDTO> activityDTOS = new ArrayList<>();

        activityDocuments.forEach(activityDocument -> {
            ActivityDTO activityDTO = new ActivityDTO();
            activityDTO.setActivityId(activityDocument.getActivityId());
            activityDTO.setName(activityDocument.getName());
            activityDTOS.add(activityDTO);
        });

        System.out.println("***************** end getActivityList *******************");

        return activityDTOS;
    }
}
