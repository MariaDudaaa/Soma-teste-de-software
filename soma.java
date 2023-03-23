import java.util.Scanner;
public class soma {
    public static void main(String[]args){
    Integer n1,n2,soma;
    Scanner Ler = new Scanner(System.in);
    System.out.print("Digite o número 1: ");
    n1 = Ler.nextInt();
    System.out.print("Digite o número 2: ");
    n2 = Ler.nextInt();
    soma = n1+n2;
    System.out.println("RESULTADO: "+soma);
    }
}
