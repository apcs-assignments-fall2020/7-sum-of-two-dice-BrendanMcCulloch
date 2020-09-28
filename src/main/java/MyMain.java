import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int konto;
        konto = (int) (Math.random()*6) +1;
        return konto;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int syg, isposter, konto;
        int[] tpose = new int [12];
        for (int i = 0; i < n; i++) {
            syg = rollDie();
            isposter = rollDie();
            konto = syg + isposter;
            tpose[konto-2] +=1;
        }
        return tpose;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Roll die");
        String g = scan.next();
        int n = Integer.parseInt(g);
        int[] u = sumOfTwoDice(n);
        int now;

        for (int k = 0; k <u.length; k++){
            now = k + 2; 
            System.out.println(u[k] + now);

        }
        scan.close();

    }
}
