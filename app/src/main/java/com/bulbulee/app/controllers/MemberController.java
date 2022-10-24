package com.bulbulee.app.controllers;

import com.bulbulee.common.enumeration.MemberType;
import com.bulbulee.facade.api.MemberFacade;
import com.bulbulee.facade.dto.MemberCreateDto;
import com.bulbulee.facade.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberFacade memberFacade;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        MemberDto memberDto = memberFacade.create(MemberCreateDto.builder()
                .name(name)
                .build());
        memberFacade.findMember(memberDto.getId());
        memberFacade.findMember(memberDto.getId());
        memberFacade.findMember(memberDto.getId());
        List<MemberDto> members = memberFacade.findMembers(MemberType.FREE);
        model.addAttribute("name", members.size());
        return "greeting";
    }
}
