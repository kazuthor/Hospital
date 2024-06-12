
public class HeredoFamiliar {
    
    private boolean padreVivo;
    private boolean madreViva;

    public HeredoFamiliar() {
    }

    public HeredoFamiliar(boolean padreVivo, boolean madreViva) {
        this.padreVivo = padreVivo;
        this.madreViva = madreViva;
    }

    public boolean isPadreVivo() {
        return padreVivo;
    }

    public void setPadreVivo(boolean padreVivo) {
        this.padreVivo = padreVivo;
    }

    public boolean isMadreViva() {
        return madreViva;
    }

    public void setMadreViva(boolean madreViva) {
        this.madreViva = madreViva;
    }
    
    
}