import contexto.Context;
import interfazImplementacion.ConcreteStrategyAdd;
import interfazImplementacion.ConcreteStrategyMultiply;
import interfazImplementacion.ConcreteStrategySubtract;

import java.util.Scanner;

public class StrategyAplicacion {

        public static void main(String[] args) {
        Context context = new Context();
           System.out.println("Tecle primer numero, segundo numero " +
                   "y una posible accion (addition,subtraction, multiplication)");

            // Supongamos que los valores se leen y se almacenan en las variables firstNumber, secondNumber y action.
            Scanner scan = new Scanner(System.in);
            // Leer el primer número.
            int firstNumber = scan.nextInt();
            // Leer el segundo número.
            int secundNumber = scan.nextInt();
            // Leer la acción deseada de la entrada del usuario
            String action = (String)scan.next();


        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        }

        if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        }

        if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        Number result = context.executeStrategy(firstNumber, secundNumber);

        System.out.println("The result at "+action+" is "+result);
    }

}