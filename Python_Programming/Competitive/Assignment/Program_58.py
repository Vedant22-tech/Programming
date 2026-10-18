def Add(No1, No2):
    Add = No1 + No2
    return Add

def main():
    Num1 = int(input("Enter number1 : "))
    Num2 = int(input("Enter number2 : "))

    iRet = Add(Num1, Num2)

    print("Addition is : ",iRet)

if __name__ == "__main__":
    main()