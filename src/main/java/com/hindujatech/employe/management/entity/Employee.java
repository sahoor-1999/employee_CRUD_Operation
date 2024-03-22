package com.hindujatech.employe.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "EMP_NO", nullable = false)
    private String empNo;
    @Column(name = "EMP_NAME", nullable = false)
    private String empName;
    @Column(name = "MOBILE", nullable = false)
    private String mobile;
    @Column(name = "EMAIL", nullable = false)
    private String email;

}
