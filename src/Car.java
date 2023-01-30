public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()){
            model = "default";
        }
        this.model = model;

        if (engineVolume <=0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()){
            color = "белый";
        }
        this.color = color;

        if (year<=0){
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()){
            country = "default";
        }
        this.country = country;

    }
    public String toString() {
        return "Бренд: " + this.brand + ", модель: " + this.model + ", Объем двигателя: " + this.engineVolume + ", цвет: " + this.color + ", год выпуска: " + this.year + ", страна сборки: " + this.country;
    }
}
