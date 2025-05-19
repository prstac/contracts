package org.example;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "person_contract", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns =
    @JoinColumn(name = "contract_id"))
    Set<Contract> contracts = new HashSet<>();
}
