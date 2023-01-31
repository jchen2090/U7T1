import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        // YOU WILL WRITE MORE CODE HERE
        Cat cat4 = new Cat("John");
        Cat repalcedCat = cats.set(2, cat4);

        System.out.println(cats);
        System.out.println(repalcedCat);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i ++ ) {
            Cat obj = cats.get(i);
            obj.setName(obj.getName().toUpperCase());
        }

        System.out.println(cats);

        cats.add(new Cat ("SAM"));

        System.out.println(cats);
    }
}
