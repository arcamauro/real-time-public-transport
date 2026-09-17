package com.platform.realtimepublictransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.platform.realtimepublictransport.model.Stop;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long> {

}
