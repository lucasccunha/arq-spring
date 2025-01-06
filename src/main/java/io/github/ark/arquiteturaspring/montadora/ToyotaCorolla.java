package io.github.ark.arquiteturaspring.montadora;

import java.awt.*;

public class ToyotaCorolla extends Carro {
    public ToyotaCorolla(Motor motor) {
        super(motor);
        setModelo("Corolla Hybrid");
        setCor(Color.WHITE);
        setMontadora(Montadora.TOYOTA);
    }
}
