def ChkVowelConsonant(Character):
    if(Character == "a" or Character == "e" or Character == "i" or Character == "o" or Character == "u" 
       or Character == "A" or Character == "E" or Character == "I" or Character == "O" or Character == "U"):
        return True
    else:
        return False


def main():
    A = input("Enter character : ")

    Ret = ChkVowelConsonant(A)

    if(Ret):
        print("Vowel")
    else:
        print("Consonent")

if __name__ == "__main__":
    main()