package com.bulbulee.notification;

import com.bulbulee.model.event.MemberCreatedEvent;

public class MemberEventHandler {
    public void memberCreated(MemberCreatedEvent memberCreatedEvent) {
        System.out.println("Member id: " + memberCreatedEvent.getMember());
    }
}
