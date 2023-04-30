package com.cydeo.entity;

import com.cydeo.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="orders") // avoid keywords such a orderBy and other
public class Order extends BaseEntity{

    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    @OneToOne
    private Cart cart;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Payment payment;
}
