package com.neo_educ.backend.apps.exercises.materialGeneration.dto;

import com.neo_educ.backend.apps.exercises.athlete.enums.WorkoutLevel;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record GenerateExerciseDTO(
        @NotBlank(message = "O campo [tópico] não pode estar vazio")
        String topic,

        @NotBlank(message = "O campo [nível] não pode estar vazio")
        WorkoutLevel level,

        List<String> interests,

        @NotNull(message = "O campo [quantidade] não pode ser nulo")
        @Min(1)
        @Max(20)
        int quantity
) {
}
