package com.bulbulee.core.repository.api.impl;

import com.bulbulee.core.model.entity.Member;
import com.bulbulee.core.model.entity.QMember;
import com.bulbulee.core.model.projections.MemberProjection;
import com.bulbulee.core.repository.api.MemberRepositoryCustom;
import com.bulbulee.core.repository.query.MemberQuery;
import com.querydsl.core.types.Projections;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepositoryImpl extends QuerydslRepositorySupport implements MemberRepositoryCustom {

    public MemberRepositoryImpl() {
        super(Member.class);
    }

    @Override
    public List<MemberProjection> findMemberProjection(MemberQuery memberQuery) {
        QMember member = new QMember("q");
        return from(member)
                .select(Projections.constructor(MemberProjection.class, member.id, member.name))
                .fetch();
    }
}
