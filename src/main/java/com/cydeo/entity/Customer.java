package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity{

     private String firstName;
     @Column(length = 15, nullable = false)
     private String lastName;
    private String email;
    private String userName;
    // ornek buna gerek yok bircik addresss e bir customer sahip olabilir oyuzden, Address class a yaziyoruz, buraya yazmaya gerek yook
//    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
//    private List<Address> addressList;

}
