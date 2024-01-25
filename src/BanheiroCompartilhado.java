public class BanheiroCompartilhado {

    private boolean ocupado;
    private String ocupante;


    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public boolean isOcupado() {
        return ocupado;
    }


    public void setOcupante(String ocupante) {
        this.ocupante = ocupante;
    }
    public String getOcupante() {
        return ocupante;
    }


    public void usarBanheiro(String nome) {
        if (!ocupado) {
            ocupado = true;
            ocupante = nome;
        }
    }

    public void liberarBanheiro(String nome) {
        if (ocupado) {
            ocupado = false;
            ocupante = null;
        }
    }
}
