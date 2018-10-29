package model;

import lombok.Getter;
import lombok.Setter;
import util.Util;
import view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
public class Model {

    public Model() {
    }

    public HashMap<Integer, Integer> countNumber(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : list) {
            if (map.containsKey(i)) {
                int j = map.get(i) + 1;
                map.put(i, j);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }

    public ArrayList<Integer> createList(int size) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10) - 5);
        }
        View.showList(list);
        return list;
    }

    public int inputSize() {
        Scanner sc = new Scanner(System.in);
        View.showMesege(Util.INPUT_ARRAY_SIZE);
        while (!sc.hasNextInt()) {
            View.showMesege(Util.INCORRECT_INPUT);
            sc.next();
        }
        return sc.nextInt();
    }
}
