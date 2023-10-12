package com.example.Employeedemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {

    private long id ;
    private String firstName;
    private String lastName;
    private long age;
    private String address;
    private String country;

}
