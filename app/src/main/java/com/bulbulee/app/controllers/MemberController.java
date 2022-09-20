package com.bulbulee.app.controllers;

import com.bulbulee.core.facade.api.MemberFacade;
import com.bulbulee.core.facade.dto.MemberDto;
import com.ideascale.core.common.enums.MemberType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberFacade memberFacade;

    @GetMapping("/greeting")
    public String doSomething() {
        List<MemberDto> members = memberFacade.findMembers(MemberType.FREE);
        return "Size: " + members.size();
    }
}
