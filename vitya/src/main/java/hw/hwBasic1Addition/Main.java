package hw.hwBasic1Addition;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.country = "Ukraine";
        adress.city = "Kiev";
        adress.index = 2232;
        adress.street = "Point street";
        adress.house = 23;
        adress.apartament = 14;

        adress.viewAdress();
    }
}
