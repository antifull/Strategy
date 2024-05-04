package interfazImplementacion;

import interfaz.Strategy;

public class ConcreteStrategySubtract implements Strategy {

    @Override
    public Number execute(int a, int b) {
        return a - b;
    }
}