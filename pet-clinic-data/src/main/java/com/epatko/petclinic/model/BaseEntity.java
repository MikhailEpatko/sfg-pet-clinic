package com.epatko.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class BaseEntity implements Serializable {

    private Long id;
}
