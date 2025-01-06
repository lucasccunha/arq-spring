package io.github.ark.arquiteturaspring.montadora.api;

import io.github.ark.arquiteturaspring.montadora.CarroStatus;
import io.github.ark.arquiteturaspring.montadora.Chave;
import io.github.ark.arquiteturaspring.montadora.Motor;
import io.github.ark.arquiteturaspring.montadora.ToyotaCorolla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Eletrico
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new ToyotaCorolla(motor);
        return carro.darIgnicao(chave);
    }

}
