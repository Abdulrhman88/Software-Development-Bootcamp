public class A {
    public int defultenergy=0 ;

    


    public A() {
        this.defultenergy=100;
    }

    




    public int getEnergyLevel() {
        return defultenergy;
    }






    public void setEnergyLevel(int energyLevel) {
        this.defultenergy = energyLevel;
    }

    



    public int displayEergy (){
        System.out.println("animal's energy level :" +defultenergy);
        return defultenergy;
        
    }
}
