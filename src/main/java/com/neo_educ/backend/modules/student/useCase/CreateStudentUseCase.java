package com.neo_educ.backend.modules.student.useCase;

import com.neo_educ.backend.modules.student.dto.CreateStudentRequestDTO;
import com.neo_educ.backend.modules.student.dto.CreateStudentResponseDTO;
import com.neo_educ.backend.modules.student.entity.StudentEntity;
import com.neo_educ.backend.modules.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateStudentUseCase {

  @Autowired
  private StudentRepository studentRepository;

  public CreateStudentResponseDTO execute(CreateStudentRequestDTO createStudentRequestDTO) {
    StudentEntity entity = StudentEntity.builder()
        .name(createStudentRequestDTO.name())
        .email(createStudentRequestDTO.email())
        .proficiencyLevel(createStudentRequestDTO.proficiencyLevel())
        .build();

    StudentEntity saved = studentRepository.save(entity);

    return CreateStudentResponseDTO.fromEntity(saved);
  }

}
