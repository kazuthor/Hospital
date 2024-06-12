
public class Anamnesis {
    
    private String motivo;
    private String enfermedadActual;
    private Paciente paciente;

    public Anamnesis() {
    }

    public Anamnesis(String motivo, String enfermedadActual, Paciente paciente) {
        this.motivo = motivo;
        this.enfermedadActual = enfermedadActual;
        this.paciente = paciente;
    }
    
    
  
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
     public int contarPaciente(){
        this.getPaciente();
        int numPacientes=0;
        numPacientes+=1;
        return numPacientes;
    }
   
}
