package questao4;
public class Retangle {
    public class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(Color color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }

    }

