package com.azeez.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Employee implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(nullable = false, updatable = false)
   private Long id;
   private String name;
   private String email;
   private String jobTitle;
   private String phone;
   private String imageUrl;
   @Column(nullable = false, updatable = false)
   private String employeeCode;
}
