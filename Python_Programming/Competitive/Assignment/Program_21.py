def CheckPrime(Number):
    if(Number < 2):
        return False
    
    for i in range(2,(Number//2)+1):
        if(Number % i == 0):
            return False

    return True

def main():
    No = int(input("Enter Number : "))
    bRet = False

    bRet = CheckPrime(No)

    if(bRet == True):
        print("Prime Number")
    else:
        print("Not Prime Number")

if __name__ == "__main__":
    main()