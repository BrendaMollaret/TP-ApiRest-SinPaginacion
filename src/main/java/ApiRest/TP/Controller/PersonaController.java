package ApiRest.TP.Controller;

import ApiRest.TP.Entity.Persona;
import ApiRest.TP.Service.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
