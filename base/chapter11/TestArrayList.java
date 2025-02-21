package base.chapter11;

public class TestArrayList {
    public static void main(String[] args) {
        //Create a list to store cities
        java.util.ArrayList cityList = new java.util.ArrayList();

        //Add some cities in the list
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size ? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Xian");
        cityList.remove("Miami");
        cityList.remove(1);

        System.out.println(cityList.toString());

        for(int i=cityList.size() - 1; i>=0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();

        java.util.ArrayList list = new java.util.ArrayList();
        list.add(new Circle4(2));
        list.add(new Circle4(3));

        System.out.println("The area of the circle? " + ((Circle4)list.get(0)).getArea());
    }
}
