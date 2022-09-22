package com.bulbulee.repository.api;

import com.bulbulee.model.projections.MemberProjection;
import com.bulbulee.repository.query.MemberQuery;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberProjection> findMemberProjection(MemberQuery memberQuery);
}
