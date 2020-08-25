package com.udacity.jdnd.data.entity;

import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500,name = "address_full")
    private String address;
    @Nationalized
    private String recipientName;
    private LocalDateTime deliveryTime;
    @Type(type = "yes_no")
    private Boolean completed;

    @OneToMany(mappedBy = "delivery")
    private List<Plant> plants;

    public Delivery() {
    }


    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean isCompleted() {
        return completed;
    }
    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}