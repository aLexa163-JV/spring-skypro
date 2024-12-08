package pro.sky.spring.springskypro.service;

import org.springframework.stereotype.Service;
import pro.sky.spring.springskypro.component.Cart;

import java.util.ArrayList;
import java.util.List;

@Service

public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItem(List<Integer> itemId) {

        return cart.addItem(itemId);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
