package com.bulbulee.core.model.projections;

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
