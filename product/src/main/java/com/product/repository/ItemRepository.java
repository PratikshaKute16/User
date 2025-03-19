package com.product.repository;

import com.product.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity,Long> {
    ItemEntity findItemById(Long itemId);
}
