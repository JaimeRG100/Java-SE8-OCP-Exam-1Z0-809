import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ListFilesUtil {
  
   public static List<File> listf(String directoryName) {
        File directory = new File(directoryName);

        List<File> resultList = new ArrayList<File>();

        // get all the files from a directory
        File[] fList = directory.listFiles();
        resultList.addAll(Arrays.asList(fList));
        for (File file : directory.listFiles()) 
        {
            if (file.isDirectory()) {
                resultList.addAll(listf(file.getAbsolutePath()));
            }
        }
        //System.out.println(fList);
        return resultList;
    }   
   
   public static List<File> filterFiles(List<File> listFD, String extension) {
     List<File> tempList = new ArrayList<File>(listFD);
     for(int i=tempList.size()-1; i>=0; i--) {
       if (tempList.get(i).toString().endsWith(extension) != true)
         tempList.remove(i);
     }
     return tempList;
   }
  
    public static void main (String[] args){
        final String directoryWindows ="C://test";
        List<File> myList = filterFiles(listf(directoryWindows), ".xlsx");
        for(File myFile: myList)
          System.out.println(myFile);
    }
}