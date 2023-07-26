import java.util.Scanner;
public class new_Proyect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra los valores");
        System.out.println("Valor de x \n");
        int x = sc.nextInt();
        System.out.println("Valor de z\n"); 
        int z = sc.nextInt();

        System.out.println("Valor de x = "+ x +" "+"Valor de z = "+z);
        System.out.println("Suma de 'x' y 'z' "+Sum(x, z)); 
        System.out.println("Finaliza el programa");
        
    }

    public static int Sum(int a,int b){
        int sum = a+b;
        return sum;
    };
}
