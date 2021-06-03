package testcharacter;
import java.util.Scanner;

    
public class CharacterDuel 
{

public static String name;
    public static void main(String[] args)
    {

        Dice dice = new Dice();

        //Scanner and other variavles needed for maintaining order in the code.
        Scanner in = new Scanner(System.in);
        int i;
        String name = "";

        //Fighter Objects
        Character Bob = new Character("Bob", dice.roll(), dice.roll(), dice.roll());
        Wizard    Joe = new Wizard("Joe", dice.roll(), dice.roll(), dice.roll(), dice.roll(), dice.roll());
        Rogue    Adam = new Rogue("Adam", dice.roll(),dice.roll(),dice.roll(),dice.roll());

        //Get ready bois
        System.out.println("____________________RPG_____________________");

        //Round Counter
        for(i = 1; i <= 3; i++)
        {
            System.out.println("________________________________FIGHT________________________________");
            System.out.println("\t Round " + i);

            if(i >= 0)
            {
                System.out.println(Bob.getName() +"'s" + " HP: " + Bob.currentLife);
                System.out.println(Joe.getName() +"'s" + " HP: " + Joe.currentLife);
                System.out.println(Adam.getName() +"'s" + " HP: " + Adam.currentLife);
            }

            if(Bob.currentLife > 0) //    LOGIC FOR WHEN Bob IS ATTACKING IN HIS TURN. . .
            {
                System.out.println(Bob.getName() + " Who will you attack?");
                name=in.nextLine();

                if(name.equals("Joe") || name.equals("Joe") || name.equals(Joe.getName())) // this part is incase input is for "Bob" or what the object n equals to in its constructor
                {
                    if(Joe.currentLife > 0)
                    {
                        System.out.println(Bob.getName() + " hits " + Joe.getName() + " for " + Bob.attack());
                        Joe.currentLife -= Bob.damage;
                        if(Joe.currentLife < 0)
                        Joe.currentLife = 0;
                        System.out.println(Adam.getName() + " HP: " + Adam.currentLife);
                        System.out.println(Joe.getName() + " HP: " + Joe.currentLife);
                        System.out.println(Bob.getName() + " HP: " + Bob.currentLife);

                    }
                    else
                    { System.out.println("*^*^*^");
                        System.out.println(Joe.getName() +"'s" + " HP:" + Joe.currentLife+" "+ Joe.getName() + " is already DEAD.");
                    }
                    System.out.println("*^*^*^");
                    System.out.println(Joe.getName() + " HP: " + Joe.currentLife);
                    System.out.println("*^*^*^");


                }
                else if (name.equals("Adam") || name.equals("Adam") || name.equals(Adam.getName())) // This is part is incase input is for "Adam"  or what the object n equals to in its constructor
                {
                    if(Adam.currentLife > 0 )
                    {
                        System.out.println(Bob.getName() + " hits " + Adam.getName() + " for " + Bob.attack());
                        Adam.currentLife -= Bob.damage;
                        if(Adam.currentLife < 0)
                            Adam.currentLife = 0;

                    }
                    else
                    {   System.out.println("*^*^*^");
                        System.out.println(Adam.getName()+"'s" + " HP:" + Adam.currentLife +" "+ Adam.getName() + " is already DEAD.");
                    }
                    System.out.println("*^*^*^");
                    System.out.println(Adam.getName() + " HP: " + Adam.currentLife);
                    System.out.println("*^*^*^");

                }
            }
            else
                System.out.println(Bob.getName() + "'s" + Bob.currentLife + " " + Bob.getName() + " is already DEAD.");

            System.out.println("______________________________N E X T  T U R N______________________________");

            if(Joe.currentLife > 0)// LOGIC  FOR Joe THE WIZARD OBJECT
            {   System.out.println(Joe.getName() + " Who will you attack?");
                name = in.nextLine();
                if(name.equals("Adam") || name.equals("Adam") || name.equals( Adam.getName()))
                {
                    if(Adam.currentLife > 0) // if attacking Adam and Adam is health is over 0.
                    {
                        System.out.println("Choose your attack");
                        System.out.println("1 For Regular attack");
                        System.out.println("2 For Lightning Bolt");
                        System.out.println("3 For Heal");
                        System.out.println("You have: " +Joe.currentLife +" for your mana!");
                        System.out.println("Lightning bolt cost 10 MANA!!");
                        System.out.println("Heal cost 10 MANA!!");
                        System.out.println("Choose your attack wisley! squire.");

                        String attacktype = in.nextLine();
                        if (attacktype.equals("1"))
                        {
                            System.out.println(Joe.getName() + " hits " + Adam.getName() + " for " + Joe.attack());
                            Adam.currentLife -= Joe.damage;
                            if(Adam.currentLife < 0)
                                Joe.currentLife = 0;

                        }
                        else if(attacktype.equals("2"))
                        {
                            System.out.println(Joe.getName() + " Struck " + Adam.getName() + " with Lightning for " + Joe.castLightningBolt());
                            Adam.currentLife -= Joe.castLightningBolt();
                            if (Adam.currentLife < 0)
                                Adam.currentLife = 0;
                        }
                        else if(attacktype.equals("3"))
                        {
                            System.out.println(Joe.getName() + "heals up for " + Joe.magicHeal());
                            Joe.currentLife += Joe.magicHeal();
                        }
                    }
                    else
                        System.out.println(Adam.getName() +"'s"+ " HP:" + Adam.currentLife + " " + Adam.getName() + " is already DEAD.");
                }
                else if (name.equals("Bob") || name.equals("Bob"))
                {
                    if(Bob.currentLife > 0) // if attacking Bob and Bob is health is over 0.
                    {
                        System.out.println("Choose your attack");
                        System.out.println("1 For Regular attack");
                        System.out.println("2 For Lightning Bolt");
                        System.out.println("3 For Heal");
                        System.out.println("You have: " +Joe.currentLife +" for your mana!");
                        System.out.println("Lightning bolt cost 10 MANA!!");
                        System.out.println("Heal cost 10 MANA!!");
                        System.out.println("Choose your attack wisely! squire.");

                        String attacktype = in.nextLine();
                        if (attacktype.equals("1"))
                        {
                            System.out.println(Joe.getName() + " hits " + Bob.getName() + " for " + Joe.attack());
                            Bob.currentLife -= Joe.damage;
                            if(Bob.currentLife < 0)
                                Bob.currentLife = 0;

                        }
                        else if(attacktype.equals("2"))
                        {
                            System.out.println(Joe.getName() + " Struck " + Bob.getName() + " with Lightning for " + Joe.castLightningBolt());
                            Bob.currentLife -= Joe.castLightningBolt();
                            if (Bob.currentLife < 0)
                                Bob.currentLife = 0;
                        }
                        else if(attacktype.equals("3"))
                        {
                            System.out.println(Joe.getName() + "heals up for " + Joe.magicHeal());
                            Joe.currentLife += Joe.magicHeal();
                    }
                    else
                        System.out.println(Bob.getName() +"'s"+ " HP:" + Bob.currentLife + " " + Bob.getName() + " is already DEAD.");
                }
            }

            System.out.println("______________________________N E X T  T U R N______________________________");

            if(Adam.currentLife > 0)
            {
                System.out.println(Adam.getName() + " Who will you attack");
                name = in.nextLine();
                if(name.equals("Joe")||name.equals("Joe")||name.equals(Joe.getName()))
                {
                    if(Joe.currentLife > 0)
                    {
                        System.out.println("Choose your Attack Type!");
                        System.out.println("1 for Regular Attack");
                        System.out.println("2 for Slice");
                        System.out.println("Your Energy Level is " + Adam.energy);
                        String attacktype = in.nextLine();
                        if(attacktype.equals("1"))
                        {
                            System.out.println(Adam.getName() + " hits " + Joe.getName() + " for " + Adam.attack());
                            Joe.currentLife -= Adam.damage;
                            if(Joe.currentLife < 0 )
                                Joe.currentLife = 0;

                        }
                        else if (attacktype.equals("2"))
                        {
                            System.out.println(Adam.getName() + " hits " + Joe.getName() + " for " + Adam.castslice());
                            Joe.currentLife -= Adam.damage;
                            if(Joe.currentLife < 0 )
                                Joe.currentLife = 0;
                        }
                         else if(attacktype.equals("3"))
                        {
                            System.out.println(Joe.getName() + " heals up for " + Joe.magicHeal());
                            Joe.currentLife += Joe.magicHeal();
                    }
                    }
                    else
                        System.out.println(Joe.getName() +"'s" + " HP:" + Joe.currentLife+" "+ Joe.getName() + " is already DEAD.");

                }
                else if(name.equals("Bob")||name.equals("Bob")||name.equals(Bob.getName()))
                {
                    if (Bob.currentLife > 0)
                    {
                        System.out.println("Choose your Attack Type!");
                        System.out.println("1 for Regular Attack");
                        System.out.println("2 for Slice");
                        String attacktype = in.nextLine();
                        if(attacktype.equals("1"))
                        {
                            System.out.println(Adam.getName() + " hits " + Bob.getName() + " for " + Adam.attack());
                            Joe.currentLife -= Adam.damage;
                            if(Joe.currentLife < 0 )
                                Joe.currentLife = 0;
                        }
                        else if (attacktype.equals("2"))
                        {
                            System.out.println(Adam.getName() + " hits " + Bob.getName() + " for " + Adam.castslice());
                               Bob.currentLife -= Adam.damage;
                            if(Bob.currentLife < 0 )
                                Bob.currentLife = 0;
                        }
                    }
                    else
                        System.out.println(Bob.getName() +"'s"+ " HP:" + Bob.currentLife + " " + Bob.getName() + " is already DEAD.");

                }

            }


        }
        
        System.out.println(Adam.getName() + " HP: " + Adam.currentLife);
        System.out.println(Joe.getName() + " HP: " + Joe.currentLife);
        System.out.println(Bob.getName() + " HP: " + Bob.currentLife);


    }
        
        if(Adam.currentLife > Joe.currentLife)
            System.out.println(Adam.getName() + " WON!!!");
        else if(Adam.currentLife > Bob.currentLife)
            System.out.println(Adam.getName() + " WON!!!");
        else if (Joe.currentLife > Adam.currentLife)
            System.out.println(Joe.getName() + "WON!!!");
        else if(Joe.currentLife > Bob.currentLife)
            System.out.println(Joe.getName() + "WON!!!");
        else if (Bob.currentLife > Adam.currentLife)
            System.out.println(Bob.getName() + "WON!!!");
        else if (Bob.currentLife > Joe.currentLife)
            System.out.println(Bob.getName() + "WON!!!");

        else
            System.out.println("TRY SOLVING THAT PARADOX");
            
}

}