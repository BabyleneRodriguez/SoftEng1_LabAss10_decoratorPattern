package SoftEng1_LabAss10_decoratorPattern;

public interface BankAccount
{
    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}
