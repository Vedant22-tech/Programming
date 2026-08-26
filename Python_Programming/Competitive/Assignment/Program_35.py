def DisplayGrade(No1):
    if(No1 >= 75):
        print("Distinction")
    elif(No1 >= 60 and No1 < 75):
        print("First Class")
    elif(No1 >= 50 and No1 < 60):
            print("Second Class")
    elif(No1 < 50):
            print("Fail")

def main():
    A = int(input("Enter Length : "))

    DisplayGrade(A)

if __name__ == "__main__":
    main()