CREATE TABLE registro_notas (
                idRegistro INT AUTO_INCREMENT NOT NULL,
                nombre_estudiante VARCHAR(60) NOT NULL,
                apellidos_estudiante VARCHAR(60) NOT NULL,
                codigo VARCHAR(10) NOT NULL,
                genero VARCHAR(10) NOT NULL,
                promedio DOUBLE PRECISION NOT NULL,
                PRIMARY KEY (idRegistro)
);