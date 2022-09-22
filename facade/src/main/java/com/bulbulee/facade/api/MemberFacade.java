package com.bulbulee.facade.api;

import com.bulbulee.facade.dto.MemberDto;
import com.bulbulee.app.common.enums.MemberType;

import java.util.List;


public interface MemberFacade {
    MemberDto save(MemberDto memberDto);
    List<MemberDto> findMembers(MemberType type);
}
