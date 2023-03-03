package Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private UUID uuid;
    private String firstName;
    private String LastName;
    private String email;
    @OneToMany (mappedBy="user", fetch=FetchType.EAGER)
    private List<Order> orders;


}
