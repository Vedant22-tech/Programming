DivBy5 = lambda No: (No % 5 == 0)

def main():
    Num = int(input("Enter number : "))
    iRet = DivBy5(Num)

    print(iRet)

if __name__ == "__main__":
    main()