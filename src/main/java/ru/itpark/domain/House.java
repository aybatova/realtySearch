package ru.itpark.domain;

public abstract class House {
    private int id;
    private int area;
    private int price;
    private String district;

    public House(int id, int area, int price, String district) {
        this.id = id;
        this.area = area;
        this.price = price;
        this.district = district;
    }

    public int getPrice() {
        return price;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", area=" + area +
                ", price=" + price +
                ", district='" + district + '\'' +
                '}';
    }
}

