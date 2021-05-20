# pruebaTecnicaJava
Prueba tecnica desarrollada en java con framework spring boot

# Instalacion del proyecto
- Se utilizar Maven
- Java 8
- spring boot 2.4.5 o superiores
- Clonar el repositorio
- abrir el proyecto en algun IDE ( de preferencia Spring tools en alguna de sus versiones)

Dependencias instaladas
- spring data JPA
- Thymeleaf
- web-services
- devtools
-mysql connector
- starter test

Estructura del proyecto

la estructura principal del proyecto esta compuesta por:
en el src/main/java se tienen los siguientes paquetes
- paquete controller
- paquete models.entity
- paquete models.repository
- paquete models.services

en el src/main/resource se tienen las siguientes carpetas que contienen las vistas
- carpeta static, contiene las librerias de css y js para estilos de boostrap
- carpeta template, contiene las vistas que se estaran cargando.

Se creo una plantilla que se replica mandadola a llamar desde el html de una nueva pagina.

se tienen las siguientes pantallas:
- empleados, los metodos de listas y agregar nuevo empleado, en la vista de agregar nuevo usuario tiene ademas la funcionalidad de editar.

configuracion de bases de datos (archivo aplication.properties)
```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/empleados
spring.datasource.username=root
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.format_sql=true
```

rutas de vistas
```
views/empleados/
views/empleados/agregar
views/empleados/edit/{id}
views/empleados/eliminar/{id}
```



