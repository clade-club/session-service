package club.clade.session;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SessionMember extends Keyed {

    @NotNull
    String wallet();

    @Nullable
    Session currentSession();

    @NotNull
    MemberState state();

    @NotNull
    MemberRank rank();
}
