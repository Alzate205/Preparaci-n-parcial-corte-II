package ejercicio2;

import ejercicio2.dto.ProductDTO;
import ejercicio2.interfaces.IProducto;
import ejercicio2.service.ProductoServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrincipalProducto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        IProducto repo = new ProductoServiceImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Main \n 1. Add  \n 2. List \n 3.update  \n 4. Delete  \n 5. Bye :) ");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id Product: ");
                    Integer id = s.nextInt();
                    System.out.println("Name of product: ");
                    String name = s.next();
                    System.out.println("Description: ");
                    String des = s.next();
                    System.out.println("Disponibility: ");
                    String di = s.next();
                    repo.save(new ProductDTO(id,name, des, di));
                    break;
                }
                case "2": {
                    List<ProductDTO> productos = repo.findAll();
                    if(!productos.isEmpty()){
                        productos.forEach(System.out::println);
                    }else{
                        System.out.println("there is no registry");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== update ====");
                    System.out.print("new id : ");
                    Integer idp = s.nextInt();
                    System.out.print("Enter name: ");
                    String nom = s.next();
                    System.out.print("Enter Description: ");
                    String cat = s.next();
                    System.out.print("Enter Disponibility: ");
                    String  ca = String.valueOf(s.next());
                    ProductDTO beaActualizar = new ProductDTO(idp, nom, cat, ca);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== Delete ======");
                    System.out.print("Enter id : ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
}
