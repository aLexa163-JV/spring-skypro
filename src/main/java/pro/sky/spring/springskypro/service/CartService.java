package pro.sky.spring.springskypro.service;

import java.util.List;

public interface CartService {
    List<Integer> addItem(List<Integer> itemId);

    List<Integer> getItems();
}
