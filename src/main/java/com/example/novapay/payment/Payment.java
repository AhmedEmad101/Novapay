package com.example.novapay.payment;
import com.example.novapay.payment.enums.PaymentMethod;
import com.example.novapay.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "from_user_id")
    private User fromUser;
    @ManyToOne
    @JoinColumn(name = "to_user_id")
    private User toUser;
    @Column(nullable = false, unique = true)
    private Long paymentCompanyId;
    @Column(nullable = false)
    private Double amount;
}