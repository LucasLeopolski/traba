package br.unipar.programacaointernet.servicecep.api_venda_pdv.repository;

public class ClienteRepository {

    @PersistenceContext(unitName = "HibernateMaven")
    private entityManager em;

    public List<Cliente> listar(){
        String jpql = "SELECT l FROM Cliente l";
        return  em.createQuery(jpql, Cliente.class).getResultList();
    }

    public void cadastrar(Cliente cliente) throw Exception{
        try {
            em.persist(cliente);
        }catch (Exception ex){
            throw new Exception("Cliente não pode ser cadastrado!");

        }

    }
}
