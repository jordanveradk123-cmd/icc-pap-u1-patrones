


Use el singleton para la configuracion porque el impuesto debe ser uno solo para toda la empresa es decir si cada pedido crea su propia configuración se pierde el control es decir uno prodcuto puede quedar con 15% y otro con 12% . Con Singleton todos usan la misma instancia y el mismo porcentaje.


use factoryMethodo porque en el app no debe saber cómo se crea cada pedido solo dice creo uno presencial y otro virtual y el metodo factory me devuelve el objeto listo, luego puede que agrege un pedido por llamada solo creao una clase nueva no toco el app.

