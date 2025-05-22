import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (Integer element : list) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(numbers);
        System.out.println(result); // Вывод: {1=2, 3=1, 4=2, 5=2}
    }
}