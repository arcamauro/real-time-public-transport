    package com.platform.realtimepublictransport.controller;

    import com.platform.realtimepublictransport.model.StopDTO;
    import com.platform.realtimepublictransport.service.StopService;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/stops")
    public class StopController {
        private final StopService stopService;

        public StopController(StopService stopService) {
            this.stopService = stopService;
        }

        @GetMapping("/{id}")
        public ResponseEntity<StopDTO> getStop(@PathVariable Long id) {
            return ResponseEntity.ok(stopService.getStopById(id));
        }
    }
