package com.platform.realtimepublictransport.service;

import com.platform.realtimepublictransport.mapper.StopMapper;
import com.platform.realtimepublictransport.model.Stop;
import com.platform.realtimepublictransport.model.StopDTO;
import com.platform.realtimepublictransport.repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class StopServiceImpl implements StopService {

    private final StopRepository stopRepository;

    public StopServiceImpl(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @Override
    public StopDTO getStopById(Long id) {
        Stop stop = stopRepository.findById(id)
                .orElseThrow();

        return StopMapper.toDTO(stop);
    }
}
