import java.util.*;

class s1 {
    public static void main(String[] args) {
        int[] list = new int[] { 3, 142, 41, 18, -5, 1209, 2222, 64, 53, 300 };
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                odd.add(list[i]);
            }
        }
        System.out.println(odd);
    }
}