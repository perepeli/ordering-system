package org.example.order.service.domain.entity;

import org.example.domain.entity.BaseEntity;
import org.example.domain.valueobject.Money;
import org.example.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }


}