package com.DevGatitos.Gatolandia.Domain.entities.Gato;

import com.DevGatitos.Gatolandia.Domain.entities.User.FUser;
import com.DevGatitos.Gatolandia.Domain.entities.User.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesGato {
    @Test
    public void testecadastrogato(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Gato("Leo", "Siames", 0.9f, 0.3f, "Quietinho", "Resgatado em uma chuva forte sozinho perto da ong"));
    }
    @Test
    public void testecadastrogente(){
        FUser f = new FUser();
        User user =f.fillUser("12345678901", "dwadwa", "fawedadw", "dwadwad");

        Assertions.assertEquals("fawedadw", user.getEmail());

        user = f.includeAdress("03817170", "fundos", "Vila Ana", "São Paulo", "SP");

        Assertions.assertEquals("fundos", user.getEndereco().getComplemento());
    }
}
