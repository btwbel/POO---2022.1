package questao2;
public class Rectangle {
    double height, width;

    double area() {
        return height * width;

    }


    double perimeter() {
        return (height * width) * (2);

    }


    double diagonal(); {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

    }


}
