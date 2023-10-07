package ApiRest.TP.Service;

import ApiRest.TP.Repository.AutorRepository;
import ApiRest.TP.Repository.BaseRepository;
import ApiRest.TP.Entity.Autor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
