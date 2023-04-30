package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer remainingQuantity;
    @ManyToOne
    @JoinTable(name="product_category_rel",
   joinColumns = @JoinColumn(name="p_id"),
    inverseJoinColumns = @JoinColumn(name="c_id") )
    private List<Category> categoryList;
}
