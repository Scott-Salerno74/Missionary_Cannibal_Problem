import aima.core.logic.fol.kb.data.Literal;
import aima.core.logic.planning.State;

import java.util.List;

public class Failure_State extends State {
    public Failure_State(List<Literal> fluents) {
        super(fluents);
    }
}
