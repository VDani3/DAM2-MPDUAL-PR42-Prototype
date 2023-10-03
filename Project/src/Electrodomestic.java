public abstract class Electrodomestic {
    public String nom;
    public String color;
    public int preu;
    public String marca;
    public String eficiencia;

    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.preu = target.preu;
            this.marca = target.marca;
            this.eficiencia = target.eficiencia;
        }
    }

    public abstract Electrodomestic clone(); 

}
