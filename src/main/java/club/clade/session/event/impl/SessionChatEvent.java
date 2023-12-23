package club.clade.session.event.impl;

import club.clade.session.Session;
import club.clade.session.event.SessionEvent;
import lombok.Getter;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

@Getter
public class SessionChatEvent extends SessionEvent {

    private String message;
    private long when;

    public SessionChatEvent(@NotNull final Session session, @NonNull final String message,
                            final long when) {
        super(session);

        this.message = message;
        this.when = when;
    }
}
