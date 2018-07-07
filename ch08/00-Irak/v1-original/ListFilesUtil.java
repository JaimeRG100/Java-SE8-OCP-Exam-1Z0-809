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
        for (File file : fList) {
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                resultList.addAll(listf(file.getAbsolutePath()));
            }
        }
        //System.out.println(fList);
        return resultList;
    }   
  
    public static void main (String[] args){
        final String directoryWindows ="C://test";
        listf(directoryWindows);
    }
}