class ninja {

    constructor(name, helth) {
        this.name = name;
        this.helth = helth;
        this.spead = 3;
        this.strength = 3;
    }



sayname(){
    console.log(`Your Name  ${ this.name } `); 
}

showstats(){
    console.log(`name :${this.name} helth: ${this.helth} and the spead: ${this.spead} Strength: ${this.strength} `);
}


drinkSakee(){
    return "What one programmer can do in one month, two programmers can do in two months."
}

}
const n1=new ninja("Ninja1",100);
n1.sayname();
n1.showstats();

// child sisne class
class Si extends ninja{
    
    constructor(name, health = 200, speed = 10, strength = 10 , wisdom = 10) {
        super(name, health, speed, strength);
        this.wisdom = wisdom;
    }
    
    speakWisdom(){

        const message= super.drinkSakee();
        console.log(message);

    }
    
} 

const superSensei = new Si("Master Splinter");
superSensei.speakWisdom();
superSensei.showstats();