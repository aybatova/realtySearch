package ru.itpark.repository;

import ru.itpark.comparator.AscPriceComparator;
import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {

    private List<House> items = new ArrayList<House>();

    public void add(House item) {
        items.add(item);
    }


    public List<House> getAll() {
        return items;
    }



}