package entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;


@Entity
public class Cat {

    @Id
    public String name;

    @ManyToMany
    public List<House> housees;

}
