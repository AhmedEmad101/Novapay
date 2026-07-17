package com.example.novapay.paymentcompany;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "payment_companies")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PaymentCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String companyName;
    @Column(nullable = false)
    private boolean isActive;


}