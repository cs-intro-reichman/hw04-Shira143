public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[num+1];
        int much = 0;
        int count = 0;
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < num+1; i++) {
            arr[i] = true;
        }
        for (int p = 2; p * p <= num; p++) {
             if (arr[p]) {
             for (int i = p * p; i <= num; i += p) {
            arr[i] = false; 
        }
    }
        }
        for (int q = 2; q < num+1; q++) {
            if (arr[q] == true)
                much++;
        }
          
        System.out.println("Prime numbers up to " + num + ":");
        for (int e = 0; e < num+1; e++) {
           if (arr[e] == true){
            System.out.println(e);
            count++;
           }
            
        }
        System.out.println("There are " + count + " primes between 2 and " + num + " (" + 
        (much*100/num) + "% are primes)");
    }
}