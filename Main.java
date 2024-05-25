import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для кодировки: ");
        String str = scanner.nextLine();
        int temp = -1;
        char [] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\Gamesandprogram\\laba\\File.txt"))){
            String line;
            int lineCount = 1;
            int symbol = 0;
            int j = 0;
                while ((line = reader.readLine()) != null) {
                    String lowercaseLine = line.toLowerCase();
                    char[] charArray1 = lowercaseLine.toCharArray();
                    for (j = 0; j < charArray1.length; j++) {
                        if (charArray[i] == charArray1[j]) {
                            symbol++;
                            temp++;
                            break;
                        }
                    }
                    if (temp == i) {
                        break;
                    }
                    else {
                        lineCount++;
                    }
                }
                if(symbol == 0){
                    System.out.println("Символ не найден");
                    break;
                }
                else {
                    System.out.printf("%d%d ", lineCount, j+1);
                }
            }
        catch (IOException ex){
            System.err.println();
        }
        }
    }
}



