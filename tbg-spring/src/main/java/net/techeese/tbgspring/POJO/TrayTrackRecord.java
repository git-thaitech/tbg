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
@DynamicInsert
@DynamicUpdate
@Table(name = "tray_track_record", indexes = @Index(columnList = "id"))
public class TrayTrackRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tray_id")
    private Tray tray;

    @Column(name = "number_of_products")
    private Integer number_of_products;

    @Column(name = "total_tray_weight")
    private Float total_tray_weight;

    @Column(name = "tracking_time")
    private Instant tracking_time;

    @Column(name = "note")
    private String note;

    @CreationTimestamp
    private Instant created_on;

    @UpdateTimestamp
    private Instant updated_on;

    public TrayTrackRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

    public Integer getNumber_of_products() {
        return number_of_products;
    }

    public void setNumber_of_products(Integer number_of_products) {
        this.number_of_products = number_of_products;
    }

    public Float getTotal_tray_weight() {
        return total_tray_weight;
    }

    public void setTotal_tray_weight(Float total_tray_weight) {
        this.total_tray_weight = total_tray_weight;
    }

    public Instant getTracking_time() {
        return tracking_time;
    }

    public void setTracking_time(Instant tracking_time) {
        this.tracking_time = tracking_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Instant getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Instant created_on) {
        this.created_on = created_on;
    }

    public Instant getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Instant updated_on) {
        this.updated_on = updated_on;
    }
}
