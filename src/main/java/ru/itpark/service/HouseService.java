package ru.itpark.service;

import ru.itpark.comparator.AscPriceComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }


    public void add(House house) {
        repository.add(house);
    }

    public List<House> getAll() {
        return repository.getAll();
    }

    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public List<House> findByDistricts(List<String> districts) {
        List<House> result = new ArrayList<>();

        for (House house : repository.getAll()) {
            String houseDistrict = house.getDistrict();

            if (districts.contains(houseDistrict)) {
                result.add(house);
            }
        }

        result.sort(new AscPriceComparator());
        return result;
    }

    public List<House> findByPrice(int minPrice, int maxPrice) {
        List<House> result = new ArrayList<>();

        for (House house : repository.getAll()) {
            int housePrise = house.getPrice();


            if (housePrise >= minPrice && housePrise<= maxPrice) {
                result.add(house);
            }
        }

        result.sort(new AscPriceComparator());
        return result;
    }

}


