import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int array[][] = {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 }
        };
        for (int i = 0, j = 4; i < 5 & j >= 0; i++, j--) {
            System.out.println(array[i][j]);
        }

    }
}
