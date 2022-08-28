/*Define a class called circle that contains:
• Two  instance variables: radius (of type double) and color (of type String),
• Initialize the variables radius and color with default value of 1.0 and "red", respectively
 using default constructor.
• Include a second constructor that will use the default value for color and sets the value of radius to the value passed as parameter.
 Two public methods: getRadius() and getArea() for returning the radius and area of the circle.*/

package circle;

public class circle {double radius;
String color;
circle(){
 this.radius=1.0;
this.color="red";}
 circle(double r){
	 radius=r;
	 color="red";}
	 double getRadius() {
	 return radius;}
	 double getArea() {
		 return radius*radius*3.14;}}

