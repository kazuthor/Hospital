
public class Hospital {
        Paciente paciente1;
        Paciente paciente2;
        Paciente paciente3;
        Anamnesis anamnesis;
        
        
    public static void main(String[] args) {
        Paciente paciente1=new Paciente("37391391", "Claudia", "F",15,89.9,1.80);
        Paciente paciente2=new Paciente("37391392", "Luis", "M",20,69.9,1.70);
        Paciente paciente3=new Paciente("37391392", "Miguel", "M",13,79.9,1.78);
        Anamnesis anamnesis = new Anamnesis("Tos","Diabetes", paciente1);
       
        
        
        mostrarCantidadPacientes();
        mostrarCantidadxGenero();
        paciente1.verificarAgeRank();
        paciente1.calculateIMC();
        
        
    }
 
    public static void mostrarCantidadPacientes(){
    System.out.println("numero de pacientes  "+Paciente.numPacientes);
    }
    
    public static void mostrarCantidadxGenero(){
        System.out.println("Cantidad de mujeres atendidas " +Paciente.mujeres);
        System.out.println("Cantidad de hombres atendidos " +Paciente.hombres);
    
    }
}
