package kr.co.miracom.step1jaebok0703springbootwebjsp.menu;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MenuService {

    public List<Menu> getMenus() {
        Menu menu1 = Menu.builder()
                .name("탕수육")
                .price(12000)
                .build();

        Menu menu2 = Menu.builder()
                .name("짜장면")
                .price(6000)
                .build();

        Menu menu3 = Menu.builder()
                .name("짬뽕")
                .price(6500)
                .build();

        return Arrays.asList(menu1, menu2, menu3);
    }
}
