package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author <a href="mailto:alexnail@gmail.com">Alexander Fridman</a>
 * Date: 6/26/18
 * Time: 11:22 PM
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
