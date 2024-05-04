package contexto;

import interfaz.Strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return (int) strategy.execute(a, b);
    }
}
