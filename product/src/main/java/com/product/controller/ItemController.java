package com.product.controller;

import com.product.entity.ItemEntity;
import com.product.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping("/save")
    public ItemEntity saveItem(@RequestBody ItemEntity item) {
        return itemService.saveItem(item);
    }
    @GetMapping("/{itemId}")
    public ItemEntity findItemById(@PathVariable("itemId") Long itemId) {
        return itemService.findItemById(itemId);
    }

}
