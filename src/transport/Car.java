package transport;
public class Car {
    public static class Key{
        private  final boolean remoteStartEngine;
        private final boolean openDoorNotKey;

        public Key(boolean remoteStartEngine, boolean openDoorNotKey) {
            this.remoteStartEngine = remoteStartEngine;
            this.openDoorNotKey = openDoorNotKey;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isOpenDoorNotKey() {
            return openDoorNotKey;
        }

        @Override
        public String toString() {
            return (remoteStartEngine?"Удаленный запуск двигателя":"Без удаленного запуска двигателя") + ", " + (openDoorNotKey?"Бесключевой доступ":"Доступ с помощью ключа");
        }
    }
    private Key key;
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String seasonTires;
    private int currentMonth;
    private boolean seasonTiresTest() {
        if (currentMonth >= 3 && currentMonth <= 10) {
            seasonTires = "Летняя резина";
        } else {
            seasonTires = "Зимняя резина";
        }
        return true;
    }
    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, int currentMonth, String seasonTires, Key key) {
        this.brand = brand == null  ? "default" : brand;
        this.model = model == null  || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? engineVolume : 1.5;
        this.color = color == null || color.isEmpty() ? "Белый" : color;
        this.year = year <= 0 ? year : 2000;
        this.country = country == null  || country.isEmpty() ? "default" : country;
        this.transmission = transmission == null  || transmission.isEmpty() ? "default" : transmission;
        this.bodyType = bodyType == null  || bodyType.isEmpty() ? "default" : bodyType;
        this.registrationNumber = registrationNumber == null  || registrationNumber.isEmpty() ? "default" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? numberOfSeats : 5;
        this.currentMonth = currentMonth;
        this.seasonTires = seasonTires;
        seasonTiresTest();
        this.key = key == null ? new Key(false,false) : key;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getBodyType() {
        return bodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String isSeasonTires() {
        return seasonTires;
    }
    public void setSeasonTires(String seasonTires) {
        this.seasonTires = seasonTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year + " года выпуска, " + " сборка - " + country + ", цвет кузова - " + color + ", объем двтигателя " + engineVolume + ", трансмиссия - " + transmission + ", тип кузова - " + bodyType + ", номерной знак - " + registrationNumber + ", количество мест - " + numberOfSeats + ", сезонность шин - " + seasonTires + ", " + key;
    }
}
