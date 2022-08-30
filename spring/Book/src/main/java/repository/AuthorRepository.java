package repository;

import org.springframework.data.repository.CrudRepository;

import br.com.Book.model.Autor;

public interface AuthorRepository extends CrudRepository<Autor, Long> {

}
