public class Diamond {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.print("\n");
            for (int j = 0; j < 5; j++){
                if (i + j <= 3){
                    System.out.print("  ");;
                } else {
                    System.out.print("* ");
                }
            }

            for (int j = 0; j < 4; j++){
                if (i <= j){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
        }

        for (int i = 0; i < 4; i++){
            System.out.print("\n");
            for (int j = 0; j < 5; j++){
                if(i < j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 0; j < 4; j++){
                if (i + j <= 2){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }

        System.out.print("\n");

    }

}
