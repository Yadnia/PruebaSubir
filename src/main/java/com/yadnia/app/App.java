package com.yadnia.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroseleccionado;
        List<Municipios> municipiosList = new ArrayList<>();
        municipiosList.add(new Municipios("Achuapa", 416));
        municipiosList.add(new Municipios("Acoyapa", 1382));
        municipiosList.add(new Municipios("Altagracia", 211));
        municipiosList.add(new Municipios("Belen", 246));
        municipiosList.add(new Municipios ("Bluefields",4775));
        municipiosList.add(new Municipios ("Boaco",1087));
        municipiosList.add(new Municipios ("Bonanza",2039));
        municipiosList.add(new Municipios ("Buenos Aires",75));
        municipiosList.add(new Municipios ("Camoapa",1483));
        municipiosList.add(new Municipios ("Cardenas",227));
        municipiosList.add(new Municipios ("Catarina",11));
        municipiosList.add(new Municipios ("Chichigalpa",223));
        municipiosList.add(new Municipios ("Chinandega",687));
        municipiosList.add(new Municipios ("Cinco Pinos",60));
        municipiosList.add(new Municipios ("Ciudad Antigua",154));
        municipiosList.add(new Municipios ("Ciudad Dario",432));
        municipiosList.add(new Municipios ("Ciudad Sandino",51));
        municipiosList.add(new Municipios ("Comalapa",644));
        municipiosList.add(new Municipios ("Condega",398));
        municipiosList.add(new Municipios ("Corinto",71));
        municipiosList.add(new Municipios ("Corn Island",13));
        municipiosList.add(new Municipios ("Desembocadura de Rio Grande",1978));
        municipiosList.add(new Municipios ("Dipilto",108));
        municipiosList.add(new Municipios ("Diria",26));
        municipiosList.add(new Municipios ("Diriamba",349));
        municipiosList.add(new Municipios ("Diriommo",50));
        municipiosList.add(new Municipios ("Dolores",3));
        municipiosList.add(new Municipios ("El Almendro",993));
        municipiosList.add(new Municipios ("El Ayote",831));
        municipiosList.add(new Municipios ("El Castillo",1656));
        municipiosList.add(new Municipios ("El Coral",306));
        municipiosList.add(new Municipios ("El crucero",226));
        municipiosList.add(new Municipios ("El Cua",637));
        municipiosList.add(new Municipios ("El Jicaral",434));
        municipiosList.add(new Municipios ("El Jicaro",278));
        municipiosList.add(new Municipios ("El Rama",5618));
        municipiosList.add(new Municipios ("El Realejo",105));
        municipiosList.add(new Municipios ("El Rosario",11));
        municipiosList.add(new Municipios ("El Sauce",630));
        municipiosList.add(new Municipios ("El Tortugero", 2471));
        municipiosList.add(new Municipios("El Tuma",462));
        municipiosList.add(new Municipios("El Viejo",1275));
        municipiosList.add(new Municipios("Esquipulas",216));
        municipiosList.add(new Municipios("Esteli",796));
        municipiosList.add(new Municipios("Granada",531));
        municipiosList.add(new Municipios("Jalapa",629));
        municipiosList.add(new Municipios("Jinotega",1119));
        municipiosList.add(new Municipios("Jinotepe",292));
        municipiosList.add(new Municipios("Juigalpa",727));
        municipiosList.add(new Municipios("Kukra Hill",1262));
        municipiosList.add(new Municipios("La concepcion",73));
        municipiosList.add(new Municipios("La Concordia",122));
        municipiosList.add(new Municipios("La Conquista",91));
        municipiosList.add(new Municipios("La Cruz de Rio Grande",3360));
        municipiosList.add(new Municipios("La Libertad",775));
        municipiosList.add(new Municipios("La Paz Centro",606));
        municipiosList.add(new Municipios("La Paz de Carazo", 16));
        municipiosList.add(new Municipios("La Trinidad",261));
        municipiosList.add(new Municipios("Laguna de Perlas",3876));
        municipiosList.add(new Municipios("Larreynaga",882));
        municipiosList.add(new Municipios("Las Sabanas",69));
        municipiosList.add(new Municipios("Leon",820));
        municipiosList.add(new Municipios("Macuelizo",250));
        municipiosList.add(new Municipios("Managua",289));
        municipiosList.add(new Municipios("Masatepe",62));
        municipiosList.add(new Municipios("Masaya",141));
        municipiosList.add(new Municipios("Matagalpa",619));
        municipiosList.add(new Municipios("Mateare",297));
        municipiosList.add(new Municipios("Matiguas",1710));
        municipiosList.add(new Municipios("Morrito",677));
        municipiosList.add(new Municipios("Moyogalpa",63));
        municipiosList.add(new Municipios("Mozonte",242));
        municipiosList.add(new Municipios("Muelle de los Bueyes",1391));
        municipiosList.add(new Municipios("Mulukuku",1905));
        municipiosList.add(new Municipios("Murra",479));
        municipiosList.add(new Municipios("Muy Muy",375));
        municipiosList.add(new Municipios("Nagarote",598));
        municipiosList.add(new Municipios("Nandaime",372));
        municipiosList.add(new Municipios("Nandasmo",13));
        municipiosList.add(new Municipios("Nindiri",143));
        municipiosList.add(new Municipios("Niquinohomo",32));
        municipiosList.add(new Municipios("Nueva Guinea",2774));
        municipiosList.add(new Municipios("Ocotal",86));
        municipiosList.add(new Municipios("Paiwas",2375));
        municipiosList.add(new Municipios("Palacaguina",192));
        municipiosList.add(new Municipios("Posotelga",124));
        municipiosList.add(new Municipios("Potosi",146));
        municipiosList.add(new Municipios("Prinzapolka",7020));
        municipiosList.add(new Municipios("Pueblo Nuevo",222));
        municipiosList.add(new Municipios("Puerto Cabezas", 5985));
        municipiosList.add(new Municipios("Puerto Morazan",517));
        municipiosList.add(new Municipios("Quezalguaque",86));
        municipiosList.add(new Municipios("Quilali",339));
        municipiosList.add(new Municipios("Rancho Grande",648));
        municipiosList.add(new Municipios("Rio Blanco",700));
        municipiosList.add(new Municipios("Rivas",281));
        municipiosList.add(new Municipios("Rosita",4418));
        municipiosList.add(new Municipios("San Carlos",1462));
        municipiosList.add(new Municipios("San Dioniso",152));
        municipiosList.add(new Municipios("San Fernando",269));
        municipiosList.add(new Municipios("San Francisco de Cuapa",277));
        municipiosList.add(new Municipios("San Francisco del Norte",120));
        municipiosList.add(new Municipios("San Francisco Libre",756));
        municipiosList.add(new Municipios("San Isidro",283));
        municipiosList.add(new Municipios("San Jorge",22));
        municipiosList.add(new Municipios("San Jose de Bocay",3990));
        municipiosList.add(new Municipios("San Jose de Cusmapa",130));
        municipiosList.add(new Municipios("San Jose de Los Remates",280));
        municipiosList.add(new Municipios("San Juan de Limay",531));
        municipiosList.add(new Municipios("San Juan de Oriente",14));
        municipiosList.add(new Municipios("San Juan del Norte", 1462));
        municipiosList.add(new Municipios("San Juan de Rio Coco",182));
        municipiosList.add(new Municipios("San Juan del Sur",411));
        municipiosList.add(new Municipios("San Lorenzo",560));
        municipiosList.add(new Municipios("San Lucas",139));
        municipiosList.add(new Municipios("San Marcos",118));
        municipiosList.add(new Municipios("San Miguelito",923));
        municipiosList.add(new Municipios("San Nicolas",163));
        municipiosList.add(new Municipios("San Pedro de Lovago",467));
        municipiosList.add(new Municipios("San Pedro del Norte",72));
        municipiosList.add(new Municipios("San Rafael del Norte",606));
        municipiosList.add(new Municipios("San Rafael del Sur", 357));
        municipiosList.add(new Municipios("San Ramon", 424));
        municipiosList.add(new Municipios("San Sebastian de Yali",311));
        municipiosList.add(new Municipios("Santa Lucia",121));
        municipiosList.add(new Municipios("Santa Maria",168));
        municipiosList.add(new Municipios("Santa Maria de Pantasma",563));
        municipiosList.add(new Municipios("Santa Rosa del Peñon",228));
        municipiosList.add(new Municipios("Santa Teresa",194));
        municipiosList.add(new Municipios("Santo Domingo",682));
        municipiosList.add(new Municipios("Santo Tomas",547));
        municipiosList.add(new Municipios("Santo Tomas del Norte",50));
        municipiosList.add(new Municipios("Sebaco",290));
        municipiosList.add(new Municipios("Siuna",5040));
        municipiosList.add(new Municipios("Somotillo",1089));
        municipiosList.add(new Municipios("Somoto",466));
        municipiosList.add(new Municipios("Telica",400));
        municipiosList.add(new Municipios("Telpaneca",300));
        municipiosList.add(new Municipios("Terrabona",249));
        municipiosList.add(new Municipios("Tesutepe",646));
        municipiosList.add(new Municipios("Ticuantepe",61));
        municipiosList.add(new Municipios("Tipitapa",975));
        municipiosList.add(new Municipios("Tisma",108));
        municipiosList.add(new Municipios("Tola",474));
        municipiosList.add(new Municipios("Totogalpa",137));
        municipiosList.add(new Municipios("Villa Carlos Fonseca",562));
        municipiosList.add(new Municipios("Villa Sandino",677));
        municipiosList.add(new Municipios("Villanueva",780));
        municipiosList.add(new Municipios("Waslala",1330));
        municipiosList.add(new Municipios("Waspan",9342));
        municipiosList.add(new Municipios("Wiwli de Jinotega",2445));
        municipiosList.add(new Municipios("Wiwili de Nueva Segovia",398));
        municipiosList.add(new Municipios("Yalaguina",53));

        do{ //primer ciclo
            int i = 1; //indice para seleccionaaaar
            System.out.println("Bienvenido al control de sucesos municipales de INETER. \nLa lista de municipios disponibles es:");
            for (Municipios municipios : municipiosList) {
                System.out.println(i + ":" + municipios.getNombre() + ". Extension: " + municipios.getExtension() + " Kilometros cuadrados");
                i++;
            }
            System.out.println("Ingrese el numero del Municipio que desea seleccionar o haga clic en '0' para salir:");
            numeroseleccionado=scan.nextInt(); //escoger un municipio
            if (numeroseleccionado == 0) {
                break;
            }
            //crear un objeto de la clase municipios para obtener el municipio al que corresponde el numero igualando la viarable nueva a obtener el municipio del indice
            Municipios municipioSeleccionado = municipiosList.get(numeroseleccionado - 1);
            //trabajar con municipio seleccionado ahora
            System.out.println("Municipio seleccionado:\n" + municipioSeleccionado.getNombre() + ".\nExtension: " + municipioSeleccionado.getExtension());

            int resp1;
            do{
                        //luego de seleccionar el municipio, menu de opciones
                System.out.println("Que accion desea realizar:\n1.Agregar un suceso\n2.Borrar un suceso\n3.Buscar lluvia de mayor duracion\n4.Buscar temblor de mayor duracion\n5.Mostrar todos los sucesos\n6.Volver a inicio");
                resp1=scan.nextInt();
                switch(resp1){
                    case 1: //AGREGAR ------------------------------------------------------
                        int resp2;
                        do{ //ciclo para agregar varias veces antes de volver
                            System.out.println(" Que desea hacer?\n1.Agregar Lluvia\n2.Agregar Temblor\n3.Regresar");
                            resp2 = scan.nextInt();
                            switch(resp2){
                                case 1:
                                    //meter datos para pasarlos por referencia
                                    System.out.println ("Funcion de agregar lluvia a "+municipioSeleccionado.getNombre());
                                    System.out.println("Ingrese la duracion de la Lluvia que desea registrar en horas: ");
                                    int duracion = scan.nextInt();
                                    System.out.println("Ingrese los milimetros por hora de la Lluvia que desea registrar: ");
                                    Double miPH = scan.nextDouble();
                                    scan.nextLine();
                                    String tipo;
                                    do {
                                        //tipo de datos
                                        System.out.println("Ingrese el tipo de la Lluvia que desea registrar: [Tormenta/Lluvia Normal/Brisa]");
                                        tipo = scan.nextLine();

                                        if (!(tipo.equalsIgnoreCase("Tormenta") || tipo.equalsIgnoreCase("Lluvia Normal") || tipo.equalsIgnoreCase("Brisa"))) {
                                            System.out.println("Tipo de lluvia no valido. Intente de nuevo");
                                        }
                                    } while (!(tipo.equalsIgnoreCase("Tormenta") || tipo.equalsIgnoreCase("Lluvia Normal") || tipo.equalsIgnoreCase("Brisa")));
                                    System.out.println("Ingrese la fecha de la Lluvia que desea registrar: ");
                                    String fecha = scan.nextLine();
                                    Lluvias lluvia = new Lluvias(fecha, duracion, miPH, tipo);
                                    municipioSeleccionado.agregarSucesos(lluvia);
                                    System.out.println("Suceso agregado.\n" );

                                    char resp3;
                                    do{
                                        System.out.println("Desea registrar otra lluvia?\na. Agregar otra LLuvia\nb.Regresar");
                                        resp3 = scan.next().charAt(0);
                                        switch(resp3){
                                            case 'a':
                                                System.out.println("Agregar lluvia x2");
                                                System.out.println ("Funcion de agregar lluvia a "+municipioSeleccionado.getNombre());
                                                System.out.println("Ingrese la duracion de la Lluvia que desea registrar en horas: ");
                                                duracion = scan.nextInt();
                                                System.out.println("Ingrese los milimetros por hora de la Lluvia que desea registrar: ");
                                                miPH = scan.nextDouble();
                                                scan.nextLine();
                                                do {
                                                    System.out.println("Ingrese el tipo de la Lluvia que desea registrar: [Tormenta/Lluvia Normal/Brisa]");
                                                    tipo = scan.nextLine();

                                                    if (!(tipo.equalsIgnoreCase("Tormenta") || tipo.equalsIgnoreCase("Lluvia Normal") || tipo.equalsIgnoreCase("Brisa"))) {
                                                        System.out.println("Tipo de lluvia no valido. Intente de nuevo");
                                                    }
                                                } while (!(tipo.equalsIgnoreCase("Tormenta") || tipo.equalsIgnoreCase("Lluvia Normal") || tipo.equalsIgnoreCase("Brisa")));
                                                System.out.println("Ingrese la fecha de la Lluvia que desea registrar: ");
                                                 fecha = scan.nextLine();
                                                Lluvias lluvia2= new Lluvias(fecha, duracion, miPH, tipo);
                                               municipioSeleccionado.agregarSucesos(lluvia2);
                                                System.out.println("Suceso agregado.\n" );
                                                ////////////////////

                                                break;
                                            case 'b':
                                                System.out.println("Regresando------------");
                                                break;
                                        }

                                    }while (resp3!='b');
                                    break;
                                case 2: //AGREGAR TEMBLOR-----------------------------------------------------------------------------------
                                    System.out.println ("AGREGAR TEMBLOR A "+municipioSeleccionado.getNombre());
                                    System.out.println("Ingrese la duracion del temblor que desea registrar en horas: ");
                                    duracion = scan.nextInt();
                                    System.out.println("Ingrese la escala de Richter alcanzada del temblor que desea registrar: ");
                                    Double escalaRi = scan.nextDouble();
                                    scan.nextLine();
                                    System.out.println("Ingrese la longitud del temblor que desea registrar");
                                    Double longitud = scan.nextDouble();
                                    System.out.println("Ingrese la latitud del temblor que desea registrar");
                                    Double latitud = scan.nextDouble();
                                    System.out.println("Ingrese la fecha del temblor que desea registrar: ");
                                     fecha = scan.nextLine();
                                    Temblores temblor = new Temblores(fecha, duracion, escalaRi, longitud, latitud);
                                    municipioSeleccionado.agregarSucesos(temblor);
                                    System.out.println("Suceso agregado.\n" );
                                    ////////////////////



                                            char resp4;
                                    do{
                                        System.out.println("Desea registrar otro temblor?\na. Agregar otro temblor\nb.Regresar");
                                        resp4 = scan.next().charAt(0);
                                        switch(resp4){
                                            case 'a':
                                                System.out.println("Agregar otro temblor x2");
                                                System.out.println("Ingrese la duracion del temblor que desea registrar: ");
                                                duracion = scan.nextInt();
                                                System.out.println("Ingrese la escala de Richter alcanzada del temblor que desea registrar: ");
                                                escalaRi = scan.nextDouble();
                                                scan.nextLine();
                                                System.out.println("Ingrese la longitud del temblor que desea registrar");
                                                 longitud = scan.nextDouble();
                                                System.out.println("Ingrese la latitud del temblor que desea registrar");
                                                 latitud = scan.nextDouble();
                                                System.out.println("Ingrese la fecha del temblor que desea registrar: ");
                                                fecha = scan.nextLine();
                                                Temblores temblor2 = new Temblores(fecha, duracion, escalaRi, longitud, latitud);
                                                municipioSeleccionado.agregarSucesos(temblor2);
                                                System.out.println("Suceso agregado.\n" );
                                                ////////////////////

                                                break;
                                            case 'b':
                                                System.out.println("Regresando-----------");
                                                break;
                                        }

                                    }while (resp4!='b');break;
                                case 3:
                                    System.out.println("Regresando a inicio-----------------");
                                    break;
                            }

                        }while (resp2!=3);
                        break;
                    case 2://BORRAR  -- - - -- -----------------------------------------
                        int resp5;
                        do{ //
                            System.out.println("Que desea hacer?\n1.Borrar Lluvia\n2.Borrar Temblor\n3.Regresar");
                            resp5 = scan.nextInt();
                            switch(resp5){
                                case 1:
                                    System.out.println (" funcion borrar lluvia");
                                    municipioSeleccionado.mostrarLluvias();
                                    int nTSe;
                                    System.out.println("Escriba el numero de la lluvia que desea borrar");
                                    nTSe = scan.nextInt();
                                    Sucesos sucesoABorrar = municipioSeleccionado.listaLluvias.get(nTSe-1);
                                    System.out.println("Detalles de la lluvia seleccionada:");
                                    municipioSeleccionado.eliminarLluvias(sucesoABorrar);
                                   // municipioSeleccionado.mostrarLluvias();

                                    char resp6;
                                    do{
                                        System.out.println("Desea borrar otra lluvia?\na.Borrar otra Lluvia\nb.Regresar");
                                        resp6 = scan.next().charAt(0);
                                        switch(resp6){
                                            case 'a':
                                                System.out.println("borrarx2");
                                                municipioSeleccionado.mostrarLluvias();
                                                System.out.println("Escriba el numero de la lluvia que desea borrar");
                                                nTSe = scan.nextInt();
                                                sucesoABorrar= municipioSeleccionado.listaLluvias.get(nTSe-1);
                                                System.out.println("Detalles de la lluvia seleccionada:");
                                                municipioSeleccionado.eliminarLluvias(sucesoABorrar);
                                                break;
                                            case 'b':
                                                System.out.println("Regresando---------");
                                                break;
                                        }

                                    }while (resp6!='b');
                                    break;
                                case 2:
                                    System.out.println ("borrar temblor");
                                    municipioSeleccionado.mostrarTemblores();
                                    System.out.println("Escriba el numero del temblor que desea borrar");
                                    nTSe = scan.nextInt();
                                    sucesoABorrar = municipioSeleccionado.listaTemblores.get(nTSe-1);
                                    municipioSeleccionado.eliminarTemblores(sucesoABorrar);

                                    char resp7;
                                    do{
                                        System.out.println("Desea borrar otro temblor?\na.Borrar otro temblor\nb.Regresar");
                                        resp7 = scan.next().charAt(0);
                                        switch(resp7){
                                            case 'a':
                                                System.out.println("BORRAR TEMBLOR");
                                                municipioSeleccionado.mostrarTemblores();
                                                System.out.println("Escriba el numero del temblor que desea borrar");
                                                nTSe = scan.nextInt();
                                                sucesoABorrar = municipioSeleccionado.listaTemblores.get(nTSe-1);
                                                municipioSeleccionado.eliminarTemblores(sucesoABorrar);
                                                break;
                                            case 'b':
                                                System.out.println("REGRESANDO--------------------------------------");
                                                break;
                                        }

                                    }while (resp7!='b');
                                    break;
                                case 3:
                                    System.out.println("REGRESANDO--------------------------------------");
                                    break;
                            }

                        }while (resp5!=3);

                        break;
                    case 3: //BUSCAR LLUVIA ------------------------------------------------
                        System.out.println("BUSCANDO LLUVIA");
                            municipioSeleccionado.lluviaMayor();
                        char resp8;
                        do{
                            System.out.println("Desea buscar otra vez?\na.Buscar otra vez\nb.Regresar");
                            resp8 = scan.next().charAt(0);
                            switch(resp8){
                                case 'a':
                                    System.out.println("BUSCANDO OTRA VEZ");
                                    municipioSeleccionado.lluviaMayor();
                                    break;
                                case 'b':
                                    System.out.println("REGRESANDO--------------------------------");
                                    break;
                            }

                        }while (resp8!='b');

                        break;
                    case 4: //BUSCAR TEMBLOR -------------------------------------
                        System.out.println("BUSCANDO TEMBLOR");
                        municipioSeleccionado.temblorMayor();
                        char resp9;
                        do{
                            System.out.println("Desea buscar otra vez?\na.Buscar otra vez\nb.Regresar");
                            resp9 = scan.next().charAt(0);
                            switch(resp9){
                                case 'a':
                                    System.out.println("BUSCANDO OTRA VEZ");
                                    municipioSeleccionado.temblorMayor();
                                    break;
                                case 'b':
                                    System.out.println("REGRESANDO------------------------------");
                                    break;
                            }

                        }while (resp9!='b');
                        break;
                    case 5: //MOSTRAR SUCESOS ---------------------------------------------

                        int resp10;
                        do{
                            System.out.println("SUCESOS DE "+municipioSeleccionado.getNombre());
                            municipioSeleccionado.mostrarLluvias();
                            municipioSeleccionado.mostrarTemblores();
                            System.out.println("Presione 1 para regresar");
                            resp10 = scan.nextInt();


                        } while(resp10 !=1);
                        break;
                    case 6: //VOLVER A INICIO -----------------------------------------------
                        break;
                }

            }while (resp1!=6);

        } while (true);
    }


}