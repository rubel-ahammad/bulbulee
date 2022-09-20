package com.bulbulee.core.service.api;

import com.bulbulee.core.model.entity.Member;
import com.bulbulee.core.model.projections.MemberProjection;
import com.bulbulee.core.service.params.MemberCreateParams;
import com.bulbulee.core.service.params.MemberSearchParams;

import java.util.List;

public interface MemberService {
    Member create(MemberCreateParams params);
    List<MemberProjection> findMembers(MemberSearchParams memberSearchParams);
}
