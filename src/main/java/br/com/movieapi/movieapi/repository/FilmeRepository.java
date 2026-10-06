package br.com.movieapi.movieapi.repository;

import br.com.movieapi.movieapi.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}