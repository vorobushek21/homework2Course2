package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int quantityOfSeats;
    private boolean summerTires;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int quantityOfSeats, boolean summerTires, Key key){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = year <= 0 ? 2000 : year;
        this.country = (country == null || country.isEmpty()) ? "default" : country;
        setTransmission(transmission);
        this.bodyType = (bodyType == null || bodyType.isEmpty()) ? "седан" : bodyType;
        setRegistrationNumber(registrationNumber);
        this.quantityOfSeats = quantityOfSeats <=0 ? 2 : quantityOfSeats;
        this.summerTires = summerTires;
        setKey(key);
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

    public String getCarBody() {
        return bodyType;
    }

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? "белый" : color;
    }

    public Key getKey() {
        return key;
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isEmpty()) ? "автомат" : transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber ==null || registrationNumber.isEmpty() ? "а000аа00" : registrationNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setKey(Key key) {
        if (key == null){
            key = new Key(false,false);
        }
        this.key = key;

    }
    public void changeTires(int month){
        if ( month == 12 || (month <=2 && month>0)){
            summerTires = false;
        }
        if (month>2 && month<12){
            summerTires = true;
        }
    }
    public String toString(){
        return "Бренд " + brand + ", модель " + model + ", объем двигателя " + engineVolume + " л, цвет " +
                color + ", сборка в " + year + " году в стране "+ country + ", коробка передач " + transmission + ", тип кузова "
                + bodyType + ", регистрационный номер " + registrationNumber + ", количество мест " + quantityOfSeats + ", шины " +
                (summerTires? "летние" : "зимние")  + ", ключ - "+ key;
    }
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "удаленный запуск двигателя" : "без удаленного запуска двигателя") + ", " +
                    (keylessAccess ? "бесключевой доступ" : "бесключевой доступ отсутствует");
        }
    }
}
