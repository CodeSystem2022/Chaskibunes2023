resultado = None
a = 7
b = 0
try:
    a = int(input('Digite el primer número: '))
    b = int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Son números iguales')
    resultado = a / b #modificamos
except Exception as e:
    print(f'TypeError - Ocurrió un error: {e}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrió un error: {type(e)}')
else:
    print("No se arrojo ninguna excepción")
finally:
    print("Ejecuación de este bloque finally")


print(f'El resultado es: {resultado}')
print('seguimos...')