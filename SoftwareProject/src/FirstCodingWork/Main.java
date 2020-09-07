package FirstCodingWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*java读取的txt格式必须保存为ANSI编码
* */
public class Main {
    public static void main(String[] args)  {
        try {
            List<String> t = Files.readAllLines(Paths.get(args[0]), Charset.forName("UTF-8"));
            for (int i = 0; i < t.size(); i++) {
                System.out.print(t.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void print(FileInputStream orig){

        System.out.println();
    }
}
