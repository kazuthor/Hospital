
public class Paciente {
    private String name;
    private String dni;
    private Fecha fecha;
    private Ubicacion ubicacion;
    private double weight;
    private String ocupation;
    private String maritalStatus;
    private String address;
    private String eps;
    private String regimen;
    private String religion;
    private String educationLevel;
    private int age;
    private double height;
    private String gener;
    private HeredoFamiliar antecedentesHF;
    private Personales antecedentesP;
    static int numPacientes=0;
    static int mujeres=0;
    static int hombres=0;

    public Paciente() {
    }

    public Paciente(String dni, String name, String gener,int age,double weight, double height) {
        this.dni = dni;
        this.name = name;
        this.gener=gener;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.numPacientes++;
        this.verificarGenero();
        this.verificarAgeRank();
        this.calculateIMC();
      
    }
    
  
    public Paciente(String name, String dni, Fecha fecha, Ubicacion ubicacion, double weight, 
            String ocupation, String maritalStatus, String address, String eps, String regimen, 
            String religion, String educationLevel, int age, double height, String gener) {
        this.name = name;
        this.dni = dni;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.weight = weight;
        this.ocupation = ocupation;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.eps = eps;
        this.regimen = regimen;
        this.religion = religion;
        this.educationLevel = educationLevel;
        this.age = age;
        this.height = height;
        this.gener = gener;
        this.numPacientes++;
        
        
    }

    public Paciente(String name, String dni, Fecha fecha, Ubicacion ubicacion, double weight, String ocupation, 
            String maritalStatus, String address, String eps, String regimen, String religion, String educationLevel, 
            int age, double height, String gener, HeredoFamiliar antecedentesHF, Personales antecedentesP) {
        this.name = name;
        this.dni = dni;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.weight = weight;
        this.ocupation = ocupation;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.eps = eps;
        this.regimen = regimen;
        this.religion = religion;
        this.educationLevel = educationLevel;
        this.age = age;
        this.height=height;
        this.gener = gener;
        this.antecedentesHF = antecedentesHF;
        this.antecedentesP = antecedentesP;
        this.numPacientes++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setLocation(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public HeredoFamiliar getAntecedentesHF() {
        return antecedentesHF;
    }

    public void setAntecedentesHF(HeredoFamiliar antecedentesHF) {
        this.antecedentesHF = antecedentesHF;
    }

    public Personales getAntecedentesP() {
        return antecedentesP;
    }

    public void setAntecedentesP(Personales antecedentesP) {
        this.antecedentesP = antecedentesP;
    }
    
    
    public void verificarGenero(){
        
        if (this.getGener()=="F"){
            mujeres++;
        }else {hombres++;}
    }     
    
    public void verificarAgeRank(){
    if (this.getAge()>15&&this.getAge()<25) {
        System.out.println("El paciente : "+this.getName()  + "  está en el rango de 15-25 años de edad ");
   
        } 
   
    }
    public void calculateIMC(){
    double imc=0.0;
    imc= this.getWeight()/Math.pow(this.getHeight(),2);
    System.out.println("El IMC del paciente es:" +imc);
    
    }
}
