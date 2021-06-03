package testcharacter;

public class Character
{
    public String name;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int maxLife;
    public int currentLife;
    public int damage;

    public Character (String n, int s, int d, int i)
    {
        Dice dice = new Dice();
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        maxLife = (dice.roll()+20);
        currentLife = maxLife;

    }
    public int attack(){
        Dice dice = new Dice();
        int attack = ((dice.roll() + this.strength));
        this.damage = attack;
        return attack;
    }
    public void wound(int damage) {
        Dice dice = new Dice();
        damage = dice.roll();
        currentLife -= damage;
    }
    public void heal(int heal) {
        Dice dice = new Dice();
        heal = dice.roll();
        while (currentLife < maxLife) {
            currentLife += heal;
        }
    }

        public String getName() {
            return name;
        }
        public int getStrength() {
            Dice dice = new Dice();
            return strength / (dice.roll() + 1);
        }
        public int getMaxLife(){
            return maxLife;
        }

        public int getDexterity(){
            Dice dice = new Dice();
            return dice.roll();
        }
        public int getIntellegence(){
            Dice dice = new Dice();
            return dice.roll();
        }
    }