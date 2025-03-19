package com.product.service;

import com.product.entity.ItemEntity;
import com.product.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public ItemEntity saveItem(ItemEntity item) {
        return itemRepository.save(item);
    }

    public ItemEntity findItemById(Long itemId) {
        return itemRepository.findItemById(itemId);
    }
}
