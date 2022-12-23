import java.util.*;

public class Main {
    public static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        TelephoneDirectory td = new TelephoneDirectory();
        td.add("Начальник", "89327563809");
        td.add("Леха торчит 1000", "89046768832");
        td.add("Коля НЕ БРАТЬ", "89327325709");
        td.add("Бухгалтер", "89074523462");
        td.add("Автосервис", "89323263807");
        td.add("Автосервис2", "89327563810");
        td.add("Автосервис3", "89327563811");
        td.add("Зам", "89325809809");
        td.add("Секретарь", "89280932378");
        td.add("Жилец", "89327556709");
        td.add("Нежилец", "89427856709");
        td.add("Доставка", "89017546363");
        td.add("Сантехник", "89307556809");
        td.add("Водитель", "89235671835");
        td.add("Ремонт", "89637109380");
        td.add("Шаурма", "89813096890");
        td.add("Вет клин", "89981372800");
        td.add("Врач", "89327563756");
        td.add("Прокурор", "89327563863");
        td.add("Мафия", "89327563275");
        td.print();

        for (int i=0; i < 10; i++){
            map.put(String.valueOf(i), i);
        }
        System.out.println(map);
        tryPut("10",10);
        System.out.println(map);
        tryPut("10",11);
        System.out.println(map);

        Random random = new Random();
        Map<String, List<Integer>> mapTask2_1 = new HashMap<>();
        int mapSize = 5;
        int listSize = 3;
        for (int i = 0; i < mapSize; i++) {
            List<Integer> numbers = new ArrayList<>(listSize);
            for (int j = 0; j < listSize; j++) {
                numbers.add(random.nextInt(1000));
            }
            mapTask2_1.put(String.valueOf(i), numbers);
        }
        System.out.println(mapTask2_1);

        Map<String, Integer> transformMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry: mapTask2_1.entrySet()){
            int sum = 0;
            List<Integer> numbers = entry.getValue();
            for (int number : numbers){
                sum += number;
            }
            transformMap.put(entry.getKey(), sum);
        }
            System.out.println(transformMap);

        Map<Integer, String> mapTask2_2 = new LinkedHashMap<>();
        mapTask2_2.put(3, "30");
        mapTask2_2.put(33, "31");
        mapTask2_2.put(45, "32");
        mapTask2_2.put(-3, "33");
        mapTask2_2.put(563, "34");
        mapTask2_2.put(123, "35");
        mapTask2_2.put(783, "36");
        mapTask2_2.put(-983, "37");
        mapTask2_2.put(1233, "38");
        mapTask2_2.put(333, "39");
        System.out.println(mapTask2_2);
    }
    private static void tryPut(String key, int value){
        if (map.containsKey(key) && map.get(key).equals(value)){
            throw new IllegalArgumentException("Такая запись уже есть");
        }
        map.put(key, value);
    }
}