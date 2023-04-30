package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product extends BaseEntity {

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer remainingQuantity;
    @ManyToMany
    @JoinTable(name="product_category_rel",
   joinColumns = @JoinColumn(name="p_id"),
    inverseJoinColumns = @JoinColumn(name="c_id") )
    private List<Category> categoryList;
}
