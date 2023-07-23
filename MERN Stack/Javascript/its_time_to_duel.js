class card{
    constructor(name,cost){
        this.name=name;
        this.cost=cost;
    }
}

class Unit extends card {
    constructor(name,cost,power,resilience){
        super(name,cost)
        this.power=power
        this.resilience=resilience
}
play(target){
    if(target instanceof Unit){

        console.log(`${this.name} attacked ${target.name} and reduced power: by ${this.power}resilience: by${this.resilience}`);

        target.power -= this.power;
        target.resilience -= this.resilience;

    }else{
        
        throw new Error("Card must be a Unit!")
    }
}

showStats(){
    console.log(`${this.name} has ${this.power} power and ${this.resilience} resilience`);
}

}

class Efect extends card{
    constructor(name ,cost ,text,stat,magnitude){
        super(name,cost)
        this.text=text;
        this.stat=stat;
        this.magnitude=magnitude;
    }

    target(card){
        if(card instanceof Unit){
            (this.stat == "resilience")
            //if stetment but in the arrow funshion 
            ? card.resilience += this.magnitude
            //else in the arrow funshoin
            : card.power += this.magnitude;
            console.log(this.text);
            console.log(`Target: ${card.name}`);
        }else{
            throw new Error("Target must be a Unit!")
        }
    }
}
const card1=new Unit("RedBelt Ninja ",3,3,4);
card1.showStats();

const efectone = new Efect ("Hard Algorithm",2,"increase target's resilience by 3","resilience",3)
efectone.target(card1);

const card2=new Unit("BlackBelt Ninja ",4,5,4);
card2.showStats();

const efecttow = new Efect("Unhandled Promise Rejection",1,"reduce target's resilience by 2","resilience",-2)
efecttow.target(card1);

const efectthree = new Efect("Pair Programming",3,"increase target's power by 2","power",2)
efectthree.target(card1);

card1.play(card2); //the attack

card2.showStats();




