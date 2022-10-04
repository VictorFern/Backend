package com.nlxa.java.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Client")
public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(generator = "ID")
    @GenericGenerator(
            name = "ID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String clientId;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @OneToMany(mappedBy = "client")
    private List<Invoice> invoiceList;
    public Client() {

    }
}
