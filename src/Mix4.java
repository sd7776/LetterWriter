import java.util.Scanner;

public class Mix4 {
    int counter = 0;
    public static void main(String[] args) {
        boolean cont = false;
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter first:");

            int first = scan.nextInt();
            System.out.println("Enter second:");
            int second = scan.nextInt();
            while (x < first) {
                m4a[x] = new Mix4();
                m4a[x].counter = m4a[x].counter + 1;
                count = count + 1;
                count = count + m4a[x].maybeNew(x, second);
                x++;
            }
            System.out.println(count + " " + m4a[1].counter);
            System.out.println("Continue? Y/N" );
            String yn = scan.next();
            cont = yn.equalsIgnoreCase("y");
        }while (cont);
    }

    public int maybeNew(int index, int second){

        if(index < second){
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
