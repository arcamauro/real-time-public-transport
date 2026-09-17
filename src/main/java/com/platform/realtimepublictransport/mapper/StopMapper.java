package com.platform.realtimepublictransport.mapper;

import com.platform.realtimepublictransport.model.Stop;
import com.platform.realtimepublictransport.model.StopDTO;

public class StopMapper {

    public static StopDTO toDTO(Stop stop) {
        StopDTO dto = new StopDTO();
        dto.setId(stop.getId());
        dto.setStopName(stop.getStopName());
        dto.setLatitude(stop.getLatitude());
        dto.setLongitude(stop.getLongitude());

        return dto;
    }
}