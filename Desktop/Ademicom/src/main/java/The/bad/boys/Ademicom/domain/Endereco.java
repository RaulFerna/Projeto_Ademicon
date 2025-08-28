package The.bad.boys.Ademicom.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "endereco")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue
    private UUID Id;

    private String cidade;
    private String UF;

    @OneToOne
    @JoinColumn(name = "Id_cliente")
    private Cliente cliente;
}
