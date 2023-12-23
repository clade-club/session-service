package club.clade.session.event.user.impl;

import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.user.UserEvent;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class UserConnectEvent extends UserEvent {

    private final long when;

    public UserConnectEvent(@NonNull Session session, @NonNull SessionMember member,
                            final long when) {
        super(session, member);

        this.when = when;
    }
}
