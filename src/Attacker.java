public class Attacker extends GameCharacter{
    private double extraAttack;

    public Attacker(String name, int energy, int attack, int defense, double attackBonus) {
        super(name, energy, attack, defense);
        this.extraAttack = attackBonus;
    }

    @Override
    double totalAttack() {
        return getAttack() + extraAttack * getAttack();
    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(int extraAttack) {
        this.extraAttack = extraAttack;
    }

}
