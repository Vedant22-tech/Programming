def Factors(No):
    for i in range(1,No+1):
        if(No % i == 0):
            print(i,end=" ")

def main():
    A = int(input("Enter Number : "))

    Factors(A)

if __name__ == "__main__":
    main()