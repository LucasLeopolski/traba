package br.unipar.programacaointernet.servicecep.api_venda_pdv.service;

public class ProdutoService {

    @Inject
    private ProdutoRepositopry produtoRepositopry;
    public List<Produto> listarProdutos(){return  produtoRepositopry.listar();
    }

    public void cadastrar (Produto produto) throws  Exceptiomn {
        produtoRepositopry.cadastrar(produto);
    }
}
