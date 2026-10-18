def ChkNum(No1):
    if(No1 % 2 == 0):
        print("Even Number")
    elif(No1 % 2 != 0):
        print("Odd Number")

def main():
    Num = int(input("Enter number : "))

    ChkNum(Num)

if __name__ == "__main__":
    main()