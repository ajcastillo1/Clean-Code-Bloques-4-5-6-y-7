/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.cleancode2anthony.Figura;
import com.mycompany.cleancode2anthony.Triangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnom
 */
public class tests {
    
@Test
    public void testCalcularAreaTriangulo() {
        Triangulo triangulo = new Triangulo("Triángulo", "Rojo", 5.0, 8.0);
        assertEquals(20.0, triangulo.calcularArea());
    }

    @Test
    public void testGettersSettersFigura() {
        Figura figura = new Figura("Cuadrado", "Azul");

        assertEquals("Cuadrado", figura.getNombre());
        assertEquals("Azul", figura.getColor());

        figura.setNombre("Rectángulo");
        figura.setColor("Verde");

        assertEquals("Rectángulo", figura.getNombre());
        assertEquals("Verde", figura.getColor());
    }

    @Test
    public void testGettersSettersTriangulo() {
        Triangulo triangulo = new Triangulo("Triángulo", "Rojo", 5.0, 8.0);

        assertEquals("Triángulo", triangulo.getNombre());
        assertEquals("Rojo", triangulo.getColor());
        assertEquals(5.0, triangulo.getBase());
        assertEquals(8.0, triangulo.getAltura());

        triangulo.setBase(6.0);
        triangulo.setAltura(10.0);

        assertEquals(6.0, triangulo.getBase());
        assertEquals(10.0, triangulo.getAltura());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
