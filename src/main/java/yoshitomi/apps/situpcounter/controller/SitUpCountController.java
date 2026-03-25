package yoshitomi.apps.situpcounter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yoshitomi.apps.situpcounter.service.CounterService;

@RestController
public class SitUpCountController {

    private final CounterService counterService;

    public SitUpCountController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/api/refer")
    public String refer() {
        return counterService.getCounterValue();
    }
}
