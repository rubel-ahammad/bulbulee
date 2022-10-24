package com.bulbulee.repository.converters;

import com.bulbulee.common.enumeration.MemberType;

public class MemberTypeConverter {
    MemberType fromNumber(Integer id) {
        return MemberType.FREE;
    }
}
