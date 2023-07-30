#What is your name

print ('Enter your name')
name = input()
while name != 'your name':
    name = input()
if name == 'your name':
    print('Haha funny. But really what is your name?')
    name = input()
while name == 'your name':
    print('Haha funny. But really what is your name?')
    name = input()
else: name != 'your name'
print('Hello ' + name)
    
    