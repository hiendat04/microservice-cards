package com.microservice.cards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cards extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;

    private String mobileNumber;

    private String cardNumber;

    private String cardType;

    private Integer totalLimit;

    private Integer amountUsed;

    private Integer availableAmount;
}
