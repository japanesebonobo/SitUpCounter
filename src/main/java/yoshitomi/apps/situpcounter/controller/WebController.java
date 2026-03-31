package yoshitomi.apps.situpcounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import yoshitomi.apps.situpcounter.service.CounterService;

@Controller
public class WebController {

    private final CounterService counterService;

    public WebController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("count", counterService.getCounterValue());
        return "index";
    }

    @PostMapping("/update")
    public String update() {
        counterService.updateCounterValue();
        return "redirect:/";
    }

    @PostMapping("/decrement")
    public String decrement() {
        counterService.decrementCounterValue();
        return "redirect:/";
    }
}
