package org.example;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToMany(mappedBy = "person")
    Set<Person> persons = new HashSet<>();
    @ManyToMany(mappedBy = "company")
    Set<Company> companies = new HashSet<>();
}
