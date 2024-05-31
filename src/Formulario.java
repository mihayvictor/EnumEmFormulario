public class Formulario {
enum Genero{
    Feminino('F'), Masculino('M');
private char valor;

Genero(char valor){
    this.valor = valor;
    }
}
    private String nome;
    private Genero genero;

    public Formulario(String nome, Formulario.Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Formulario [Nome = " + nome + ", Gênero = " + genero + "]";
    }
    
}
