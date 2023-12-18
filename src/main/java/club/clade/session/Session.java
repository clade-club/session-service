package club.clade.session;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface Session extends Keyed{

    @NotNull
    Collection<SessionMember> members();

}
