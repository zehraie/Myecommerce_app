package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Customer extends BaseEntity{

     private String firstName;
     @Column(length = 15, nullable = false)
     private String lastName;
    private String email;
    private String userName;

}
