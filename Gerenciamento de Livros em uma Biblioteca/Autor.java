package biblioteca;

public class Autor {
    // Atributos
    private String autor;
    private String paisAutor;

    // Método construtor da classe
    public Autor(String autor, String paisAutor) {
        this.autor = autor;
        this.paisAutor = paisAutor;
    }

    // Getters e setters da classe
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPaisAutor() {
        return paisAutor;
    }

    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }

    public boolean equalsIgnoreCase(Autor autor2) {
        return false;
    }

    public boolean equalsIgnoreCase(String autor2) {
        return false;
    }

    public Object toLowerCase() {
        return null;
    }

}