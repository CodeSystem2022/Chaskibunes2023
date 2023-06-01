import psycopg2 #Esto es para poder conectactos a postgre

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd'
)
try:
    #conexion.autocommit = False #esto directamente no deberia estar
    cursor = conexion.cursor();
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'    
    valores = ('María', 'Esperanza', 'mesparza@gmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() #Hacemos el commit manualmente
    print('Termina la transacción')

except Exception as e:
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()

