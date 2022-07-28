package com.maker.couple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.maker.couple.domain.Member;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Matching {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member applicant;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member respondent;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date date;

    @Enumerated(EnumType.STRING)
    private MatchResult matchResult;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
