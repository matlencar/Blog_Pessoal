package org.generation.BlogPessoal.blog.repository;

import java.util.List;

import org.generation.BlogPessoal.blog.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);

}
