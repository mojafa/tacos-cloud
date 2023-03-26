package mo.jafa.tacocloud;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

}