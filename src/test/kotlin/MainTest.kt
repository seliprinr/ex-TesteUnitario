import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testPortaria() {
    Assertions.assertEquals(portaria(idade = 15, tpConvite = "", cod = ""), actual = "Negado.")
    }

}