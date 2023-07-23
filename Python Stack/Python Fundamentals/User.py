class User:
    def __init__(self, name, balance=0):
        self.name = name
        self.balance = balance

    def make_deposit(self, amount):
        print(f"You have deposit {amount} successfully")
        return self

    def make_withdrawal(self, amount):
        if(self.balance < amount):
            print(f"Sorry {self.name}, You don't have enough money.") #check if the balnce avilble 
        else:
            self.balance -= amount
            print(f"You have withdrawal {amount} successfully")
        return self

    def dislply_balance(self):
    
        print(f"Name: {self.name}\n Balance: {self.balance}\n")
        return self


    def transfer_money(self, other_user, amount):
        if(self.balance < amount):
            print(f"Sorry {self.name}, You don't have enough money.")
        else:
            self.balance -= amount #the one he will tranfer the omny to the other user 
            other_user.balance += amount  ##the amount of the other user well be more 
            print(f"Your transfer has been made successfully\n")
            print(f"From: {self.name}\nTo: {other_user.name}\nAmount: {amount} \n")
        
        return self


n1 = User("Fasial", 2000)
n2 = User("Abdulrhman", 3000)
n3 = User("osamh", 4000)

n1.dislply_balance()
n2.dislply_balance().transfer_money(n1,1000).dislply_balance()
n1.dislply_balance()
