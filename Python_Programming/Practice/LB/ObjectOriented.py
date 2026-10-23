class Arithematic:
    def Addition( No1, No2):
        Ans = No1 + No2
        return Ans

    def Substraction( No1, No2):
        Ans = No1 - No2
        return Ans
    
Aobj = Arithematic()

print("Enter first number :")
Value1 = int(input())

print("Enter second number :")
Value2 = int(input())

Ret = Aobj.Addition(Value1, Value2)     # ERROR
print("Addition is :",Ret)

Ret = Aobj.Substraction(Value1, Value2) # ERROR
print("Substraction is :",Ret)