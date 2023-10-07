package ApiRest.TP.Controller;

import ApiRest.TP.Entity.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable> {
    //Trae todos
    public ResponseEntity<?> getAll();

    //Trae uno particular
    public ResponseEntity<?> getOne(@PathVariable ID id);

    //Guarda
    public ResponseEntity<?> save(@RequestBody E entity);

    //Actualiza
    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity);

    //Elimina
    public ResponseEntity<?> delete(@PathVariable ID id);

}
