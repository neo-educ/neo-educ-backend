package com.neo_educ.backend.apps.exercises.athlete.dto;

import com.neo_educ.backend.apps.exercises.athlete.enums.Sex;
import com.neo_educ.backend.apps.exercises.athlete.enums.WorkoutLevel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public record AthleteRegisterDTO(

        @NotBlank(message = "O nome é obrigatório.")
        String name,

        @NotBlank(message = "O sobrenome é obrigatório.")
        String lastName,

        @NotBlank(message = "O e-mail é obrigatório.")
        @Email(message = "O e-mail deve ser válido.")
        String email,

        @NotBlank(message = "O telefone é obrigatório.")
        String phone,

        @NotNull(message = "Os interesses são obrigatórios.")
        @Size(min = 1, message = "Selecione pelo menos um interesse.")
        List<@NotNull(message = "O ID do interesse não pode ser nulo.") Integer> interests,

        @NotNull(message = "O nível de workout é obrigatório.")
        WorkoutLevel workoutLevel,

        @NotNull(message = "O sexo é obrigatório")
        Sex sex,
        @NotNull(message = "O peso é obrigatório.")
        Double weight,
        @NotNull(message = "A altura é obrigatória.")
        Double height,
        @NotNull(message = "A data de nascimento é obrigatória.")
        LocalDate dateOfBirth

) { }