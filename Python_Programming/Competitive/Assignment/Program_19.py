def EvenNumber(x):
   for i in range(2,x+1,2):
    print(i)        

def main():
    A = int(input("Enter number : "))

    EvenNumber(A)

if __name__ == "__main__":
    main()