package The.bad.boys.Ademicom.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name ="consultor")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consultor {
    @Id
    @GeneratedValue
    private UUID id;
    private String Nome;
    private String Email;

    @ManyToOne //Faz a relação, de muitos para um
    @JoinColumn(name = "Id_gestor")
    private Gestor gestor;
}
