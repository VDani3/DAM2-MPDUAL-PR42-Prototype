public class Nevera extends Electrodomestic {
    public int frigories;
    public String soroll;

    public Nevera(){};

    public Nevera(Nevera target){
        super(target);
        if (target != null){
            this.frigories = target.frigories;
            this.soroll = target.soroll;
        }
    }

    @Override
    public Electrodomestic clone() {
       return new Nevera(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !(object2 instanceof Nevera)) return false;
        Nevera cast2 = (Nevera) object2;
        return cast2.nom.equals(nom) && cast2.color.equals(color) && cast2.preu == preu && cast2.marca.equals(marca) && cast2.eficiencia.equals(eficiencia) && cast2.frigories == frigories && cast2.soroll.equals(soroll);
    }
    
}
