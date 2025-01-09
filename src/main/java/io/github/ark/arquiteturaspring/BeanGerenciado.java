package io.github.ark.arquiteturaspring;

import io.github.ark.arquiteturaspring.todos.TodoEntity;
import io.github.ark.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }

}
