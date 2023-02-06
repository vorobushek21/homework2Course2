import transport.Car;
import transport.Bus;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                "механика", "седан", "т333тт92", 5, true, null, 120);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат",
                "универсал", "у999уу99", 0, true, new Car.Key(false,true), 300);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "механика", "родстер", "к888кк88", 2, false, null, 0);
        Car car4 = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея",
                "автомат", "внедорожник", "т444тт44", 5, true, new Car.Key(true,true), 220);
        Car car5 = new Car("Hyundai", "Avante", 1.6, " оранжевый", 2016, "Южная Корея",
                "автомат", "седан", "н555нн66", 5, true, new Car.Key(true,false), -50);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Car car6 = new Car("BMW", "5", 3.0, "красный", 2022, "Германия",
                "автомат", "седан", null, 5, false, null, 0) ;

        car6.changeTires(5);
        System.out.println(car6);
        System.out.println();


        Bus bus1 = new Bus("Hyundai", "County", 2010, "Южная Корея", "пурпурный", 80);
        System.out.println(bus1);
        Bus bus2 = new Bus("", "", 1970, "США", "черный", 320);
        System.out.println(bus2);
        Bus bus3= new Bus("Hyundai", "H350", 2015, "Германия", "красный", 120);
        System.out.println(bus3);
    }
}