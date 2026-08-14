def OddNumber(x):
   for i in range(1,x+1,2):
    print(i)        

def main():
    A = int(input("Enter number : "))

    OddNumber(A)

if __name__ == "__main__":
    main()