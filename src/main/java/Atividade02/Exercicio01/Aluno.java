package Atividade02.Exercicio01;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 26/08/25
 */
public class Aluno {

    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(final String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "nome='" + nome + '\'' +
               ", matricula='" + matricula + '\'' +
               ", curso='" + curso + '\'' +
               '}';
    }
}
