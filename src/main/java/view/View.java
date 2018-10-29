package view;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class View {
    public static void showMesege(String mesege){
        System.out.println(mesege);
    }
    public static void showMap(HashMap<Integer, Integer> map){
        Set<Integer> keySet = map.keySet();
        for (Integer i: keySet) {
            System.out.println(i + " - " + map.get(i));
        }
    }

    public static void showList(List<Integer> list){
        for (Integer i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
