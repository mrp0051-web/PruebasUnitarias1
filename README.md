Proyecto de Pruebas Unitarias: Validador de Registro
Este proyecto forma parte de una práctica de Testing y Calidad de Software. 
El objetivo es asegurar que la lógica de negocio del componente ValidadorRegistro funcione correctamente, bloqueando datos inválidos y permitiendo registros que cumplan con los requisitos del sistema.

Tecnologías Utilizadas
Java 17 (o superior)

JUnit 5 (Jupiter) para la ejecución de pruebas

Maven como gestor de dependencias

IntelliJ IDEA como entorno de desarrollo


Requisitos del Validador
Para que un registro sea considerado válido, el sistema debe cumplir las siguientes reglas:

Nombre: No puede estar vacío.

Contraseña: Debe tener al menos 8 caracteres.

Email: Debe contener obligatoriamente el símbolo @.

Edad: El usuario debe tener al menos 16 años.



Pruebas Implementadas (Los 5 Retos)
He diseñado una batería de pruebas unitarias para cubrir casos críticos y límites:

Reto 1: Nombre Vacío	Se envía una cadena "" al validador de nombres.	false

Reto 2: Password Justa	Se envía una contraseña de exactamente 8 caracteres.	true

Reto 3: Password Corta	Se envía una contraseña de 5 caracteres.	false

Reto 4: Email sin Arroba	Se envía un formato de correo inválido.	false

Reto 5: Edad Límite	Se prueba con la edad mínima legal (16 años).	true



Cómo ejecutar las pruebas
Clona este repositorio.

Abre el proyecto en IntelliJ IDEA.

Asegúrate de que Maven cargue las dependencias (JUnit 5).

Ve a la carpeta src/test/java/instituto/ValidadorRegistroTest.java.

Haz clic derecho y selecciona "Run 'ValidadorRegistroTest'".



Conclusión
Gracias a estas pruebas, hemos garantizado que el sistema de registro es robusto frente a errores comunes de entrada de usuario, mejorando la fiabilidad del software.




CAPTURAS

captura1: <img width="1012" height="915" alt="Captura de pantalla 2026-03-18 111827" src="https://github.com/user-attachments/assets/e5e05095-2a71-4e32-8029-1e2aeb0b5c5c" />
captura2: <img width="982" height="634" alt="Captura de pantalla 2026-03-18 111848" src="https://github.com/user-attachments/assets/21142ad3-5b33-4171-a143-2fe89585a3a3" />
