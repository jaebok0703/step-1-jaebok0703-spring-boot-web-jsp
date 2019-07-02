package kr.co.miracom.step1jaebok0703springbootwebjsp.menu;

import lombok.*;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Menu {

    private String name;
    private int price;
}
