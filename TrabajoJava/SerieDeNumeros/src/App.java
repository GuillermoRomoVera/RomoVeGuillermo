public class App {
    public static void main(String[] args) throws Exception {

        int a=1;
        int b=2;
        int c=1;
        int r=0;

        System.out.println("" + a);
        System.out.println("" + b);

        r=a+b;
        
        do
        {
            r=a+b;
            System.out.println("" + r);
            a=b;
            b=r;
            c++;
        }
        while (c <= 10);
        {
            System.out.print("Termina la secuencia");
        }

    }
}
