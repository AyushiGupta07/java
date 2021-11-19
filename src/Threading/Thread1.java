package Threading;

public class Thread1 {
    public static void main(String[] args) {
        Music obj=new Music();
        obj.run();
        Video obj2=new Video();
        obj2.run();
    }

}
class Music extends Thread{
    @Override
    public void run() {
        System.out.println("Music is playing  ");
    }
}
class Video extends Thread{
    @Override
    public void run() {
        System.out.println("Video is playing ");
    }
}