package com.example.novapay.branch;
import com.example.novapay.paymentcompany.PaymentCompany;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "branches")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="company_id")
    private PaymentCompany companyId;

    @Column(nullable = false, unique = true)
    private String branchName;
    @Column(nullable = true, unique = true)
    private String Longitude;
    @Column(nullable = true, unique = true)
    private String Latitude;
    @Column(nullable = false)
    private String password;
}