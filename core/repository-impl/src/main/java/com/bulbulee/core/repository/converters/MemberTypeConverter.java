package com.bulbulee.core.repository.converters;

import com.ideascale.core.common.enums.MemberType;

public class MemberTypeConverter {
    MemberType fromNumber(Integer id) {
        return MemberType.FREE;
    }
}
