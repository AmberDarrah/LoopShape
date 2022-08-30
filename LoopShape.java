public class LoopShape {

    static void createRectangle(int width, int height) {
        for (int a = 0; a < height; a++) {
            for (int b = 0; b < width; b++) {
                if (a == 0 || a == height-1 || b == 0 || b == width-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
        System.out.println();
    }
    static void createTriangle(int leg){
        for (int a = 0; a<leg; a++) {
        for (int b = 0; b<=a; b++) {

            if(b == 0 || b == a || a == leg-1) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }  System.out.print("\n");
        }
        System.out.println();
    }
}
