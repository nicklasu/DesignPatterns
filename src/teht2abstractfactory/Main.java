package teht2abstractfactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method hatFactoryMethod = HatFactory.class.getMethod("createHat");
        Method shirtFactoryMethod = ShirtFactory.class.getMethod("createShirt");
        Method pantsFactoryMethod = PantsFactory.class.getMethod("createPants");
        Method shoesFactoryMethod = ShoesFactory.class.getMethod("createShoes");
        JavaCoder jasper = new JavaCoder();
        jasper.getDressed((Hat) hatFactoryMethod.invoke(new AdidasHatFactory()), ((Shirt) shirtFactoryMethod.invoke(new AdidasShirtFactory())),
                ((Pants) pantsFactoryMethod.invoke(new AdidasPantsFactory())), ((Shoes) shoesFactoryMethod.invoke(new AdidasShoesFactory())));
        System.out.println(jasper.outFit());
        System.out.println("Menin töihin...");
        jasper.getDressed((Hat) hatFactoryMethod.invoke(new BossHatFactory()), ((Shirt) shirtFactoryMethod.invoke(new BossShirtFactory())),
                ((Pants) pantsFactoryMethod.invoke(new BossPantsFactory())), ((Shoes) shoesFactoryMethod.invoke(new BossShoesFactory())));
        System.out.println(jasper.outFit());
    }
}
