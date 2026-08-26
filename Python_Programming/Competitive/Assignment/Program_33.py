def PerfectNumber(No):
    Temp = No
    Sum = 0
    for i in range(1,No):
        if(No % i == 0):
            Sum = Sum + i

    if(Sum == Temp):
        return True
    else:
        return False

def main():
    A = int(input("Enter Number : "))

    Ret = PerfectNumber(A)

    if(Ret == True):
        print("Perfect Number")
    else:
        print("Not Perfect Number")

if __name__ == "__main__":
    main()