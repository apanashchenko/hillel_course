package lec_5;

public class Figures {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        // 2
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        // 3
        for (int i = 1; i < 9; i++) {
            for (int j = 7; j >= 0; j--) {
                if (i > j)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        // 4
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i > j)
                    System.out.print("  ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        // 5
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6){
                    System.out.print("# ");}
                else  {
                    if(j == 0 || j == 6)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
        System.out.println();

        // 6
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6){
                    System.out.print("# ");}
                else  {
                    if(i == j)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 7
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6){
                    System.out.print("# ");}
                else  {
                    if(i == (6 - j))
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 8
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6){
                    System.out.print("# ");}
                else  {
                    if(i == (6 - j) || i == j)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 9
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6){
                    System.out.print("# ");}
                else  {
                    if(i == (6 - j) || i == j || j == 0 || j == 6)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}