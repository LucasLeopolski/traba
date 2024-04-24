package br.unipar.programacaointernet.servicecep.api_venda_pdv.model;

@Entity
@Getter
@Setter

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(length = 120 ) // limitando o tamanho
    private String descricao;
}
