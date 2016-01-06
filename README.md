# trhow trhowns
Ejemplo aplicando throw &amp; throwns 
##Ejemplo
Estos elementos nos sirven para poder detectar errores por capas, para poder hacer uso de ellos debemos crear nuestro **try** **catch** dentro de nuestro metodo utilizando el throws:
```java
private void metodo3() throws Exception{
    try{
        int div = 7/0;
    }catch (Exception e){
        throw e;
    }
}
```
Dentro del catch utilizamos la palabra reservada **throw** lo cual recibe un objeto Exception como parametro, esto con el fin de que
el error sea manejado en la capa superior que mande a llamar al metodo.

Debemos utilizar la palabra reservada **throws** con el fin de indicarle al metodo que la capa superior manejara su error del catch.

Nuestra clase Main quedara de la siguiente manera:
```java
public class Main {

    private void metodo1(){
        try {
            metodo2();
        }catch (Exception e){
            System.out.println("Error de metodo1: "+e.getMessage());
        }
    }

    private void metodo2() throws Exception{
        try {
            metodo3();
        }catch (Exception e){
            throw e;
        }
    }

    private void metodo3() throws Exception{
        try{
            int div = 7/0;
        }catch (Exception e){
            throw e;
        }
    }

    public static void main(String[] args) {
	    Main mn = new Main();
        mn.metodo1();
    }
}
```
Al compilar nuestro programa quedara de la siguiente manera:
```
Error de metodo1: / by zero
```

