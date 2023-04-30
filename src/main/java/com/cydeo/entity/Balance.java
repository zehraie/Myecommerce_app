package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.Bidi;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Balance extends BaseEntity{


    private BigDecimal amount;
    @OneToOne   // uni directional, I reach customer table withe foreign key
    // Balance table has customer_id foreign key in the table
    private Customer customer;

}
