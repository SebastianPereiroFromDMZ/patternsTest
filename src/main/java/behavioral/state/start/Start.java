package behavioral.state.start;

import behavioral.state.context.TransformerContext;
import behavioral.state.state.FireState;
import behavioral.state.state.MoveState;
import behavioral.state.state.TransformerState;

public class Start {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();

        TransformerState moveState = new MoveState();
        TransformerState fireState = new FireState();

        context.setState(fireState);
        context.action();

        context.setState(moveState);
        context.action();
    }
}
