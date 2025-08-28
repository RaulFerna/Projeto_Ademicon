package The.bad.boys.Ademicom.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Table(name = "cliente")
@Entity
@Setter
@Getter
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construttor com argumentos
public class Cliente {
    @Id
    @GeneratedValue
    private UUID id;

    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Nome_responsavel;
}
