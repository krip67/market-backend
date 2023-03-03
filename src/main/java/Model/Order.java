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
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToMany
    @JoinTable (name="orders_products",
            joinColumns=@JoinColumn (name="order_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    private List<Product> products;
}
