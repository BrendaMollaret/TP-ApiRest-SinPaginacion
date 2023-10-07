package ApiRest.TP.Repository;

import ApiRest.TP.Entity.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
