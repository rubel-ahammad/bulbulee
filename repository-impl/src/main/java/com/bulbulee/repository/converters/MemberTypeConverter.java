package com.bulbulee.repository.converters;

import com.bulbulee.app.common.enums.MemberType;

public class MemberTypeConverter {
    MemberType fromNumber(Integer id) {
        return MemberType.FREE;
    }
}
