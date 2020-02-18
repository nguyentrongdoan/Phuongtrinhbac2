import java.util.Scanner;


class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("pt bac 2:" + quadraticEquation.display());

        if (a == 0){
            if (b == 0){
                System.out.print("phuong trinh vo so nghiem.");
            }else {
                System.out.print("phuong trinh co nghiem duy nhat: " + quadraticEquation.nghiemduynhat());
            }
        }
        else
        {
            if (quadraticEquation.getDiscriminant() < 0){
                System.out.print("phuong trinh vo nghiem.");
            }
            else
            {
                if (quadraticEquation.getDiscriminant() == 0)
                {
                    System.out.print("phuong trinh co nghiem kep: " + quadraticEquation.nghiemkep());
                }
                else
                {
                    System.out.println("phuong trinh co 2 nghiem phan biet: ");
                    quadraticEquation.nghiemphanbiet();
                }
            }
        }
    }
}