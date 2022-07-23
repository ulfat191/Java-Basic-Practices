
public class code_for_perfect_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long starts_from = 1;
		long ends_at = 1000000;
		
		System.out.println("The perfect numbers upto 10,00,000 are as follows: ");
		
		for(starts_from=1; starts_from< ends_at; starts_from++) {
			int sum_of_divisors = 0;
			for(long i=1; i<starts_from; i++) {
				if((starts_from%i) == 0) {
					sum_of_divisors+=i;
				}
			}
			if(sum_of_divisors==starts_from) {
				System.out.println(sum_of_divisors + " is a perfect number");
			}
		}
	}

}
