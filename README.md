# ¿Qué es una prueba o caso de test? 
Es una pieza de código que verifica el correcto funcionamiento de otra pieza de código mediante datos de entrada, y chequeo de sus datos de salida para confirmar que el comportamiento es correcto. 

# Requisitos para hacer Testing

- Comprender el funcionamiento de nuestra aplicación
- Conocer cuáles son nuestras clases
- Reglas de negocio o casos de uso probar 

# Tipos de Testing
Se define en función de su nivel de aislamiento 

- **Pruebas Unitarias**: Son las que menor coste tienen, las más fáciles de realizar, tienen mayor número de test, tienen máximo aislamiento ya que prueban requisitos de manera individualizada.
Se prueban método a método y todas sus casuisticas. 

- **Pruebas de Integración**: Se prueban la integración de las diferntes capas, que los distintos componentes se encuentran bien integrados y el correcto funcionamiento del conjunto. Ej: DAO, Service, Controller 

- **Pruebas de aceptación**: Se prueba toda la aplicación integrada, en su conjunto (Testing Funcional)

# JUnit 5

Es un framework de Java que permite escribir y ejecutar pruebas unitarias: 
- De forma ordenada
- Automatizada
- Repetibles en el tiempos

# Probando con Assert 
- Permite **verificar** la funcionalidad de nuestro código: 
- assertTrue/assertFalse
- assertNull/assertNotNull
- assertEquals
- assertThrows
- assertTimeout 
- assertAll 


# Ciclos de vida
- Proceso por el cual se crea, y se destruye una instancia
- Se encarga el motor de JUnit 5 
- Se crea una nueva instancia con cada test que se ejecuta
- JUnit 5 permite ejecutar hooks en diferentes momentos del ciclo de vida

# Hooks de JUnit 5: 
- @BeforeAll / @AfterAll 
- @BeforeEach / @AfterEach


# @BeforeEach / @AfterEach 
Nos permite agregar código antes y después de cada caso de test 
- @BeforeEach: Se ejecuta antes de la ejecución de cada test. Se utiliza para instanciar elementos comunes entre los test 
- @AfterEach: Se ejecuta después de la ejecución de cada test. Se utiliza por ejemplo para destruir o eliminar elementos utilizados en los test previos


# @BeforeAll / @AfterAll
Se ejecutan antes de crear/después de destruir la instancia, por lo que se implementa en un método estático 
- @BeforeAll: Se ejecuta antes de la ejecución de todos los tests. Se utiliza para inicializar elementos compartidos por todos los test. 
- @AfterAll: Se ejecuta después de la ejecución de todos los tests. Se utiliza para destruir o limpiar elementos después de todos los tests

# Tests Condicionales - Anotaciones
Las pruebas unitarias se pueden ejecutar conforme a diferentes condiciones

JUnit ofrece anotaciones para habilitar o no dichos tests: 
- @EnabledOnOS: Permite habilitar/deshabilitar un test en base a su S.O. 
- @EnabledOnJre: Permite habilitar/deshabilitar un test en base a la versión de Java
- @EnabledIfSystemProperty:  Permite habilitar/deshabilitar un test en base a la propiedad del sistema.
- @EnabledIfEnvironmentVariable: Permite habilitar/deshabilitar un test en base a las variables de entorno del S.O. 

# Tests Condicionales - Assumptions
Permite habilitar parte de un test en función de si se cumple una condición 
- assumeTrue(boolean condition);
- assumeFalse(boolean condition);

Si la assumption no se cumple, el código a partir de ahí se deshabilita, evitando el fallo. 














