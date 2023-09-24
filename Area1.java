import java.util.Scanner;

class Area1 {
    double length;
    double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    //get area
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        double length = sun.nextInt();

        System.out.println("Enter the breadth of rectangle: ");
        double breadth = sun.nextInt();

        Area1 area = new Area1();
        area.setLength(length);
        area.setBreadth(breadth);

        double areaOfRectangle = area.getArea();

        System.out.println("The area of the rectangle is " + areaOfRectangle);
        sun.close();

    }
}