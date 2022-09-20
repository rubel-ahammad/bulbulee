package com.bulbulee.core.service.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MemberCreateParams {
    private final String name;
}
