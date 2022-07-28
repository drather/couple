package com.maker.couple.controller;

import com.maker.couple.domain.Member;
import com.maker.couple.domain.MyType;
import com.maker.couple.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping
    public List<Member> findAll() {
        return memberService.getList();
    }

    @GetMapping("/{id}")
    public Member findOne(@PathVariable("id") int id) {
        return memberService.findById(id);
    }

    @PostMapping
    public Member save(@RequestBody Member member,
                       @RequestBody MyType myType) {
        memberService.save(member, myType);
        return member;
    }


}
