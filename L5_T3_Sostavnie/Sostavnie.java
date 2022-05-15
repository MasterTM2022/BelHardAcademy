package L5_T3_Sostavnie;

public class Sostavnie {
    public static void main(String[] args) {
        for (int i=3; i<=120; i++) {
            int j = 2;
            while (j <= (int)Math.sqrt(i)+1) {
                if (i%j==0) {
                    System.out.println(i + " (наименьший делитель: " + j + ")");
                    break;
                } else {
                    j++;
                }
            }
       }
    }
}

