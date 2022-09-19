package hWorke25b;

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        ArrayList<City>cityArrayList=new ArrayList<>();
        cityArrayList.add(new City(31,"Bishkek"));
        cityArrayList.add(new City(32,"osh"));
        cityArrayList.add(new City(39,"Karakol"));
        cityArrayList.add(new City(3,"ksjdh"));
        cityArrayList.add(new City(4,"sdhjj"));
        System.out.println(" Spisok gorodov");
        cityArrayList.forEach(System.out::println);
        System.out.println("--------------");
        System.out.println("Posle sortirovki");
        Set<City>citySet=new TreeSet<>();
        for (City i:cityArrayList) {
            if (i.getCod()%2==1){
                citySet.add(i);
            }

        }
        for (City c:citySet) {
            System.out.println(c);
        }



    }
}
