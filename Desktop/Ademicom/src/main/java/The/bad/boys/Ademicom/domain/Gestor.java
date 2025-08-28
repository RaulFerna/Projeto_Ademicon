package The.bad.boys.Ademicom.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name ="gestor")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Gestor {
    @Id
    @GeneratedValue
    private UUID Id;
    private String Nome;
    private String email;

    @OneToMany
    @JoinColumn(name = "Id_consultor")
    private List<Consultor> consultor;
}
