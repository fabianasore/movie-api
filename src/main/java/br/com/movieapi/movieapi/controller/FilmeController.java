package br.com.movieapi.movieapi.controller;

import br.com.movieapi.movieapi.model.Filme;
import br.com.movieapi.movieapi.repository.FilmeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeRepository filmeRepository;

    public FilmeController(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    @GetMapping
    public Page<Filme> listar(Pageable pageable) {
        return filmeRepository.findAll(pageable);
    }
}
