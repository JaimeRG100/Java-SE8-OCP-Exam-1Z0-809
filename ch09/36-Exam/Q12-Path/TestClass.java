import java.nio.file.*;


public class TestClass {
  
  public static void main(String[] args) throws java.net.URISyntaxException {
    Path path;
    path = FileSystems.getDefault().getPath("puma.txt");
    path = Paths.get(new java.net.URI("cheetah.txt"));
    path = Paths.get("cats", "lynx.txt");
    path = new java.io.File("tiger.txt").toPath();
  }
}

/*
Which of the following methods cannot be used to obtain a Path instance? 
------------------------------------------------------------------------
A. new Path("jaguar.txt")
F. new FileSystem().getPath("leopard")
G. Paths.getPath("ocelot.txt")

Which of the following methods can be used to obtain a Path instance?
------------------------------------------------------------------------
B. FileSystems.getDefault().getPath("puma.txt")
C. Paths.get(new URI("cheetah.txt"))
D. Paths.get("cats","lynx.txt")
E. new java.io.File("tiger.txt").toPath()
*/