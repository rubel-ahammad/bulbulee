package com.bulbulee.service.api;

import com.bulbulee.model.entity.Member;
import com.bulbulee.model.projections.MemberProjection;
import com.bulbulee.service.params.MemberCreateParams;
import com.bulbulee.service.params.MemberSearchParams;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    Member create(MemberCreateParams params);
    Optional<Member> findMember(Long id);
    List<MemberProjection> findMembers(MemberSearchParams memberSearchParams);
}
