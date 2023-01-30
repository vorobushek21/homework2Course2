public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        cars[2] = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        cars[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        cars[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        listOfAllCar(cars);

        Car car6 = new Car(null, null, 0, null, 0, null);
        System.out.println(car6);
    }
    public static void listOfAllCar(Car[] cars) {
        int emp = 0;
        for (int i = 0; i < cars.length; i++) {
            emp = emp + cars.length;
            System.out.println(cars[i].toString());
        }
    }
}