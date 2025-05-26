s=input()
c1=0
c2=0
c3=0
space=0
c4=0
bo=False
for i in range(len(s)):
    if s[i].isupper():
        c1+=1
    elif s[i].islower():
        c2+=1
    elif s[i].isdigit():
        c3+=1
    elif s[i].isspace():
        space+=1
    else:
        c4+=1
if s[0].isupper:
    if c1>=1:
        if c2>=2:
            if c3>=2:
                if c4>=1:
                    if space==0:
                        if len(s)>=8:
                            bo=True
if bo:
    print("Valid Secret Code")
else:
    print("Invalid Secret Code")
    
print("Captials-",c1)
print("Small-",c2)
print("Numbers-",c3)
print("Special-",c4)
print("Space-",space)
                
    
        
        