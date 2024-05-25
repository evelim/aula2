
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    public String nome;
    public Date dataNascimento;
    public List<Contratacao> contratacao;

    public Cliente()
    {
        this.contratacao = new ArrayList<Contratacao>();
    }
}
