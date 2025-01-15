package com.example.newSection13.model.dto;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeReqDTO {
    public Long Id;
    String fullName;
    String password;
    String email;
}
