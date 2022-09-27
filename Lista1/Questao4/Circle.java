package questao4;
public class Circle {
    public class Circle extends Shape {
        private double radius;

        public Circle(Color color, double radius) {
            super(color);
            this.radius = radius;
        }


        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }
}
