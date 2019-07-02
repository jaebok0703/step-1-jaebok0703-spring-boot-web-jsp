package kr.co.miracom.step1jaebok0703springbootwebjsp.event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/events")
    public String events(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("events", eventService.getEvents());
        return "event/events";
    }
}
