package br.unipar.programacaointernet.servicecep.api_venda_pdv.controller;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Livro;
import br.unipar.programacaointernet.servicecep.bibliotecaapi.service.LivroService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/cliente")
public class ClienteController {
    @Inject // serve para instanciar o objeto

    private ClienteService clienteService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarClientes() {
        return Response.ok(clienteService.listar()).build();

    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)

    public Response cadastrarClientes(Cliente cliente) {
        try {
            clienteService.cadastrar(cliente);
            return Response.status(201).entity("Cliente cadastrado com suceso").build();

        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}