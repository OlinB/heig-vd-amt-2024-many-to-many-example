package entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class House {

    @Id
    public String owner;

    @ManyToMany
    public List<Cat> cats;
}
