package base.chapter08;

public class TotalArea {
    public static void main(String[] args) {
        Circle3[] circleArray = createCircleArray();

        //Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    //Create an array of Circle objects
    public static Circle3[] createCircleArray() {
        Circle3[] circleArray = new Circle3[5];

        for(int i=0; i<circleArray.length; i++) {
            circleArray[i] = new Circle3(Math.random() * 100);
        }

        return circleArray;
    }

    //Print an array of circles and their total area
    public static void printCircleArray(Circle3[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i=0; i<circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("------------------------------------------");

        //Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
    }

    //Add circle areas
    public static double sum(Circle3[] circleArray) {
        //Initialize sum
        double sum = 0;

        //Add areas to sum
        for(int i=0; i<circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}
