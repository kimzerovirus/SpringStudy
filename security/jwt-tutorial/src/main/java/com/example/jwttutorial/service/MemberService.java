package com.example.jwttutorial.service;

import com.example.jwttutorial.security.SecurityUtil;
import com.example.jwttutorial.dto.MemberResponseDto;
import com.example.jwttutorial.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional(readOnly = true)
    public MemberResponseDto getMemberInfo(String email) {
        return memberRepository.findByEmail(email).map(MemberResponseDto::of).orElseThrow(()-> new RuntimeException("유저 정보가 없습니다."));
    }

    @Transactional(readOnly = true)
    public MemberResponseDto getMyInfo(){
        return memberRepository.findById(SecurityUtil.getCurrentMemberId()).map(MemberResponseDto::of).orElseThrow(()-> new RuntimeException("로그인 유저 정보가 없습니다."));
    }
}
