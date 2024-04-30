import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Maça", 1.47);
        map.put("Banana", 2.50);
        map.put("Abacaxi", 5.35);

        System.out.println(map);
    }
}