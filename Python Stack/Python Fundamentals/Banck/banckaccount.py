class BankAccount:
    def __init__(self, int_rate = 0.01, balance=0):
        self.int_rate = int_rate
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        print(f"You have successfully deposit ${amount}.")
        return self
    
    def withdraw(self, amount):
        if(self.balance < amount):
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
        else:
            self.balance -= amount
            print(f"You have successfully withdrawal ${amount}.")
        return self

    def display_account_info(self):
        print(f"Balance: ${self.balance}")
        return self

    def yield_interest(self):
        interest = round(self.balance * self.int_rate)
        if(self.balance > 0):
            self.balance += interest
            print(f"Your balance has been increased by ${interest} during the interest Yield!")
        else:
            print("try to deposit to get interest next time")
        return self



acc1 = BankAccount(0.01,2000)
acc2 = BankAccount(0.05,4000)

acc1.display_account_info().deposit(200).deposit(100).deposit(50).withdraw(88).display_account_info()
acc2.display_account_info().yield_interest().display_account_info()