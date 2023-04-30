package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity{
    private Integer quantity;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Product product;
}
