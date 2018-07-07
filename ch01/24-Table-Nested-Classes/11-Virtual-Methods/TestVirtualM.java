public class TestVirtualM {
  
  public static void main(String[] args) {
    VirtualMethod[] VirtualMethods = new VirtualMethod[3];
    VirtualMethods[0] = new DVDPlayer();
    VirtualMethods[1] = new XBOX();
    VirtualMethods[2] = new Smarthphone();
    for (VirtualMethod vm: VirtualMethods){
      vm.play();
    }
  }
  
}

class DVDPlayer extends VirtualMethod {
  void play() {System.out.println("Playing DVD movie"); }
}

class XBOX extends VirtualMethod {
  void play() {System.out.println("Playing video game"); }
}

class Smarthphone extends VirtualMethod {
  void play() {System.out.println("Playing video from gallery"); }
}



abstract class VirtualMethod {
  abstract void play();
}