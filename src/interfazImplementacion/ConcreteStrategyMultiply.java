package interfazImplementacion;

import interfaz.Strategy;

public class ConcreteStrategyMultiply implements Strategy {

    @Override
    public Number execute(int a, int b) {
        return a * b;
    }
}