package com.velit.vex.services

import com.velit.vex.entities.Cliente
import com.velit.vex.repositories.ClienteRepository
import org.springframework.stereotype.Service

@Service
class ClienteService(private val clienteRepository: ClienteRepository) {
    fun find(): List<Cliente> {
        return clienteRepository.findAll().toList()
    }

    fun findById(id: Long): Cliente {
        return clienteRepository.findById(id).get()
    }

    fun create(cliente: Cliente): Cliente {
        return clienteRepository.save(cliente);
    }

}