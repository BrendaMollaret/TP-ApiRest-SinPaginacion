package ApiRest.TP.Repository;

import ApiRest.TP.Entity.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
