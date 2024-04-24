package br.unipar.programacaointernet.servicecep.api_venda_pdv.controller;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Livro;
import br.unipar.programacaointernet.servicecep.bibliotecaapi.service.LivroService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProdutoController {
    @Inject // serve para instanciar o objeto

    private ProdutService produtService ;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarProdutos() {
        return Response.ok(produtoService.listar()).build();

    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)

    public Response cadastrarProduto(Produto produto) {
        try {
            produtoService.cadastrar(produto);
            return Response.status(201).entity("Produto cadastrado com suceso").build();

        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}
