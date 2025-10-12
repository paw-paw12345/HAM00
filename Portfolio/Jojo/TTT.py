def momo():
    print("Welcome to MTN Mobile Money (*170#) ")
    print("1. Transfer Money")
    print("2. MoMoPay & Pay Bill")
    print("3. Airtime & Bundles")
    print("4. Allow Cash Out")
    print("5. Financial Services")
    print("6. My Wallet")

    option = input("Select an option: ")

    if option == "1":
        print("\n1. To MoMo User")
        print("2. To Other Networks")
        print("3. To Bank Account")
        sub = input("Select transfer type: ")

        if sub == "1":
            number = input("Enter receiver number: ")
            amount = input("Enter amount: ")
            pin = input("Enter your PIN: ")
            print(f"\nSending GHS {amount} to {number}...")
            print("Transaction successful ")
        else:
            print("Service not available yet ")

    elif option == "2":
        print("\n1. MoMoPay")
        print("2. Pay Bill")
        pay = input("Select option: ")
        print("Feature coming soon ")

    elif option == "3":
        print("\n1. Buy Airtime")
        print("2. Buy Data Bundle")
        sub = input("Select option: ")
        number = input("Enter receiver number: ")
        amount = input("Enter amount: ")
        print(f"Buying GHS {amount} airtime for {number}... ")

    elif option == "4":
        print("\n1. Allow Cash Out")
        print("2. Disallow Cash Out")
        choice = input("Select: ")
        if choice == "1":
            print("Cash Out allowed ")
        else:
            print("Cash Out disallowed ")

    elif option == "5":
        print("\n1. Loans")
        print("2. Savings")
        print("3. Insurance")
        print("Financial Services coming soon ")

    elif option == "6":
        print("\n1. Check Balance")
        print("2. Change PIN")
        print("3. Statement")
        sub = input("Select option: ")
        if sub == "1":
            pin = input("Enter PIN to check balance: ")
            print("Your MoMo balance is GHS 350.00 💰")
        else:
            print("Feature not available yet.")

    else:
        print("Invalid input ")

momo()

