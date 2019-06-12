import MySQLdb

db =  MySQLdb.connect(host="localhost", user ="root",passwd="",db="registro")
cursor =  db.cursor()

def viewallstudent():
	sql = "SELECT * from registro_notas"
	cursor.execute(sql)
	db.commit()
	results = cursor.fetchall()	
	print("\tid", "\tnombre", "\tapellidos", "\tcodigo", "\tgenero", "\tpromedio")
	for row in results :
		id = row[0]
		nombre = row[1]
		apellidos = row[2]
		codigo = row[3]
		genero = row[4]
		promedio = row[5]
		print(f"\t{id}\t{nombre}\t{apellidos}\t{codigo}\t{genero}\t{promedio}")

	return

def insert():
	nombre = input("Nombre del Estudiante:")
	apellidos = input("Apellidos del estudainte:")
	codigo = input("Codigo del estudiante:")
	genero = input("Genero:")
	promedio = float(input("Promedio de Nota:"))

	#print("database version is ", data)

	sql = "INSERT INTO registro_notas( nombre_estudiante, apellidos_estudiante, codigo, genero, promedio) values('%s','%s','%s','%s',%f)" % \
	(nombre , apellidos , codigo , genero ,promedio)

	try:
		cursor.execute(sql)
		db.commit()
	except:
		db.rollback()
	return

def viewStudentById():	
	id = int(input("Enter the id of the student "))

	sql = "select * from registro_notas where idRegistro = '%s'" % (id)
	
	cursor.execute(sql)
	db.commit()
	results = cursor.fetchall()
	for row in results :
		id = row[0]
		nombre = row[1]
		apellidos = row[2]
		codigo = row[3]
		genero = row[4]
		promedio = row[5]
		print(f"\t{id}\t{nombre}\t{apellidos}\t{codigo}\t{genero}\t{promedio}")
	return

flag = 1


while flag:

	print ("---------Seleccione una opcion--------------------------")
	print ("--------Eliga 1 Crear nuevo estudiante---------------")
	print ("--------Eliga 2 Ver todos los estudiantes-------------")
	print ("--------Eliga 3 ver un estudiante en particular--------")
	print ("--------Eliga 4 Si desea elimianr un estudiante-------")
	print ("--------Eliga 5 si desea modificar algun detalle del estudiante---------")

	action = input("Seleccione una de las Opciones:")
	flag=int(action)
	if   action == '1':
		insert()
	elif action == '2':
		viewallstudent()
	elif action == '3' :
		viewStudentById()
	elif action == '4':
		viewallstudent()
	elif action == '5':
		viewallstudent()
	else:
		print ("La Opcion que ha seleccionado no existe")
