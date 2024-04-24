package br.unipar.programacaointernet.servicecep.api_venda_pdv.repository;

public class ProdutoRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Produto> listar(){
        String jpql = "SELECT l FROM Produto l";
        return em.createQuery(jpql, Produto.class).getResultList();

    }

    public void cadastrar(Produto produto) throws Exception {

        try {
            em.persist(produto);
        }catch (Exception ex) {

            throw  new Exception("Produto não pode ser cadastrado");
        }
    }
}
