import java.util.Scanner;
import java.util.Calendar;

public class AgeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar data = Calendar.getInstance();		
		
		try {
			
		System.out.println("Digite o ano de seu nascimento: ");
		String dtNasc = sc.nextLine();
		
		int anos = Integer.parseInt(dtNasc);
		int idade = (data.get(Calendar.YEAR)) - anos;
		
		System.out.println("Você tem " + idade + " de idade.");
		}catch (NumberFormatException e) {
		System.out.println("Valor digitado é inválido.");
		}
	}
}
