package com.example.newSection13.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReqDTO {
    @NotNull
    String username;
    String fullName;
    String password;
    @Email(message = "please enter email in the right way")
    String email;
}
