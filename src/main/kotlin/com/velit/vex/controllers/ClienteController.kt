package com.velit.vex.controllers

import com.velit.vex.entities.Cliente
import com.velit.vex.services.ClienteService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
class ClienteController(private val clienteService: ClienteService) {
    @GetMapping
    fun index(): List<Cliente> {
        return clienteService.find()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): Cliente {
        return clienteService.findById(id)
    }

    @PostMapping
    fun create(@RequestBody body: Cliente): Cliente {
        return clienteService.create(body)
    }

}