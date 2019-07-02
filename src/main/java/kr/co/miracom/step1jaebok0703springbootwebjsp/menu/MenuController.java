package kr.co.miracom.step1jaebok0703springbootwebjsp.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("/menus")
    public String menus(Model model) {
        model.addAttribute("message", "중화요리");
        model.addAttribute("menus", menuService.getMenus());
        return "menu/menus";
    }
}
