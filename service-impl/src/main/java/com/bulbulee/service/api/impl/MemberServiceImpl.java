package com.bulbulee.service.api.impl;

import com.bulbulee.model.entity.Member;
import com.bulbulee.model.projections.MemberProjection;
import com.bulbulee.repository.api.MemberRepository;
import com.bulbulee.repository.query.MemberQuery;
import com.bulbulee.service.api.MemberService;
import com.bulbulee.service.params.MemberCreateParams;
import com.bulbulee.service.params.MemberSearchParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public Member create(MemberCreateParams params) {
        return memberRepository.save(new Member());
    }

    @Override
    public List<MemberProjection> findMembers(MemberSearchParams memberSearchParams) {
        return memberRepository.findMemberProjection(new MemberQuery());
    }
}
