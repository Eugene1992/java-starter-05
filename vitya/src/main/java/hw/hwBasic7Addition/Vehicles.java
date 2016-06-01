package hw.hwBasic7Addition;

/**
 * Created by User on 31.05.2016.
 */

//Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
//целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
//строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
//строку с названием экземпляра, цветом и  стоимостью автомобиля.

public enum Vehicles {
    FORD(2500),PORCHE(5000);
    private int price;

    Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        return "Green";
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "price=" + price + getColor() +
                '}';
    }
}
