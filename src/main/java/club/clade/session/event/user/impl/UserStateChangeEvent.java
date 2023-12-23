package club.clade.session.event.user.impl;

import club.clade.session.MemberState;
import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.user.UserEvent;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

public class UserStateChangeEvent extends UserEvent {

    private MemberState before,after;

    public UserStateChangeEvent(@NonNull Session session, @NonNull SessionMember member,
                                @NotNull final MemberState before, @NotNull final MemberState after) {
        super(session, member);

        this.before = before;
        this.after = after;
    }
}
