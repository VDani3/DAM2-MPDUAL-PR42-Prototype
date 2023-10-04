public class Forn extends Electrodomestic {
    public int temperatura;
    public boolean autoneteja;

    public Forn() {}

    public Forn(Forn target) {
        super(target);
        if (target != null) {
            this.temperatura = target.temperatura;
            this.autoneteja = target.autoneteja;
        }
    }

    @Override
    public Electrodomestic clone() {
        return new Forn(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !(object2 instanceof Forn)) return false;
        Forn cast2 = (Forn) object2;
        return cast2.nom.equals(nom) && cast2.color.equals(color) && cast2.preu == preu && cast2.marca.equals(marca) && cast2.eficiencia.equals(eficiencia) && cast2.temperatura == temperatura && cast2.autoneteja == autoneteja;
    }
    
}
