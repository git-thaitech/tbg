package net.techeese.tbgspring.POJO;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "interest_payment_history", indexes = @Index(columnList = "id"))
public class InterestPaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ordinal")
    private Integer ordinal;

    @ManyToOne
    @JoinColumn(name = "loan_agreement_id")
    private LoanAgreement loan_agreement;

    @Column(name = "interest_payment_amount")
    private Double interest_payment_amount;

    @Column(name = "from_date")
    private Instant from_date;

    @Column(name = "to_date")
    private Instant to_date;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;
}
