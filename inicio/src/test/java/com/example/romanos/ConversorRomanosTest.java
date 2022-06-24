package com.example.romanos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.ConversorRomanos;

public class ConversorRomanosTest {

    @Test
    public void deve_converter_o_simbolo_I() {
        // Arrange
        String simbolo = "I";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(1, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_V() {
        // Arrange
        String simbolo = "V";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(5, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_X() {
        // Arrange
        String simbolo = "X";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(10, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_L() {
        // Arrange
        String simbolo = "L";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(50, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_II() {
        // Arrange
        String simbolo = "II";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(2, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_IV() {
        // Arrange
        String simbolo = "IV";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(4, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_VIII() {
        // Arrange
        String simbolo = "VIII";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(8, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_XIV() {
        // Arrange
        String simbolo = "XIV";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(14, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_XX() {
        // Arrange
        String simbolo = "XX";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(20, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_XXX() {
        // Arrange
        String simbolo = "XXX";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(30, valorConvertido);

    }
}
