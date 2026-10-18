Odd = lambda No: (No % 2 != 0)

def main():
    Num = int(input("Enter number : "))
    iRet = Odd(Num)

    print(iRet)

if __name__ == "__main__":
    main()