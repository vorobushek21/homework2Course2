package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maximumMovementSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maximumMovementSpeed) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.year = year <= 0 ? 2000 : year;
        this.country = (country == null || country.isEmpty() ? "default" : country);
        setColor(color);
        setMaximumMovementSpeed(maximumMovementSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed <=0 ? 90 : maximumMovementSpeed;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? "пурпурный" : color;
    }

    @Override
    public String toString() {
        return "Марка "+ brand + ", модель " + model + ", цвет " +
                color + ", сборка в " + year + " году в стране "+ country+ ", максимальная скорость " + maximumMovementSpeed;
    }
}
