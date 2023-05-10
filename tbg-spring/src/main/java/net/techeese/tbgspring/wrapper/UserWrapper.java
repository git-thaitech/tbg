package net.techeese.tbgspring.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWrapper {
    private Integer id;
    private String username;
    private String password;
    private String NIN;
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone;
    private Date DOB;
    private String role;
    private String status;
    private Date start_date;
    private Date final_date;
    private Long basic_salary;
    private String photo;
    private Instant created_on;
    private Instant updated_on;
}
