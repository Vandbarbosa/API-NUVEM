package com.vanessa.api.nuvem.service;

import com.vanessa.api.nuvem.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void deletar(Long id);

}
