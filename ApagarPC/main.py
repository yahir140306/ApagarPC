import os

shutdown = input("Por favor escribe (si): ")

if shutdown == 'no':
    exit()
else:
    os.system("shutdown /s /t 1")