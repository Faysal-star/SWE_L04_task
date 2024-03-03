package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
    private CityList cityList = new CityList();
    private City city1 = new City("Mirpur", "Dhaka");
    private City city2 = new City("Fulbari", "Khulna");

    @Test
    public void testDelete(){
        cityList.add(city1);
        cityList.add(city2);
        cityList.delete(city1);
        List<City> cities = cityList.getCities();
        assertEquals(1, cities.size());
        assertEquals(city2, cities.get(0));
    }

    @Test
    public void testDeleteException(){
        cityList.add(city1);
        cityList.add(city2);
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(new City("Doulatpur", "Dhaka")));
    }

    @Test
    public void testCount(){
        cityList.add(city1);
        cityList.add(city2);
        assertEquals(2, cityList.count());
    }

    @Test
    public void testSort(){
        cityList.add(city2);
        cityList.add(city1);
        List<City> cities = cityList.getCities();
        assertEquals(city1, cities.get(0));
        assertEquals(city2, cities.get(1));
    }
}