package io.github.cleitonleite.localizacao.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_cidade")
@Data
public class Cidade {

    @Id
    @Column(name = "id_cidade")
    private Long id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "qtd_habitantes")
    private long habitantes;
}