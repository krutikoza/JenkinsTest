package com.example.cityexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private ISlistService slistService;

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    @GetMapping("/showList")
    public String findList(Model model) {

        var list = (List<ShoppingList>) slistService.findAll();

        model.addAttribute("list", list);

        return "showList";
    }

    @GetMapping("/showTest")
    public String findTest() {

        return "showTest";

    }

/*
    @PostMapping("/addList")
    public String addList(@RequestParam String name){
        ShoppingList slist = new ShoppingList();
        slist.setName(name);
        shoppingListRepository.save(slist);
        return "addList";

    }

 */

}