package kr.co.miracom.step1jaebok0703springbootwebjsp.event;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {

    private String name;
    private int limitOfEnrollment;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

}
