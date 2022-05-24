package org.acme.models;

import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.SequenceGenerator;


@Entity
public class Person extends PanacheEntity {
    // @Id
    // @SequenceGenerator(
    //         name = "personSequence",
    //         sequenceName = "person_id_seq",
    //         allocationSize = 1,
    //         initialValue = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personSequence")
    public Long id;
    public String nome;

    public static Person findById(Long id) {
        return Person.findById(id);
    }
}
