package com.maker.couple.domain;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinitions;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int age;

    private String address;

    private String phoneNumber;

    private String email;

    private int height;

    private int weight;

    private String job;

    private int salary;

    @OneToMany(mappedBy = "applicant")
    private List<Matching> fromMatchingList;

    @OneToMany(mappedBy = "respondent")
    private List<Matching> toMatchingList;

    @OneToOne
    private MyType myType;

}
