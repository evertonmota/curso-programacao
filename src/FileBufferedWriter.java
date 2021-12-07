import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {

	public static void main(String[] args) {
		
		String  [] lines = new String[] {"teste1", "teste2", "teste3"};
	
		String path = "c:\\temp\\out.txt";
		
		// Indica que você nao quer recriar o arquivo e sim acrescentar o texto ao final do mesmo.
		try( BufferedWriter buffer = new BufferedWriter(new FileWriter(path,true))){
		//try( BufferedWriter buffer = new BufferedWriter(new FileWriter(path))){			
			for(String line : lines) {
				buffer.write(line);
				buffer.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
