package com.bulbulee.model.projections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class MemberProjection {
    private final Long id;
    private final Long name;
}
