package com.example.newSection13.model.enitity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
@Where(clause = "deleted_at is null")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    Long Id;
    @Column(name = "username")
    String username;
    @Column(name = "full_name")
    String fullName;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
