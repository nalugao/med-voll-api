package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
    public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public Medico cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        return repository.save(new Medico(dados));
    }
    // Spring, se chegar uma requisição do tipo Post, para url /medicos, é para voce chamar o metodo cadastrar() da classe MedicoController


}
