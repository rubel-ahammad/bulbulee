package com.bulbulee.model.event;

import com.bulbulee.model.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberCreatedEvent {
    private Member member;
}
