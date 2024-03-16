package Biblioteca;


/**
* Biblioteca/GestionBibliotecaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Biblioteca.idl
* s�bado 16 de marzo de 2024 00H53' CET
*/


// Define la interfaz para el sistema de gestión de la biblioteca
public interface GestionBibliotecaOperations 
{

  // Busca un libro por título y devuelve los detalles del libro
  Biblioteca.Libro buscarLibro (String titulo);
  void agregarLibro (String ISBN, String titulo, String autor, boolean disponible);
  void eliminarLibro (String ISBN);

  // Presta un libro, cambiando su estado a no disponible
  boolean prestarLibro (String ISBN);

  // Devuelve un libro, cambiando su estado a disponible
  boolean devolverLibro (String ISBN);
} // interface GestionBibliotecaOperations
