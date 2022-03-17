package teht2abstractfactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    static Class<?> hatFactory;
    static Class<?> shirtFactory;
    static Class<?> pantsFactory;
    static Class<?> shoesFactory;
    static Method hatFactoryMethod;
    static Method shirtFactoryMethod;
    static Method pantsFactoryMethod;
    static Method shoesFactoryMethod;

    static {
        try {
            hatFactoryMethod = HatFactory.class.getMethod("createHat");
            shirtFactoryMethod = ShirtFactory.class.getMethod("createShirt");
            pantsFactoryMethod = PantsFactory.class.getMethod("createPants");
            shoesFactoryMethod = ShoesFactory.class.getMethod("createShoes");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        setBrand(brands.Adidas);
        JavaCoder jasper = new JavaCoder();
        dressUp(jasper);
        System.out.println(jasper.outFit());
        System.out.println("Menin töihin...");
        setBrand(brands.Boss);
        dressUp(jasper);
        System.out.println(jasper.outFit());
    }

    public enum brands {
        Adidas,
        Boss
    }

    public static void setBrand(brands brand) throws ClassNotFoundException {
        hatFactory = Class.forName("teht2abstractfactory." + brand + "HatFactory");
        shirtFactory = Class.forName("teht2abstractfactory." + brand + "ShirtFactory");
        pantsFactory = Class.forName("teht2abstractfactory." + brand + "PantsFactory");
        shoesFactory = Class.forName("teht2abstractfactory." + brand + "ShoesFactory");
    }

    public static void dressUp(JavaCoder j) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        j.getDressed((Hat) hatFactoryMethod.invoke(hatFactory.getDeclaredConstructor().newInstance()), ((Shirt) shirtFactoryMethod.invoke(shirtFactory.getDeclaredConstructor().newInstance())),
                ((Pants) pantsFactoryMethod.invoke(pantsFactory.getDeclaredConstructor().newInstance())), ((Shoes) shoesFactoryMethod.invoke(shoesFactory.getDeclaredConstructor().newInstance())));
    }
}
