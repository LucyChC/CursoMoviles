public class Main {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Luciana", 50000, 15000);
        Empleado dev = new Desarrollador("Luis", 30000, "C++");

        gerente.mostrarInfo();                          
        System.out.println("Salario gerente: " + gerente.calcularSalario());
        System.out.println("-----------------------------");
        dev.mostrarInfo();                              
        System.out.println("Salario desarrollador: " + dev.calcularSalario());

    }
}