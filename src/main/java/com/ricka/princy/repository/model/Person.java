package com.ricka.princy.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Person implements Serializable {
    @Id
    String id;
}