def Table(x):
   for i in range(1,11):
       print(x * i)

def main():
    A = int(input("Enter number : "))

    Table(A)

if __name__ == "__main__":
    main()