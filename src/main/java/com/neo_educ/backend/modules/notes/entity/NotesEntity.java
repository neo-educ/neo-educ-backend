package com.neo_educ.backend.modules.notes.entity;

import com.neo_educ.backend.core.model.AbstractModel;
import com.neo_educ.backend.modules.teacher.entity.TeacherEntity;
import com.neo_educ.backend.modules.student.entity.StudentEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "notes")
public class NotesEntity extends AbstractModel  {

  @NotBlank(message = "O campo [title] não pode ser vazio")
  private String title;

  @NotBlank(message = "O campo [content] não pode ser vazio")
  private String content;

  @ManyToOne
  @JoinColumn(name = "student_id", nullable = false)
  private StudentEntity student;

}
