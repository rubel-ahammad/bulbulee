package com.bulbulee.core.facade.api;

import com.bulbulee.core.facade.dto.MemberDto;
import com.ideascale.core.common.enums.MemberType;

import java.util.List;


public interface MemberFacade {
    MemberDto save(MemberDto memberDto);
    List<MemberDto> findMembers(MemberType type);
}
