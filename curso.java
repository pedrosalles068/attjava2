import java.util.ArrayList;
import java.util.List;

public class curso {
    private String nome;
    private String descricao;
    private List<aluno> alunos = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdescricao() {
        return descricao;
    }
    public void listarAluno(aluno alunos) {
        this.alunos.add(alunos);
        aluno aluno1 = new aluno("213142");
    }
    public List<aluno> getaAlunos() {
        return this.alunos;
    }

}
