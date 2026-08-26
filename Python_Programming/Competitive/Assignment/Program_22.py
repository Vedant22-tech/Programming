def CountDigit(Value):
    iCount = 0
    while(Value != 0):
        iDigit = Value % 10

        iCount = iCount + 1

        Value = Value // 10

    return iCount

def main():
    No = int(input("Enter Number :" ))

    iRet = 0

    iRet = CountDigit(No)

    print("Number of Digits : ",iRet)

if __name__ == "__main__":
    main()