package base.chapter13;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    //Construct a circle with radius 1
    public CircleWithException() {
        this(1.0);
    }

    //Construct a circle with a spcified radius
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    //Return radius
    public double getRadius() {
        return radius;
    }

    //set a new radius
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if(newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    //Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //Return the area of this circle
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
