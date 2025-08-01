package com.neo_educ.backend.apps.english.teacher.entity;

import com.neo_educ.backend.apps.english.classplans.entity.ClassPlansEntity;
import com.neo_educ.backend.apps.english.student.entity.StudentEntity;
import com.neo_educ.backend.core.model.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Table(name = "teachers")
@Entity(name="teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TeacherEntity extends UserEntity implements UserDetails {

    @Builder.Default
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClassPlansEntity> classPlans = new ArrayList<>();
    @OneToMany(mappedBy = "owner", cascade = CascadeType.REMOVE)
    private List<StudentEntity> students;

    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getId(){
        return id;
    }

    public void setInviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
    }

    public TeacherEntity(String name,String lastName,String email,String password,String phone){
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.phone=phone;
    }

}
