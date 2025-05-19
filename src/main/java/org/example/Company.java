package org.example;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "company_contract", joinColumns = @JoinColumn(name = "company_id"), inverseJoinColumns =
    @JoinColumn(name = "contract_id"))
    Set<Contract> contracts = new HashSet<>();

    public Set<Contract> getContracts() {
        return contracts;
    }
}
