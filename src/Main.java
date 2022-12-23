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
        Map<String, List<Integer>> map2 = new HashMap<>();
        int mapSize = 5;
        int listSize = 3;
        for (int i = 0; i < mapSize; i++) {
            List<Integer> numbers = new ArrayList<>(listSize);
            for (int j = 0; j < listSize; j++) {
                numbers.add(random.nextInt(1000));
            }
            map2.put(String.valueOf(i), numbers);
        }
        System.out.println(map2);

        Map<String, Integer> transformMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry: map2.entrySet()){
            int sum = 0;
            List<Integer> numbers = entry.getValue();
            for (int number : numbers){
                sum += number;
            }
            transformMap.put(entry.getKey(), sum);
        }
            System.out.println(transformMap);
    }
    private static void tryPut(String key, int value){
        if (map.containsKey(key) && map.get(key).equals(value)){
            throw new IllegalArgumentException("Такая запись уже есть");
        }
        map.put(key, value);
    }
}