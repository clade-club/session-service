package club.clade.session.event.user.impl;

import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.user.UserEvent;
import lombok.NonNull;

public class UserUnmuteEvent extends UserEvent {

    public UserUnmuteEvent(@NonNull Session session, @NonNull SessionMember member) {
        super(session, member);
    }

}
