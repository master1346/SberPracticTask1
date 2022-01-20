package org.example;

import java.util.List;

import static org.example.CityUtils.*;

public class App
{
    public static void main(String[] args ){

        List<City> list1 = parse();
        sortByNameV1(list1);
         print(list1);

        List<City> list2 = parse();
        sortByDistrictAndName(list2);

        System.out.println("\n \n Collection2 \n");
        print(list2);
    }


}
