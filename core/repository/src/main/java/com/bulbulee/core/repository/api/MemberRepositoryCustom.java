package com.bulbulee.core.repository.api;

import com.bulbulee.core.model.projections.MemberProjection;
import com.bulbulee.core.repository.query.MemberQuery;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberProjection> findMemberProjection(MemberQuery memberQuery);
}
