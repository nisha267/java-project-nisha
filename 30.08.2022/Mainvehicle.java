package vehicle.java;

import java.util.Scanner;

public class Mainvehicle {public static void main(String args[]) {
String regno,color,owner,manufacturer;
int speed,route;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Bus reg no: ");
regno=sc.nextLine();
System.out.println("Enter Bus color: ");
color=sc.nextLine();
System.out.println("Enter Bus owner name: ");
owner=sc.nextLine();
System.out.println("Enter Bus speed: ");
speed=sc.nextInt();
System.out.println("Enter Bus route: ");
route=sc.nextInt();
Bus b=new Bus(regno,color,owner,speed,route);
b.showData();
System.out.println("Enter car reg no: ");
regno=sc.nextLine();
System.out.println("Enter car color: ");
color=sc.nextLine();
System.out.println("Enter Bus owner name: ");
owner=sc.nextLine();
System.out.println("Enter car speed: ");
speed=sc.nextInt();
System.out.println("Enter Bus manufacturer: ");
manufacturer=sc.nextLine();
Car c=new Car(regno,color,owner,speed,manufacturer);
c.showData();
}}
