package com.biolab.security.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthSystemDTO {

    @NotBlank
    private String senha;
    @NotBlank
    private String cpf;

}
