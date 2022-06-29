class Circle{

   private int radius;  //instace variable-gets memory when object gets created
   private static int counter;  //class variable-gets memmory when class gets created

   public static void main(String[] args){

      	 Circle circle=new Circle();
	Circle circle1=new Circle();

       	// circle.setRadius(2);
	circle1.setCounter();
         System.out.println(circle1.getCounter());   //2 because one single copy gets created for two objects because of class variable
}

	
   	public void setRadius(int r){
    		 radius=r;
	}

   	public int getRadius(){
      	     return radius;
	}
	public void setCounter(int c){
    		 ++counter;
	}

   	public int getCounter(){
      	     return ++counter;
	}

  	public double area(){
        	return 3.14*radius*radius;
	}

}