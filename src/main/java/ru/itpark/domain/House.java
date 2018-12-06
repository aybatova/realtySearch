package ru.itpark.domain;

public class House {
    private int id;
    private int area;
    private int price;
    private String district;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", area=" + area +
                ", price=" + price +
                ", district='" + district + '\'' +
                '}';
    }

    public House(int id, int area, int price, String district) {
        this.id = id;
        this.area = area;
        this.price = price;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}

