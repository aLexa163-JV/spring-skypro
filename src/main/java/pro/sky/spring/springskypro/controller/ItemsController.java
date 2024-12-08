package pro.sky.spring.springskypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.spring.springskypro.service.CartService;
import pro.sky.spring.springskypro.service.CartServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ItemsController {

    @Autowired
    private final CartService cartService;

    public ItemsController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public List<Integer> addItem(@RequestParam List<Integer> ids) {
        return cartService.addItem(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
