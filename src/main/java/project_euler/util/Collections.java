package project_euler.util;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections {
    public static <T> List<T> subList(List<T> list, int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    public static <T> List<T> sort(List<T> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static <T> List<T> append(List<T> list, T number) {
        List<T> newList = new ArrayList<>(list);
        newList.add(number);
        return newList;
    }

    public static <T> List<T> append(T number, List<T> list) {
        List<T> newList = new ArrayList<>(list);
        newList.add(0, number);
        return newList;
    }
}
