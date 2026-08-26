def BinaryNo(No):
    i = 1
    Bin = 0
    while(No != 0):
        Digit = No % 2

        Bin = Bin + Digit*i  

        No = No // 2
        i = i*10

    return Bin

def main():
    A = int(input("Enter Number : "))

    Ret = BinaryNo(A)

    print("Binary is :",Ret)

if __name__ == "__main__":
    main()