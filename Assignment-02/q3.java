import java.util.*;

class Volume {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of cube : " );
    double side = sc.nextDouble();
    double Cube_Volume = side * side * side;
    System.out.println("Enter the length of the cuboid :");
    double length = sc.nextDouble();
    System.out.println("Enter the breadth of the cuboid : ");
    double breadth = sc.nextDouble();
    System.out.println("Enter The Height of The Cuboid :");
    double height = sc.nextDouble();
    double Cuboid_Volume = length*breadth*height;
    System.out.println("The volume of the Cube is " + Cube_Volume);
    System.out.println("The volume of the Cuboid is " + Cuboid_Volume);
    sc.close();
    }
}