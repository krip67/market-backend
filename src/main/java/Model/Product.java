package Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;
    @OneToMany (mappedBy="product", fetch=FetchType.EAGER)
    private List<Photo> images;
    @ManyToMany
    private List<Order> orders;
}
