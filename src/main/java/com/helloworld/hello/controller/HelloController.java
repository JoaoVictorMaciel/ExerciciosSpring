package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {

	@RequestMapping(value = "/mentalidadeEHabilidade")
		@GetMapping
		public String mentalidade() {
		return "- Mentalidade: Persistência;\n"
				+ "- Habilidade: Atenção aos detalhes.";
		}

	@RequestMapping(value = "/mentalidadeEHabilidade")
		@GetMapping
		public String objetivo() {
		return "- Objetivo de aprendizagem: Spring.\r\n";
		}

	}

