package com.neo_educ.backend.apps.exercises.workout.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record WorkoutUpdateDTO(
  @NotBlank(message = "O tópico não pode estar em branco")
  String topic,

  @NotNull(message = "A data da aula é obrigatória")
  LocalDateTime classDate,

  @NotBlank(message = "O conteúdo da aula não pode estar em branco")
  String inputData
) {} 