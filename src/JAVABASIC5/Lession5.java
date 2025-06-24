package JAVABASIC5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lession5 {
    //thêm thông tin nhân viên
    static List<String> addInfo(String name, int age, String adress) {
        List<String> addInfo = new ArrayList<>();
        addInfo.add(name);
        addInfo.add(String.valueOf(age));
        addInfo.add(adress);
        return addInfo;
    }

    public static void main(String[] args) {
        //bài tập JavaBasic 4
        System.out.println("=============jAVABASIC4================");
        List<Integer> soChan = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                soChan.add(i);
            }
        }
        for (int value : soChan) {
            System.out.print(value + " ");
        }
        System.out.println("\n=============jAVABASIC5================");
        System.out.println("=============In thông tin nhân viên======================");
        List<String> emmInfo = addInfo("Mai", 25, "Đà Lạt");
        for (String value : emmInfo) {
            System.out.println(value);
        }

    }


}



