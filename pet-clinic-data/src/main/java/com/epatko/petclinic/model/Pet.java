package com.epatko.petclinic.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
