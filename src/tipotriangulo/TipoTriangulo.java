package tipotriangulo;
import java.util.Scanner;

public class TipoTriangulo {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        float a = entrada.nextFloat();
        System.out.print("Digite o segundo lado do triângulo: ");
        float b = entrada.nextFloat();
        System.out.print("Digite o terceiro lado do triângulo: ");
        float c = entrada.nextFloat();
                
        if (a>(c+b) || b>(c+a) || c>(a+b))
            System.out.println("Não é triângulo!");
        else 
            if (a == b && b==c)
                System.out.println("È um triângulo equilátero");
            else
                if (a == b || a == c || b ==c)
                    System.out.println("È um triângulo isóceles");
                else
                    System.out.println("È um triângulo escaleno");
    }
    
}
