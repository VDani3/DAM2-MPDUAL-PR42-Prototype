import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

        Forn forn = new Forn();
        forn.nom = "Fornet";
        forn.autoneteja = true;
        forn.color = "raimbow";
        forn.eficiencia = "A+";
        forn.marca = "Bosh";
        forn.preu = 777;
        llista.add(forn);

        Forn anotherForn = (Forn) forn.clone();
        llista.add(anotherForn);

        Nevera nevera = new Nevera();
        nevera.nom = "Neveraca";
        nevera.frigories = 55;
        nevera.color = "rosa";
        nevera.eficiencia = "C++";
        nevera.marca = "PepeNeveras";
        nevera.preu = 2209;
        nevera.soroll = "Recorcholis";
        llista.add(nevera);

        Nevera anotherNevera = (Nevera) nevera.clone();
        llista.add(anotherNevera);

        Rentadora rentadora = new Rentadora();
        rentadora.nom = "Renteitor 3000";
        rentadora.revolucions = "Wau";
        rentadora.color = "Magenta";
        rentadora.eficiencia = "C#";
        rentadora.marca = "ContigoPipo";
        rentadora.preu = 55;
        rentadora.soroll = "Rayos y Centellas";
        llista.add(rentadora);

        Rentadora anotherRentadora = (Rentadora) rentadora.clone();
        llista.add(anotherRentadora);

        
        // Clonar la llista
        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els Electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els Electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els Electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els Electrodomestics NO són identics");
            }
        }
    }
}
