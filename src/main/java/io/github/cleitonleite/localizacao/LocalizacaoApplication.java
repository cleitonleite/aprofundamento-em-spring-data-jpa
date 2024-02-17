package io.github.cleitonleite.localizacao;

import io.github.cleitonleite.localizacao.domain.entity.Cidade;
import io.github.cleitonleite.localizacao.domain.repository.CidadeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

	@Autowired
	private CidadeRepository cidadeRepository;

	@Override
	public void run(String... args) throws Exception {
		listarCidadesPorNome();
	}

	void listarCidadesPorNome() {
		cidadeRepository.findByNomeContaining("a").forEach(System.out::println);
	}

	void listarCidadesPorHabitantes() {
		cidadeRepository.findByHabitantes(1488920L).forEach(System.out::println);
	}

	@Transactional
	void salvarCidade() {
		var cidade = new Cidade(1L, "Recife", 1488920L);
		cidadeRepository.save(cidade);
	}

	void listarCidades() {
		cidadeRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}
}
