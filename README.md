# Problem


CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".


Develop a decorator pattern approach that will implement the given UML diagram

The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :


![Screenshot 2023-12-09 210059](https://github.com/BabyleneRodriguez/SoftEng1_LabAss10_decoratorPattern/assets/142875371/47adaa10-c83c-4c19-b71a-836460d33356)


You should display the following output:


![Screenshot 2023-12-09 210219](https://github.com/BabyleneRodriguez/SoftEng1_LabAss10_decoratorPattern/assets/142875371/36433634-414f-40e4-b365-492dfa2758cc)


Description of the following methods

1. showAccountType() - Either returns "Savings Account", "GSave" or "UpSave"
2. getInterestRate() - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave
3. getBalance() - Returns the balance of the account set.
4. showBenefits() - Either returns "Standard Savings Account" for Savings Account;
		                benefits offered by savings account + "GSave Transfer";
                    benefits offered by savings account + "With Insurance";
5. computeBalanceWithInterest() - returns new balance by computing the balance plus the interest depending on the interest rate.
6. showInfo() - Returns details of account number, account name, and balance.

BankAcountDecorator must be an interface.

Follow instructions.  You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).


In your solution you must provide the following in your Github link account:

• Problem statement (description of the problem. Just copy what is stated here.

• UML Class Diagram

• Uploaded java codes for the solution.



# Class Diagram

![Screenshot 2023-12-09 205400](https://github.com/BabyleneRodriguez/SoftEng1_LabAss10_decoratorPattern/assets/142875371/bf1b4f71-c84f-4b69-b042-ba8600e2a88a)
