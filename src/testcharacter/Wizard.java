package testcharacter;

public class Wizard extends Character
{   Dice dice = new Dice();
    int maxmagic,currentmagic;

    public Wizard(String n, int s, int d, int i, int m_magic, int c_magic)
    {
        super(n, s, d, i);
        this.maxmagic = m_magic;
        this.currentmagic = c_magic;
        maxmagic = (dice.roll() + 20);
        currentmagic = maxmagic;
    }

    // G&S for maxmagic
    public void setMaxmagic(int maxmagic) {
        this.maxmagic = maxmagic;
    }
    public int getMaxmagic() {
        return maxmagic;
    }

    //G&S for currentmagic
    public void setCurrentmagic(int currentmagic) {
        this.currentmagic = currentmagic;
    }
    public int getCurrentmagic() {
        return currentmagic;
    }


    public int castLightningBolt()
    {
        Dice dice = new Dice();
        if(currentmagic > 10)
        {
            damage = dice.roll() * 2;
            currentLife -= damage;
            currentmagic -= 10;
        }
        else
            System.out.println("MAGIC TOO LOW!!!");
        return damage;
    }

    public int magicHeal()
    {
        if(currentLife < 10 && currentmagic >= 5)
        {
            currentLife += dice.roll();
            currentmagic -= 5;
        }
        if(currentmagic <= 5){
            System.out.println("MAGIC TOO LOW!!!");
        }
        return currentLife;
        
    }
}