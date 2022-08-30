# MeliChallenge
App Android que permite buscar un texto (sea producto, servicio, etc) en  las bases de datos de mercado libre, mediante el uso de las apis públicas de mercadolibre, devuelve una lista con los resultados de búsqueda y permite acceder al detalle del ítem de búsqueda. 

Url base de la ap utilizadai: https://api.mercadolibre.com

Consta de 3 pantallas: 				

1. Campo de búsqueda.
2. Visualización de resultados de la búsqueda. 
3. Detalle de un producto. 

Para esta api se utiliza arquitectura MVVM (Model View ViewModel). En esta arquitectura el modelo contiene los datos de la aplicación, y se exponen a viewmodels a través de observables. La vista representa la interfaz de usuario de la aplicación desprovista de lógica de aplicación y observa el view model. Este último es el responsable de transformar los datos del modelo y proporcionar flujos de datos a la vista.

Para acceder a la api de Mercado Pago se utiliza el Cliente HTTP Retrofit 2. Retrofit permite de manera segura, eficiente  y eficaz llamar a una api mediante métodos http como get, post, delete, etc. 

Para el uso de Retrofit 2 se importan las librerías de: 

*Retrofit 2: Librería encargada del consumo de las API.

*Retrofit 2 Converter Gson: complemento para simplificar el proceso de pasar un JSON a una Data Class

*Corrutinas: Entre muchas cosas permiten hacer las peticiones de Retrofit en segundo plano para no bloquear la interfaz del usuario 
 
Otra de las librerías importadas en el proyecto es Picasso: Esta permitirá transformar urls en imágenes y montarlas en las vistas.

Para la actualización de los datos de las vistas o interfaces de usuario, se utiliza Live Data. Live Data, respeta el ciclo de vida de las vistas de Android por lo que no invocará su devolución de llamada de observador hasta que se reciba onStart() y además eliminará automáticamente el observador cuando reciba onDestroy().

Para la instanciación de los Viewmodels, repositorio y api Service se utiliza Inyección de dependencias, mediante Koin, un framework de inyección de dependencias liviano y que tiene la ventaja de poder utilizarse en aplicaciones multiplataforma mediante Kotlin Multiplatform. 

Otro dato importante a mencionar sobre el proyecto es el agregado de un Interceptor de aplicación para el monitoreo de las llamadas a la api, solo a modo de prueba, ya que no hay gran cantidad de casos de uso en la app, pero los interceptores pueden ser muy útiles para registrar errores o agregar encabezados como tokens  de forma centralizada, actualizar tokens de acceso en un solo lugar, o incluso almacenar caché de la respuesta. 

Se usan las corrutinas, que son hilos livianos y se valen de hilos o pool de hilos para ejecutar código de manera concurrente y de forma muy eficiente optimizando el uso de recursos.

###### Aclaraciones

Para la serialización de los datos recibidos por la api, en el caso de la primer consulta, el search general, opte por generar data class serializables. Esta es la forma que estoy acostumbrada a usar ya que las apis con las que trabajo son de menor dimension y cuento con toda la documentaión y tipos de datos recibidos para cada elemento del JSON, en este caso, al ser tam amplia la api, me paso que obtengo algunos null de los cuales no puedo obtener información y puede pasar que de errores de serialización para busquedas particulares. Para la segunda consulta opté por usar un String y JSONObject para obtener el JSON e ir buscando solo las claves que use para mostrar en la vista, un procedimiento más general y rústico pero más práctico en este caso. 

