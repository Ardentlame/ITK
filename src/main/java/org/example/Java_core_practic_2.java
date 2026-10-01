package org.example;

import java.util.HashMap;
import java.util.Map;

//Java core практика - Частотный анализ
public class Java_core_practic_2 {

    static <T> Map<T, Integer> getElemsInMap(T[] array) {
        Map<T, Integer> result = new HashMap<>();
        for (T element : array) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }
}
