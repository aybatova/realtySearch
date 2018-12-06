package ru.itpark;

import ru.itpark.comparator.AscPriceComparator;
import ru.itpark.comparator.DescPriceComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService(
                new HouseRepository()
        );

        service.add(new House(15136, 50, 250, "Ленинский"));
        service.add(new House(77894, 15, 140, "Звениговский"));
        service.add(new House(15645, 45, 360, "Сармановский"));
        service.add(new House(16487, 28, 280, "Ленинский"));
        service.add(new House(02165, 10, 70, "Сармановский"));

        System.out.println(service.getSorted(new AscPriceComparator()));
        System.out.println(service.getSorted(new DescPriceComparator()));

        List<String> districts = new ArrayList<>();
        districts.add("Ленинский");
        districts.add("Сармановский");
        System.out.println(service.findByDistricts(districts));

    }}
