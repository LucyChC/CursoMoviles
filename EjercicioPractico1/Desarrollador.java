public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String nombre, double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public double calcularSalario() {
        return salarioBase; 
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lenguaje principal: " + lenguajePrincipal);
    }
}