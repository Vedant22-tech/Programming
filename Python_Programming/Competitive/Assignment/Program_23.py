def SumOfDigit(Value):
    iSum = 0
    while(Value != 0):
        iDigit = Value % 10

        iSum = iSum + iDigit

        Value = Value // 10

    return iSum

def main():
    No = int(input("Enter Number :" ))

    iRet = 0

    iRet = SumOfDigit(No)

    print("Sum of Digits : ",iRet)

if __name__ == "__main__":
    main()