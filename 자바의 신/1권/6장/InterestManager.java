public class InterestManager {

    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();
        for(int day=1; day<=365; day++) {
            double amount = interestManager.calculateAmount(day,1000000);
            System.out.println(day + " : " + amount);
        }
    }

    public double getInterestRate(int day) {

        double interest;
        if(day<=90) {
            interest=0.5;
        } else if(day>90 && day <=180) {
            interest=1;
        } else if(day>180 && day< 365) {
            interest=2;
        } else {
            interest=5.6;
        }
        return interest;
    }

    public double calculateAmount(int day, long amount) {
        double totalamount = 0;
        double interest=getInterestRate(day);
        double interestAmount=amount * interest / 100.0;
        totalamount = amount + interestAmount;
        return totalamount;
    }


}
