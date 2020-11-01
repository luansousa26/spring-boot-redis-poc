package com.luan.spring.redis.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.luan.spring.redis.api.dto.PessoaDTO;

@Service
public class PessoaService {

	public List<PessoaDTO> listarPessoas() {

		System.out.println("Acessando o serviço de listagem de pessoas");

		List<PessoaDTO> listaPessoa = new ArrayList<PessoaDTO>();
		PessoaDTO pessoa = new PessoaDTO();

		pessoa.setId(1L);
		pessoa.setName("Luan Sousa");
		pessoa.setEmail("luan9082@gmail.com");
		pessoa.setAge(45);

		listaPessoa.add(pessoa);

		pessoa = new PessoaDTO();

		pessoa.setId(2L);
		pessoa.setName("Alice Montenegro");
		pessoa.setEmail("ALICE@GMAIL.COM");
		pessoa.setAge(22);

		listaPessoa.add(pessoa);

		pessoa = new PessoaDTO();
		pessoa.setId(3L);
		pessoa.setName("Maarcos Aurelio Montenegro");
		pessoa.setEmail("marrco@GMAIL.COM");
		pessoa.setAge(22);

		listaPessoa.add(pessoa);

		pessoa = new PessoaDTO();
		pessoa.setId(4L);
		pessoa.setName("Jean Sousa");
		pessoa.setEmail("jean@GMAIL.COM");
		pessoa.setAge(22);

		listaPessoa.add(pessoa);

		pessoa = new PessoaDTO();
		pessoa.setId(5L);
		pessoa.setName("Italo mELLO Sousa");
		pessoa.setEmail("Italo@GMAIL.COM");
		pessoa.setAge(77);

		listaPessoa.add(pessoa);

		pessoa = new PessoaDTO();
		pessoa.setId(6L);
		pessoa.setName("Gebedaia Santos martins");
		pessoa.setEmail("Gebedaia@GMAIL.COM");
		pessoa.setAge(12);

		listaPessoa.add(pessoa);

		return listaPessoa;
	}
}
