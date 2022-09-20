package com.bulbulee.core.model.entity;

import com.ideascale.core.common.enums.MemberType;

import javax.persistence.*;

@Entity
@Table
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    private MemberType memberType;
}
