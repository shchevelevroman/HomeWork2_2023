import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta",1.7,"Желтый",2015,"Россия","МКПП","Седан", "A111AA134",5,5,"", null);
        System.out.println(car1);

        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия","АКПП", "седан", "В222ВВ147", 5,2,"", new Car.Key(true,false));
        System.out.println(car2);

        Car car3 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия", "АКПП","хэтчбек", "С333СС147", 5, 1,"", new Car.Key(true,true));
        System.out.println(car3);

        Car car4 = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея", "АКПП", "Кроссовер", "У777УУ147", 5, 7,"", new Car.Key(false,false));
        System.out.println(car4);

        Car car5 = new Car("Hyundai", "Avante",1.6,"Оранжевый",2016,"Южная Корея", "АКПП", "седан", "К555КК147", 5,12,"", new Car.Key(false,true));
        System.out.println(car5);
    }
}