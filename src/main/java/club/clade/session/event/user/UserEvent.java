package club.clade.session.event.user;

import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.SessionEvent;
import lombok.Getter;
import lombok.NonNull;

@Getter
public abstract class UserEvent extends SessionEvent {

    private final SessionMember member;

    public UserEvent(@NonNull final Session session,
                     @NonNull final SessionMember member) {
        super(session);

        this.member = member;
    }
}
