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
@Table(name = "pawn_loan_agreement", indexes = @Index(columnList = "id, barcode"))
public class PawnLoanAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "barcode")
    private String barcode;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;
}
