package com.neuromotion.neuromotion.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
@Entity
public class UserEntity {

    @Id
    @Column(name ="id_usuario")
    private String id;

    private String nombre;

    private String apellido;

    private String edad;

    private String correo;

    //is_active


}
