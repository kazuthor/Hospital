public class Personales {
    private boolean alcohol;
    private boolean tabaco;
    private boolean drogas;
    private boolean infusiones;

    public Personales() {
    }

    public Personales(boolean alcohol, boolean tabaco, boolean drogas, boolean infusiones) {
        this.alcohol = alcohol;
        this.tabaco = tabaco;
        this.drogas = drogas;
        this.infusiones = infusiones;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isTabaco() {
        return tabaco;
    }

    public void setTabaco(boolean tabaco) {
        this.tabaco = tabaco;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public boolean isInfusiones() {
        return infusiones;
    }

    public void setInfusiones(boolean infusiones) {
        this.infusiones = infusiones;
    }
    
    
    
}
