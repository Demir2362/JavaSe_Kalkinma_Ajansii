package Week03.fileio;

import java.io.*;

public class BufferedWriterAndReaderEx {

    public static void main(String[] args) throws IOException    {
        FileWriter fw = new FileWriter("buffered. txt") ;
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine();
        bw.write("java");
        bw. close();
        FileReader fr =new FileReader("buffered.txt");
        BufferedReader br = new BufferedReader(fr);




        }



        }



