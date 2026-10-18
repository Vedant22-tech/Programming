Even = lambda No: (No % 2 == 0)

def main():
    Num = int(input("Enter number : "))
    iRet = Even(Num)

    print(iRet)

if __name__ == "__main__":
    main()