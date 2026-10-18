StringLength = lambda Str1 : (len(Str1) > 5) 

def main():
    Data = []

    R = int(input("Enter range : "))

    for i in range(0,R):
        i = input("Enter string : ")
        Data.append(i)

    Fdata = list(filter(StringLength,Data))

    print(Fdata)

if __name__ == "__main__":
    main()