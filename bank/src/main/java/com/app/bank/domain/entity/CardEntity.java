package com.app.bank.domain.entity;

import com.app.bank.domain.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.Random;

@Entity
@Table(name = "card")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EntityListeners(AuditingEntityListener.class)
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private long cardNumber;


    private String pin;
    private String iban;

    @Enumerated(EnumType.STRING)
    private Status status;

    @CreatedDate
    private LocalDateTime creationDate;
    @LastModifiedDate
    private LocalDateTime lastUpdated;


    private LocalDateTime expirationDate;

   // @JsonIgnore
   // @ToString.Exclude
   // @ManyToOne(fetch = FetchType.LAZY) //by default e EAGER
    //@JoinColumn(name = "iban")
    //private AccountEntity accountEntity;
}
