package base.chapter21;

public class WildCardDemo1 {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        //System.out.println("The max number is " + max(intStack));
        /* Use up bounded wildcard */
        System.out.println("The max number is " + max(intStack));
    }

    //Find the maximum in a stack of numbers
    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); //Initialize max

        while(!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if(value > max)
                max = value;
        }

        return max;
    }
}
