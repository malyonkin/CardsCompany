package app.БазовыеФункции;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashMap {

    public static void keyValue() {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);
    }

        public static void addKeyValue() {
            HashMap<Integer, String> passportsAndNames = new HashMap<>();

            String lidiaName = passportsAndNames.get(212133);
            System.out.println(lidiaName);
        }

        public static void delKeyValue() {
            HashMap<Integer, String> passportsAndNames = new HashMap<>();

            passportsAndNames.remove(162348);
            System.out.println(passportsAndNames);
        }

        public static void setKeyValue() {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        for(int i=0;i<2;i++) {
            Set<Integer> keys = passportsAndNames.keySet();
            System.out.println("Ключи: " + keys);

            ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
            System.out.println("Значения: " + values);
        }
    }
}
