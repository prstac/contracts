package org.example;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDate localDate;
    private int duration;
    private BigDecimal payValue;

    public Contract(String name, LocalDate localDate, int duration, BigDecimal payValue) {
        this.name = name;
        this.localDate = localDate;
        this.duration = duration;
        this.payValue = payValue;
    }

    @ManyToMany(mappedBy = "person")
    Set<Person> persons = new HashSet<>();

    public Set<Person> getPersons() {
        return persons;
    }

    public Set<Company> getCompanies() {
        return companies;
    }

    @ManyToMany(mappedBy = "company")
    Set<Company> companies = new HashSet<>();
}
