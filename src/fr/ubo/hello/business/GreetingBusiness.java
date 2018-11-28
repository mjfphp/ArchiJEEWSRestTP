package fr.ubo.hello.business;

import fr.ubo.hello.bean.Greeting;

public class GreetingBusiness {
	
	public Greeting greeting(String chaine) {
		Greeting greeting = new Greeting("Hello",chaine);
		return greeting;		
	}
	
	public Greeting badGreeting() {
		Greeting greeting = new Greeting("name est obligatoire");
		return greeting;			
	}

}
