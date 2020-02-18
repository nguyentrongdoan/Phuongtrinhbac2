public class QuadraticEquation {
    double a, b, c;
    double delta;
    double x1, x2;


    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        delta = ((Math.pow(this.b, 2)) - 4 * this.a * this.c);
        return delta;
    }
    public double nghiemduynhat(){
        x1 = - this.c / this.b;
        return x1;
    }
    public double nghiemkep(){
        x1 = - this.b / (2 * this.a);
        return x1;
    }
    public void nghiemphanbiet(){
        x1 = ((- this.b + Math.sqrt(delta)) / (2 * this.a));
        x2 = ((- this.b - Math.sqrt(delta)) / (2 * this.a));
        System.out.println("x1= " + x1);
        System.out.println("x2 = " + x2);
    }

    public String display() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}