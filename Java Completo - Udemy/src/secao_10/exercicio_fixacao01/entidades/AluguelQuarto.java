package secao_10.exercicio_fixacao01.entidades;

public class AluguelQuarto {
    private String nome;
    private String email;

    public AluguelQuarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return  nome
                + ", "
                + email;
    }
}
