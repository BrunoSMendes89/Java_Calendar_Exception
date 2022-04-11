import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RecordExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite qualquer frase: ");
			String text = sc.nextLine();

			PrintWriter gravador = new PrintWriter("C:\\Users\\Bruno Mendes\\Documents\\Bruno\\Java\\Arquivo-texto");
			gravador.println(text);
			gravador.close();

			System.out.println("Frase gravada com sucesso.");
		} catch (IOException ioe) {
			System.out.println("Falha ao gravar as informações digitadas.");
		}
	}
}
