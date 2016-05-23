package hw.hw01;

/**
 * Created by YANA on 23.05.2016.
 */
    public class Address {
        int index, house, apartment;
        String contry, city, street;

        public int getIndex(){return index;}
        public void setIndex(int index){this.index=index;}
        public  String getContry(){return contry;}
        public void setContry(String contry){this.contry=contry;}
        public String getCity(){return city;}
        public  void setCity(String city){this.city=city;}
        public String getStreet(){return street;}
        public void setStreet(String street){this.street=street;}
        public int getHouse(){return house;}
        public void setHouse(int house){this.house=house;}
        public int getApartment(){return apartment;}
        public void setApartment(int apartment){this.apartment=apartment;}
        public void viewAddress(){
            System.out.println("Index: "+ index);
            System.out.println("Country: "+ contry);
            System.out.println("City: "+ city);
            System.out.println("Street: "+ street);
            System.out.println("House: "+ house);
            System.out.println("Apartment: "+ apartment);


        }

    }


