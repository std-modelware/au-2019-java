import java.io.*;

public class MyPrintWriter {
    public static void main(String[] args) throws Exception {
        System.out.println("PrintWriter");
        PrintWriter writer = new PrintWriter(new File("out.txt"));

        writer.write("Hallo zusammen. Ich heisse Mattheus. Heute ist der zwanzigste September.\n");
        writer.flush();
        writer.print("StringN2");
        writer.println("... continues");
        writer.flush();

        int age = 48;
        String name = "Elon Musk";
        writer.format("Name =%s, age =%d\n", name, age);
        writer.flush();
        writer.close();

        PrintWriter writer1 = new PrintWriter(new FileWriter("out.txt", true));
        writer1.println("File continues");
        writer1.flush();
    }
}
