package com.biolab.security.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthSystemDTO {

    @NotBlank
    private String senha;
    @NotBlank
    private String cpf;

}
