def NumPrint(No):
    for i in range(No,0,-1):
        print(i,end=" ")

def main():
    A = int(input("Enter Number : "))

    NumPrint(A)

if __name__ == "__main__":
    main()