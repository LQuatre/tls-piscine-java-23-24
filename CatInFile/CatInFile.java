import java.io.*;

public class CatInFile { 
    public static void cat(String[] args) throws IOException { // merci stackoverflow encore
        InputStream in = System.in;
        OutputStream out = new FileOutputStream(args[0]);
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }
        out.close();
    }
}