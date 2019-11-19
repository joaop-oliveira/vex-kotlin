package com.velit.vex.repositories

import com.velit.vex.entities.Cliente
import org.springframework.data.jpa.repository.JpaRepository


interface ClienteRepository : JpaRepository<Cliente, Long>