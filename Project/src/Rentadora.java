public class Rentadora extends Electrodomestic {
    public String revolucions;
    public String soroll;

    public Rentadora() {}

    public Rentadora(Rentadora target) {
        super(target);
        if (target != null) {
            this.revolucions = target.revolucions;
            this.soroll = target.soroll;
        }
    }
    
    @Override
    public Electrodomestic clone() {
        return new Rentadora(this);
    }
    
}
