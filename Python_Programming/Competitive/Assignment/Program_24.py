def ReverseDigit(Value):
    iSum = 0
    while(Value != 0):
        iDigit = Value % 10

        print(iDigit,end="")

        Value = Value // 10

def main():
    No = int(input("Enter Number :" ))

    ReverseDigit(No)

if __name__ == "__main__":
    main()