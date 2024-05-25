import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Contratacao {
    public BigDecimal valor;
    public LocalDate dataContratacao;
    private Pacote pacote;

    public Contratacao (Pacote pacote){
        this.pacote = pacote;
    }
}
