package teht2abstractfactory;

public class JavaCoder {
    private Hat hat;
    private Shirt shirt;
    private Pants pants;
    private Shoes shoes;
    public JavaCoder() {

    }

    public void getDressed(Hat hat, Shirt shirt, Pants pants, Shoes shoes) {
        this.hat = hat;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public String outFit() {
        return "Mun outfit:\n"+ hat.toString() + "\n" + shirt.toString() + "\n" +
                pants.toString() + "\n" + shoes.toString();
    }
}
