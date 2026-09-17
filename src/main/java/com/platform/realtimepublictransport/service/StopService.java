package com.platform.realtimepublictransport.service;

import com.platform.realtimepublictransport.model.StopDTO;

public interface StopService {
    StopDTO getStopById(Long id);
}
