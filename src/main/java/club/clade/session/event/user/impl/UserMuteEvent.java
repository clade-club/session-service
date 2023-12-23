package club.clade.session.event.user.impl;

import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.user.UserEvent;
import lombok.NonNull;

public class UserMuteEvent extends UserEvent {

    public UserMuteEvent(@NonNull final Session session, @NonNull final SessionMember member) {
        super(session, member);
    }
}
