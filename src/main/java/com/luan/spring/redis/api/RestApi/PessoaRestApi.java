package com.luan.spring.redis.api.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.spring.redis.api.dto.PessoaDTO;
import com.luan.spring.redis.api.service.PessoaService;

@RestController
public class PessoaRestApi {

	@Autowired
	PessoaService service;

	@GetMapping("/pessoas")
	@Cacheable(value = "cache-pessoas")
	public List<PessoaDTO> listarPessoas() {
		return service.listarPessoas();
	}
}
