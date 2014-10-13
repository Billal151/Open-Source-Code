//BILLAL MABUZA, COMS@2000, PL

public class Spider extends Arachnid{


    public static void main(String[] args){

	//1
	Spider myspy = new Spider();
	Arachnid myAra = new Arachnid();  //1. INHERITANCE
	//3
	myspy.move();
	myAra.move();

	Arachnid as = new Spider(); //3. Its of type Arachnid but prints outspider method
	as.move();

	myspy.crawl();
	as.crawl();
	//4
	myspy.poison(); //Because of supe.poison() it calls the method from Arachnid class also, and object for spider class
	myAra.poison(); //from Arachnid class
	as.poison(); // Does not matter because method is also from Spider, it does not matter to have a poison m ethod in the Spider class. For Super class

	//Last Part about d and a method

	Spider s = new Spider();
	Arachnid a = s;
	s.move(); //Output Spider moves
	s.poison(); // Very Poisonous
	a.move(); // Spider moves because a points to s which is an object of s
	a.poison(); // Poisonous, cannot override method to Spider miove, hence uses Arachnid poison method
    }
    public void move(){ //2.  TO SHOW THAT METHOD OVERRIDES THAT OF ARACHNID
	System.out.println("Spider moves");
    }

    public void crawl(){
	System.out.println("Spider Crawls");
    }

    public static void poison(){ //5. Both Method must be static
	//	super.poison(); //  calls from super class method.
	System.out.println("Very Poisonous");
    }

}
