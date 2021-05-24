package com.example.examplecore.v1.core.models;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(schema = "public")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "firstname")
    @Length(max = 50)
    public String firstName;

    @Column(name = "lastname")
    @Length(max = 50)
    public String lastName;

    @Column(name = "state", length = 2)
    public String state;
}
