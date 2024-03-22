package com.hindujatech.employe.management.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class EmployeeDTO {
    private Long id;
    @NotNull
    @Size(min = 5, max = 10, message = "Employee number must be between 5 and 10 characters")
    private String empNo;

    @NotNull
    @Size(min = 5, max = 50, message = "Employee name must be between 5 and 50 characters")
    private String empName;

    @NotNull
    @Size(min = 10, max = 10, message = "Mobile number must be 10 characters")
    private String mobile;

    @NotNull
    @Email(message = "Email should be valid")
    @Size(max = 100, message = "Email must be maximum 100 characters")
    private String email;
}
