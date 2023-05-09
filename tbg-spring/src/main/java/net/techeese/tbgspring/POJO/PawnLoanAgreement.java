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
@Table(name = "pawn_loan_agreement", indexes = @Index(columnList = "id, barcode1, barcode2"))
public class PawnLoanAgreement {

    private enum STATUS {
        PERFORMING, // bình thường
        LATE, // trễ hạn đóng lãi
        OVERDUE, // quá hạn đóng lãi
        DONE, // đã chuộc
        DEFAULT, // đã phát mãi
        CANCEL // huỷ đơn cầm
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "barcode1", unique = true)
    private String barcode1;

    @Column(name = "barcode2", unique = true)
    private String barcode2;

    @Column(name = "mortgage_loan_amount")
    private Long mortgage_loan_amount;

    @Column(name = "pawn_day")
    private Instant pawn_day;

    @Column(name = "redemption_day")
    private Instant redemption_day;

    @Column(name = "status")
    private STATUS status;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public PawnLoanAgreement() {
    }
}
