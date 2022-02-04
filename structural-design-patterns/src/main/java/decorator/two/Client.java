package decorator.two;

import java.text.DecimalFormat;

public class Client {

    public static void main(String[] args) {
        //Pizza largePizza = new LargePizza();
    	Pizza smallPizza = new SmallPizza();
        smallPizza = new Cheese(smallPizza);
        smallPizza = new Ham(smallPizza);
        smallPizza = new Peppers(smallPizza);

        System.out.println(smallPizza.getDescription());
        System.out.println(round(smallPizza.calculateCost()));
    }

    public static double round(double value) {
        DecimalFormat newFormat = new DecimalFormat("#.#");
        return Double.valueOf(newFormat.format(value));
    }
}
