package com.velit.vex.entities

import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF
import javax.persistence.*

@Entity
@Table(name = "clientes")
data class Cliente(
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  val id: Long,

  @Column(nullable = false)
  val clif_raz_social: String,

  @Column(nullable = true)
  val clif_fantasia: String,

  @Column(nullable = true)
  @CPF
  val clif_cpf: String,

  @Column(nullable = true)
  @CNPJ
  val clif_cnpj: String
)