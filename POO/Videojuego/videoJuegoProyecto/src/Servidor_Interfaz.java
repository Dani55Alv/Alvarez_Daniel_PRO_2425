public interface Servidor_Interfaz {
   
   
    public void agregarPersona(Personaje p);
   
   public  void listar();
    
   public void ordenarPersonajes();

   public void batalla(Personaje p1, Personaje p2);

   //Todos los metodos es decir más...
} 

//En las intefaces solo defines los metodos sin implementar la cabecera. No tienen ni llaves, como
// puedes ver. "Es una cabecera". (Incluso puede haber atributos). 

//Es como un indice para las clases.