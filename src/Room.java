public class Room {
    public boolean AC_ON;
    public boolean THEATRE_ON;
    public boolean FAN_ON;
    public boolean LIGHT_ON;

    double totalPower;

    public Room(boolean AC_ON, boolean THEATRE_ON, boolean FAN_ON, boolean LIGHT_ON) {
        this.AC_ON = AC_ON;
        this.THEATRE_ON = THEATRE_ON;
        this.FAN_ON = FAN_ON;
        this.LIGHT_ON = LIGHT_ON;
    }

    public void display(){
        int AC=0,THEATRE=0,FAN=0,LIGHT=0;
        if(AC_ON || THEATRE_ON|| FAN_ON || LIGHT_ON){
            if(AC_ON) {
                 AC = 1200;
            }
            if(THEATRE_ON) {
                THEATRE = 600;
            }
            if(FAN_ON) {
                 FAN = 400;
            }
            if(LIGHT_ON) {
                 LIGHT = 100;
            }
            totalPower=AC+ THEATRE +FAN +LIGHT;
          //  System.out.println(totalPower);
            if(totalPower>=2000){
                System.out.println("Power Overloaded " + totalPower);
            }
            else
                System.out.println("no overloaded " +totalPower);


        }
    }

    public static void main(String[] args) {

        Room obj=new Room(true,false,true,true);
        obj.display();
    }
}
