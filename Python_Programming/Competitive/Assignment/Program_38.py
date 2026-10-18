Max = lambda No1,No2 : No1 if No1 > No2 else No2

def main():
    Num1 = int(input("Enter number1 : "))
    Num2 = int(input("Enter number2 : "))
    iRet = Max(Num1,Num2)

    print("Maximum number : ",iRet)

if __name__ == "__main__":
    main()