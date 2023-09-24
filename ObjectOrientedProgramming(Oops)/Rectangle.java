// Write a class named Rectangle with two fields, length and breadth, and a method named area(), which calculates and returns the area of the rectangle. Then, create two objects of the Rectangle class and print their areas to the console.


public class Rectangle {         //Creating a Class Rectangle

    int length;
    int breadth;

    void setData(int a, int b) {       //Creating a method or Function setData for set the value of length and breadth
        length = a;
        breadth = b;
    }

    int area() {                     //Creating a area function which calculate the area and return the value
        return length * breadth;
    }

    public static void main(String args[]) {
        Rectangle R1 = new Rectangle();         //Creating object of rectangle class R1
        R1.setData(4, 5);
        System.out.println("The Area of Rectangle1 is :" + R1.area());
        Rectangle R2 = new Rectangle();         //Creating  second object of rectangle class R2
        R2.setData(7, 9);
        System.out.println("The Area of Rectangle2 is :" + R2.area());

    }
}