package compares;

public class Product implements Comparable<Product>{
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Product o) {
        int resTitle = this.getTitle().compareTo(o.getTitle());
        if (resTitle < 0) return 1;
        else if (resTitle > 0) return -1;
        else {
            int resSalary = this.getPrice() - o.getPrice();
            if (resSalary < 0) return 1;
            else if (resSalary > 0) return -1;
            else return 0;
        }
    }
}
