package com.bulbulee.notification;

import com.bulbulee.model.event.MemberCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MemberEventHandler {

    @EventListener
    public void memberCreated(MemberCreatedEvent memberCreatedEvent) {
        System.out.println("Member id: " + memberCreatedEvent.getMember().getId());
    }
}
