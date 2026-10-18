LargestNo = lambda No1,No2,No3 : No1 if(No1 > No2 and No1 > No3) else (No2 if(No2 > No1 and No2 > No3) else No3)

def main():
    Num1 = int(input("Enter number1 : "))
    Num2 = int(input("Enter number2 : "))
    Num3 = int(input("Enter number3 : "))
    iRet = LargestNo(Num1,Num2,Num3)

    print("Largest number is : ",iRet)

if __name__ == "__main__":
    main()