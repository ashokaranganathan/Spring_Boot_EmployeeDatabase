package com.employee.database.employee_database.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
    description = "User DTO Model"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long ID;

    @Schema(description = "First Name")
    @NotEmpty
    private String firstName;

    @Schema(description = "Last Name")
    @NotEmpty
    private String lastName;

    @Schema(description = "Base Location")
    @NotEmpty
    private String baseLocation;

    @Schema(description = "Phone Number")
    @NotEmpty
    private String phoneNumber;
    
}
