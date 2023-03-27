public class HumanHeart{
	
	static int size;
	static String colour;
	short heartbeat_per_min;
	boolean isgoodbloodflow;
	int blood_pumpingrate;
	Valve valves;
	static{
		size=12;
		colour="red";
	}
	public HumanHeart(Valve valves,boolean isgoodbloodflow){
		this.valves=valves;
		this.isgoodbloodflow=isgoodbloodflow;
	}
	public static void main(String[] args){
		HumanHeart heart=new HumanHeart(Valve.AORTIC,true);
		System.out.println(heart.valves);
		System.out.println( HumanHeart.size);
		System.out.println(HumanHeart.colour);
		System.out.println(heart.isgoodbloodflow);
		
		
	}
	enum Valve{
		AORTIC,MITRAL,TRICUSPID,PULMONARY
	}
}