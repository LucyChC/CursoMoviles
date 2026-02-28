public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca(),
            new Animal()
        };

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}