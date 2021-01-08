public class GameCharacter {
    private String name;
    private int energy;
    private int attack;
    private int defense;

    public GameCharacter(String name, int energy, int baseHit, int def) {
        this.name = name;
        this.energy = energy;
        this.attack = baseHit;
        this.defense = def;
    }

    double totalAttack(){
            return attack;
    }
    double totalDefense(){
        return defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
