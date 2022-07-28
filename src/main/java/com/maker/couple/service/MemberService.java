package com.maker.couple.service;

import com.maker.couple.domain.Matching;
import com.maker.couple.domain.Member;
import com.maker.couple.domain.MyType;
import com.maker.couple.repository.MatchingRepository;
import com.maker.couple.repository.MemberRepository;
import com.maker.couple.repository.MyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MyTypeRepository myTypeRepository;

    public List<Member> getList() {
        return memberRepository.findAll();
    }

    public Member findById(int id) {
        return memberRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Member save(Member member, MyType myType) {
        Member result = memberRepository.save(member);

        myType.setMember(member);
        myTypeRepository.save(myType);

        return result;
    }

    public void delete(int id) {
        memberRepository.deleteById(id);
    }

}
