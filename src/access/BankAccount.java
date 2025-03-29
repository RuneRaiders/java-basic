package access;

public class BankAccount {

    private int balance;

    // Intellj Generator 단축키 : Alt + Insert

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : 입금
    public void deposit(int amount){
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나, 잔액이 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }

    // 내부에서만 사용하기에 private
    private boolean isAmountValid(int amount){
        // 금액이 0보다 커야 함
        return amount > 0;
    }
}
