package com.learning.depertment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depertment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long depertmentId;
    private String depertmentName;
    private String depertmentCode;
}
