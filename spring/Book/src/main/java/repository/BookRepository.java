package repository;

import org.springframework.data.repository.CrudRepository;

import br.com.Book.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
