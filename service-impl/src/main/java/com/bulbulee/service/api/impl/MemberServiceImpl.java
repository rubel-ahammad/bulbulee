package com.bulbulee.service.api.impl;

import com.bulbulee.model.entity.Member;
import com.bulbulee.model.projections.MemberProjection;
import com.bulbulee.repository.api.MemberRepository;
import com.bulbulee.repository.query.MemberQuery;
import com.bulbulee.service.CacheNames;
import com.bulbulee.service.api.MemberService;
import com.bulbulee.service.params.MemberCreateParams;
import com.bulbulee.service.params.MemberSearchParams;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Member create(MemberCreateParams params) {
        return saveMember(params);
    }

    @Override
    @Cacheable(cacheNames = CacheNames.MEMBERS, key = "#id")
    public Optional<Member> findMember(Long id) {
        return memberRepository.findById(id);
    }

    @CacheEvict(cacheNames = CacheNames.MEMBERS, key = "#result.id")
    private Member saveMember(MemberCreateParams params) {
        return memberRepository.save(buildMember(params));
    }

    private Member buildMember(MemberCreateParams params) {
        return Member.builder()
                .name(params.getName())
                .build();
    }

    @Override
    public List<MemberProjection> findMembers(MemberSearchParams memberSearchParams) {
        return memberRepository.findMemberProjection(new MemberQuery());
    }
}
