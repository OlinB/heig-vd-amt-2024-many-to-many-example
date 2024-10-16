package resources;

import entites.Cat;
import entites.House;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cats")
public class Main {
    @Inject
    EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public  String crazyStuff() {
        Cat cat1 = new Cat();
        cat1.name = "Etoile";
        Cat cat2 = new Cat();
        cat2.name = "Sparkle";

        House house1 = new House();
        house1.owner = "Fred";

        House house2 = new House();
        house2.owner = "Bob";

        cat2.houses.add(house1);
        cat2.houses.add(house2);
        cat1.houses.add(house1);

        em.persist(cat1);
        em.persist(cat2);
        em.persist(house1);
        em.persist(house2);
        return cat1.name;
    }
}
