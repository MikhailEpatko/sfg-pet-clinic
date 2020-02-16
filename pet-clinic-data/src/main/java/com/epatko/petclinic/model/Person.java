package com.epatko.petclinic.model;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
}
