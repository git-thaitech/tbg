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

    @Column(name = "barcode1")
    private String barcode1;

    @Column(name = "barcode2")
    private String barcode2;

    @Column(name = "mortgage_loan_amount")
    private Long mortgage_loan_amount;

    private Instant paw_day;

    private Instant redemption_day;

    private Integer status; //1 dang cam, 2 da chuoc, 3 phat mai, 0 destroy

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;
}
