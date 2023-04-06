package com.domaci.domaci.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String number;
    @Column
    private String email;

    public Long getContact_id() {
        return id;
    }

    public void setContact_id(Long contact_id) {
        this.id = contact_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contact_id=" + id +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
