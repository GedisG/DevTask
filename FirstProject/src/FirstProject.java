import java.io.*;

public class FirstProject {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("strings.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                for(int i=0; i+1<line.length(); i++){
                   char [] lineLetter = line.toCharArray();
                   if(Character.isDigit(lineLetter[i])&Character.isDigit(lineLetter[i+1])&Character.getNumericValue(lineLetter[i])>0){
                       System.out.println(line);
                       break;
                   }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}