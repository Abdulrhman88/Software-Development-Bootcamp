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
    console.log(`Ninja name :${this.name} helth: ${this.helth} and the spead: ${this.spead} Strength: ${this.strength} `);
}

drinkSake(){
    helth=+10
}

}
const n1=new ninja("Ninja1",100);
n1.sayname();
n1.showstats();