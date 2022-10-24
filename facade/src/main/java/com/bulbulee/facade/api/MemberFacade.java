package com.bulbulee.facade.api;

import com.bulbulee.facade.dto.MemberCreateDto;
import com.bulbulee.common.enumeration.MemberType;
import com.bulbulee.facade.dto.MemberDto;

import java.util.List;
import java.util.Optional;


public interface MemberFacade {
    MemberDto create(MemberCreateDto memberCreateDto);
    Optional<MemberDto> findMember(Long id);
    List<MemberDto> findMembers(MemberType type);
}
