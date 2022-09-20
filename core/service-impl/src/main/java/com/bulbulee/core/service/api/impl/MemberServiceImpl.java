package com.bulbulee.core.service.api.impl;

import com.bulbulee.core.model.entity.Member;
import com.bulbulee.core.model.projections.MemberProjection;
import com.bulbulee.core.repository.api.MemberRepository;
import com.bulbulee.core.repository.query.MemberQuery;
import com.bulbulee.core.service.api.MemberService;
import com.bulbulee.core.service.params.MemberCreateParams;
import com.bulbulee.core.service.params.MemberSearchParams;
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
