package hWorke25a;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarDannye>carHashMap=new HashMap<>();
        carHashMap.put(new Car(12,036),new CarDannye(2018,"toyota"
        ,"black",7000));
        carHashMap.put(new Car(15,159),new CarDannye(2015,"nissan"
                ,"blue",4000));

        for (Map.Entry entry:carHashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("---------------");
        }
    }
}
