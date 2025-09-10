// abstract class animal{
//     abstract void walk();
// }
// class horse extends animal{
//     public void walk(){
//         System.out.println("animal walks on 4 legs:");
//     }
// }
// class chiken extends animal{
//     public void walk(){
//         System.out.println("walks on 2 legs:");
//     }
// }
// public class OOPS {
//     public static void main(String args[]){
//         horse ob=new horse();
//         ob.walk();

//     }
// }


abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("creating a animal class");

    }
    public void eat(){
        System.out.println("Animal eat");
    }
}
class horse extends animal{
    horse(){
        System.out.println("creating a horse ");
    }
    public void walk(){
        System.out.println("walks on 4 legs:");
    }
}
class chiken extends animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class OOPS {
  public static void main(String args[]){
       horse ob=new horse();
        
  }
}