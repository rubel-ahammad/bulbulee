package com.bulbulee.repository.api.impl;

import com.bulbulee.model.entity.Member;
import com.bulbulee.model.entity.QMember;
import com.bulbulee.model.projections.MemberProjection;
import com.bulbulee.repository.api.MemberRepositoryCustom;
import com.bulbulee.repository.query.MemberQuery;
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
