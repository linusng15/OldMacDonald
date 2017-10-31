class Chick implements Animal 
{    
     private String myType;
     private String mySound1;
     private String mySound2;
     public Chick(String type, String sound1, String sound2)
     {
     	myType=type;
     	mySound1=sound1;
          mySound2=sound2;
     }
     public Chick()
     {
     	mySound1="unknown";
          mySound2="unknown";
     	myType ="unknown";
     }
     public String getType()
     {
          return myType;
     }
     public String getSound()
     {
     int a = (int)(Math.random()*2)+1;
     {
     if(a == 1)
     {
          return mySound1;
     }
     else 
     {
          return mySound2;    
     }

}
}
}