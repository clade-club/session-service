package club.clade.session;

import java.util.Collection;

public interface Club extends Keyed {

    Collection<Session> sessions();

}
