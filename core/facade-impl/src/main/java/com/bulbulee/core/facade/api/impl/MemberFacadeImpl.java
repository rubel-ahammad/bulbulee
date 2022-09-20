package com.bulbulee.core.facade.api.impl;

import com.bulbulee.core.facade.api.MemberFacade;
import com.bulbulee.core.facade.dto.MemberDto;
import com.bulbulee.core.service.api.MemberService;
import com.bulbulee.core.service.params.MemberCreateParams;
import com.bulbulee.core.service.params.MemberSearchParams;
import com.ideascale.core.common.enums.MemberType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MemberFacadeImpl implements MemberFacade {

    private final MemberService memberService;

    @Override
    public MemberDto save(MemberDto memberDto) {
        memberService.create(MemberCreateParams.builder()
                .name("rubel")
                .build());
        return MemberDto.builder()
                .id(1L)
                .build();
    }

    @Override
    public List<MemberDto> findMembers(MemberType type) {
        return memberService.findMembers(new MemberSearchParams()).stream()
                .map(memberProjection -> MemberDto.builder()
                        .id(memberProjection.getId())
                        .build())
                .collect(Collectors.toList());
    }
}
