package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction{
	
	private String date;
	private int amount;
	
	public Transaction(String date, int amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public int getAmount() {
		return amount;
	}
	
}

public class TransactionPblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given a list of transactions, find the sum of transaction amounts for each day using Java streams.
		
		List<Transaction> transactions = Arrays.asList(
			    new Transaction("2022-01-01", 100),
			    new Transaction("2022-01-01", 200),
			    new Transaction("2022-01-02", 300),
			    new Transaction("2022-01-02", 400),
			    new Transaction("2022-01-03", 500)
			);

			Map<String, Integer> sumByDay = transactions
			                        .stream()
			                        .collect(Collectors.groupingBy(Transaction::getDate,
			                               Collectors.summingInt(Transaction::getAmount)));
			
			System.out.println(sumByDay);

	}

}
