package com.example.newSection13.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    Long Id;
    String username;
    String fullName;
    String password;
    String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
