import java.util.ArrayList;
import java.util.List;

public class escola {
    private String nome;
    private String endereco;
    private pessoa diretor;
    private List<curso> cursos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(pessoa diretor) {
        this.diretor = diretor;
    }

    public void adicionarCurso(String nome, String descricao) {
        curso curso  = new curso(nome,descricao);
        this.cursos.add(curso);
    }
    public List<curso> listarCurso(){
        return this.cursos;
    }
    public void removerCurso(curso cursos) {
        this.cursos.remove(cursos);
    }

}

