package org.example;

import java.util.HashMap;
import java.util.Map;

//Java core практика - Частотный анализ
public class Java_core_practic_2 {
    public static void test(){
        Object[] objs = new Object[5];
        objs[0] = 1;
        objs[1] = 2;
        objs[2] = 1;
        objs[3] = "test";
        objs[4] = "test1";
        var map = getElemsInMap(objs);
        map.forEach((o, integer) -> System.out.println("object " + o + ", count " + integer));
    }

    static <T> Map<T, Integer> getElemsInMap(T[] array) {
        Map<T, Integer> result = new HashMap<>();
        for (T element : array) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }
}
