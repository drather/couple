package com.maker.couple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int lowerHeight;

    private int higherHeight;

    private int lowerWeight;

    private int higherWeight;

    private int lowerSalary;

    private int higherSalary;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
