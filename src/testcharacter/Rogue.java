package testcharacter;

public class Rogue extends Character
{
    int energy;
    public Rogue(String n, int s, int d, int i, int e)
    { super(n,s,d,i);
        Dice dice = new Dice();
        this.energy = e;
        energy += dice.roll() + 15;
    }

    // G&S for energy
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getEnergy() {
        return energy;
    }

    public int castslice()
    { Dice dice = new Dice();
        if(energy >= 10)
        {
            damage = (dice.roll() + 10);
            currentLife -= damage;
            energy -= 10;
        }
        else
            System.out.println("ENERGY TOO LOW!!!");
        return damage;
    }
}
    

