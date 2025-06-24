package JAVABASIC4;

public class FOR_ARRAY {
    public static void main(String[] args) {
        int soChan[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                soChan[i] = i;
                index++;
            }
        }
        for (int i : soChan) {
            System.out.print(i + " ");
        }

    }

    {

    }


}
