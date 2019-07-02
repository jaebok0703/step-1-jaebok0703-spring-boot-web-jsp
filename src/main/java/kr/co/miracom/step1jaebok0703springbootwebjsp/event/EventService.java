package kr.co.miracom.step1jaebok0703springbootwebjsp.event;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("Spring Web Study")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 6, 1, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 6, 1, 10, 0))
                .build();

        Event event2 = Event.builder()
                .name("Spring Web Study, 2nd")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 6, 7, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 6, 7, 10, 0))
                .build();

        return Arrays.asList(event1, event2);
    }
}
