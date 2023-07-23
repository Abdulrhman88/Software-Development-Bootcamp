import java.net.http.HttpResponse.PushPromiseHandler;

public class Mammal {
    public int energyLevel=0 ;

    


    public Mammal() {
        this.energyLevel=100;
    }

    




    public int getEnergyLevel() {
        return energyLevel;
    }






    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    



    public int displayEergy (){
        System.out.println("animal's energy level :" +energyLevel);
        return energyLevel;
        
    }
}



