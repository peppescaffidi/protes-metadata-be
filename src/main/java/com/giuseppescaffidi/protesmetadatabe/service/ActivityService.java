package com.giuseppescaffidi.protesmetadatabe.service;

import com.giuseppescaffidi.protesmetadatabe.model.dtos.ActivityDTO;

import java.util.List;

public interface ActivityService {
    List<ActivityDTO> getActivityList();
}
