import java.io.*;
import java.util.Scanner;

public class readFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String Line = "";
            int sun = 0;
            while ((Line = br.readLine()) != null) {
                System.out.println(Line);
                sun += Integer.parseInt(Line);

            }
            br.close();
            System.out.println("Tong =" + sun);

        } catch (Exception e) {
            System.out.println("file ko ton tai or noi dung co loi");
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);

    }
}
