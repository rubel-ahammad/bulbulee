package com.bulbulee.facade.api.impl;

import com.bulbulee.app.common.enums.MemberType;
import com.bulbulee.facade.api.MemberFacade;
import com.bulbulee.facade.dto.MemberCreateDto;
import com.bulbulee.facade.dto.MemberDto;
import com.bulbulee.model.entity.Member;
import com.bulbulee.service.api.MemberService;
import com.bulbulee.service.params.MemberCreateParams;
import com.bulbulee.service.params.MemberSearchParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MemberFacadeImpl implements MemberFacade {

    private final MemberService memberService;

    @Override
    public MemberDto create(MemberCreateDto memberCreateDto) {
        Member member = memberService.create(MemberCreateParams.builder()
                .name(memberCreateDto.getName())
                .build());
        return mapMember(member);
    }

    private MemberDto mapMember(Member member) {
        return MemberDto.builder()
                .id(member.getId())
                .name(member.getName())
                .build();
    }

    @Override
    public Optional<MemberDto> findMember(Long id) {
        return memberService.findMember(id)
                .map(this::mapMember);
    }

    @Override
    public List<MemberDto> findMembers(MemberType type) {
        return memberService.findMembers(new MemberSearchParams()).stream()
                .map(memberProjection -> MemberDto.builder()
                        .id(memberProjection.getId())
                        .name(memberProjection.getName())
                        .build())
                .collect(Collectors.toList());
    }
}
