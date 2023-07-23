public class Gorilla extends Mammal {
    

    
    

    public void throwSomething(){
        int decrease  = getEnergyLevel();
        decrease  -= 5;
        setEnergyLevel(decrease);
        System.out.println(" that the gorilla has thrown something : "+ decrease );
    }

    public void eatBananas(){
        int satisfaction = getEnergyLevel();
        satisfaction +=10;
        setEnergyLevel(satisfaction);
        System.out.println("The gorilla's satisfaction : " + satisfaction);
    }

    public void climb(){
        int climbed =getEnergyLevel();
        climbed -=10;
        setEnergyLevel(climbed);
        System.out.println("the gorilla has climbed a tree : " + climbed);
    }
}