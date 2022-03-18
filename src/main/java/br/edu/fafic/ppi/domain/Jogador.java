package br.edu.fafic.ppi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Jogador")
//@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries({
        @NamedQuery(name = "jogadores", query = "select j from Jogador j"),

})
public class Jogador extends Pessoa {

    private String posicao;
    private String status;

    @ManyToOne
    private Equipe equipe;

    @Override
    public String toString() {
        return "Jogador{" +
                "posicao='" + posicao + '\'' +
                ", status='" + status +
                "} " + super.toString();
    }
}
