package club.clade.session.event.user.impl;

import club.clade.session.MemberRank;
import club.clade.session.Session;
import club.clade.session.SessionMember;
import club.clade.session.event.user.UserEvent;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class UserRankChangeEvent extends UserEvent {

    private MemberRank before,after;

    public UserRankChangeEvent(@NonNull Session session, @NonNull SessionMember member,
                               @NotNull MemberRank before, @NotNull MemberRank after) {
        super(session, member);

        this.before = before;
        this.after = after;
    }
}
