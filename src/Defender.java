public class Defender extends GameCharacter{
    private double extraDefense;

    public Defender(String name, int energy, int attack, int defense, double defBonus) {
        super(name, energy, defense, attack);
        this.extraDefense = defBonus;
    }

    @Override
    double totalDefense() {
        return getDefense() + extraDefense * getDefense();
    }

    public double getExtraDefense() {
        return extraDefense;
    }

    public void setExtraDefense(int extraDefense) {
        this.extraDefense = extraDefense;
    }
}
