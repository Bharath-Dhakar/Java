public class QesSeven {

    public static void main(String[] args) {
        int r = 8;
         // Top
        for (int i = 1; i <= r; i++) {

            for (int spc = 1; spc <= r - i; spc++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if( j == 1 || j == i){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Bottom
        for (int i = r-1; i >= 1; i--) {

            for (int spc = 1; spc <= r - i; spc++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if( j == 1 || j == i){
                    System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }

    }

}
