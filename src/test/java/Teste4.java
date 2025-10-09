import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Função classificaIdade(int idade) que retorna:
//● “criança” se 0 ≤ idade ≤ 12
//● “adolescente” se 13 ≤ idade ≤ 17
//● “adulto” se 18 ≤ idade ≤ 64
//● “idoso” se ≥ 65
//● erro se idade < 0 ou > 130
public class Teste4 {

    public  static String idade(int x){
        if (x < 0) {
            return "erro";

        }
            // 2. Criança: 0 a 12
            if (x <= 12) {
                return "criança";
            }

            // 3. Adolescente: 13 a 17
            if (x <= 17) {
                return "adolescente";
            }

            // 4. Adulto: 18 a 64
            if (x <= 64) {
                return "adulto";
            }

            // 5. Idoso: 65 a 130
            if (x <= 130) {
                return "idoso";
            }

            // 6. Caso Inválido (Superior): maior que 130
            else {
                return "erro";
            }
        }

    @Test
    public void idadeMenorqueZero() {
        assertEquals("erro", idade((-3)));
    }

    @Test
    public void idadeMenorqueDoze() {
        assertEquals("criança", idade(13));
    }
        @Test
        public void idadeInicioAdolescente() {
            // CORREÇÃO: Testa o limite inferior da faixa "adolescente" (13)
            assertEquals("adolescente", idade(13));
        }

        @Test
        public void idadeInicioAdulto() {
            // Testa o limite inferior da faixa "adulto"
            assertEquals("adulto", idade(18));
        }

        @Test
        public void idadeLimiteAdulto() {
            // Testa o limite superior da faixa "adulto"
            assertEquals("adulto", idade(64));
        }

        @Test
        public void idadeInicioIdoso() {
            // Testa o limite inferior da faixa "idoso"
            assertEquals("idoso", idade(65));
        }

        @Test
        public void idadeLimiteIdoso() {
            // Testa o limite superior da faixa "idoso"
            assertEquals("idoso", idade(130));
        }

        @Test
        public void idadeMaiorqueCentoeTrinta() {
            // Testa o limite inválido superior
            assertEquals("erro", idade(131));
        }
    }

