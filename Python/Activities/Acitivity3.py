User1 = input ("Whats the user 1 name?: ")
User2 = input ("Whats the User 2 name?: ")
User1answer = input ( User1 +  " says: ").lower()
User2answer = input (User2 + " says: ").lower()
if User1answer == User2answer:
   print("its a tie")
elif User1answer == 'Rock':
    if User2answer == "Scissors":
        print("User 1 Wins")
    else:
                print("User 2 Wins")