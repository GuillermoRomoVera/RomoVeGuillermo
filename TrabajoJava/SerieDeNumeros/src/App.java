public class App {
    public static void main(String[] args) throws Exception {

        //GUILLERMO ROMO VERA #19100251
        int a=1;
        int b=2;
        int c=1;
        int r=0;
        int s=1;

        System.out.println("El primer numero es: " + a);
        System.out.println("El segundo numero es: " + b);
        System.out.println("");
        
        do
        {
            r=a+b;

            System.out.println("El resultado de la suma de la secuencia " + s + " es: " + r);

            a=b;
            b=r;
            c++;
            s++;
        }
        while (c <= 10);
        {
            System.out.print("\n" + "Termina la secuencia");
        }

    }
}
