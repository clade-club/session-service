package club.clade.session.event;

import club.clade.session.Club;
import club.clade.session.Session;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class SessionEvent {

    private final Session session;

}
