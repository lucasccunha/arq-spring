package io.github.ark.arquiteturaspring.montadora.configuration;

import io.github.ark.arquiteturaspring.montadora.Motor;
import io.github.ark.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motorAspirado () {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean
    public Motor motorEletrico () {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("1000 Wts");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    @Primary
    public Motor motorTurbo () {
        var motor = new Motor();
        motor.setCavalos(400);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.6);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
