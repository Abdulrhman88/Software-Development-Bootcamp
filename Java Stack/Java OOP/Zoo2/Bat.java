public class Bat extends A {
    public int defultenergy=0;

    public void fly(){
        int decree = getEnergyLevel();
        decree -=50;
        setEnergyLevel(decree);
        System.out.println("the sound a bat taking off :"+ decree);

    }
    public void eatHumans(){
        int eat = getEnergyLevel();
        eat += 25;
        setEnergyLevel(eat);
        System.out.println("he so- well, never mind: " + eat);
    }

    
    public void attackTown(){
        int attack =getEnergyLevel();
        attack -=100;
        setEnergyLevel(attack);
        System.out.println("he sound of a town on fire : "+attack);

    }

    
}