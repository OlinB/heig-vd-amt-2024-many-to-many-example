import entites.Cat;
import entites.House;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

public class Main {

    @Inject
    EntityManager em;

    public static void main(String[] args) {

        Main main = new Main();

        Cat cat1 = new Cat();
        cat1.name = "Etoile";
        Cat cat2 = new Cat();
        cat2.name = "Sparkle";


        House house1 = new House();
        house1.owner = "Fred";
        house1.cats.add(cat1);

        House house2 = new House();
        house2.owner = "Bob";
        house2.cats.add(cat1);
        house2.cats.add(cat2);

        System.out.println(house1);
        System.out.println(house2);

        main.em.persist(cat1);
        main.em.persist(cat2);
        main.em.persist(house1);
        main.em.persist(house2);
    }
}
