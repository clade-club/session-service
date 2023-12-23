package club.clade.session.event.user.impl;

import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.user.UserEvent;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class UserDisconnectEvent extends UserEvent {

    private final long when;
    private final DisconnectCause cause;

    public UserDisconnectEvent(@NonNull final Session session, @NonNull final SessionMember member,
                               final long when, @NotNull final DisconnectCause cause) {
        super(session, member);

        this.when = when;
        this.cause = cause;
    }

    public enum DisconnectCause{
        DEFAULT,
        FORCED,
        KICKED
    }
}
