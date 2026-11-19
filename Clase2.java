public class Clase2 {
    public static void main(String[] args) {
        
        MiClase persona = new MiClase("Ana", 28, true);
        persona.saludar();
        persona.setEdad(29);
        System.out.println(persona);
    }
}