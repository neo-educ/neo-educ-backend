package com.neo_educ.backend.modules.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginDTO(
        @NotBlank String email,
        @NotBlank String password
){}
