package io.github.CarolRosaa.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
   @Id
   @GeneratedValue
   private Integer id;
   @Column (nullable = false, length = 150)
   private String nome;
   @Column(nullable = false, length = 11)
   private String cpf;
   @Column (name = "date_cadastro")
   private LocalDate dataCadastro;

   @PrePersist
   public void prePresist() {
      setDataCadastro(LocalDate.now());

   }

   }


