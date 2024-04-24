package br.unipar.programacaointernet.servicecep.api_venda_pdv.service;

import jakarta.inject.Inject;

@Stateless
public class ClienteService {

    @Inject
    private ClienteRepository clienteRepository;
    public List<Cliente> listarClientes(){return  clienteRepository.listar();
    }

    public void cadastrar (Cliente cliente) throws Exception {
        clienteRepository.cadastrar(cliente);
    }
}
