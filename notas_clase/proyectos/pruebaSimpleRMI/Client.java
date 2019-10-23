package example.hello;

    import java.rmi.registry.LocateRegistry;
    import java.rmi.registry.Registry;

    public class Client {

        private Client() {}

        public static void main(String[] args) {
            long i;
			long x,y,z;
			long errores = 0;
            String response;
            String host = (args.length < 1) ? null : args[0];
			long N = ( args.length < 2) ? 500 : Long.parseLong(args[1]);
            try 
            {
                Registry registry = LocateRegistry.getRegistry(host);
                Hola stub = (Hola) registry.lookup("Hola");
                for(i=0;i<N;i++)
                {
                  response = stub.sayHello();
				  x = (long) (10000.0 * Math.random());
				  y = (long) (10000.0 * Math.random());
				  z = stub.sumaRemota(x,y);
				  if( x + y != z ) errores++;
                  //System.out.println("response: " + response);
                }
				if( errores == 0 )
               	  System.out.println("Sin errores");
                else
                  System.out.println("OCURRIERON " + errores + " ERRORES"); 					
            } 
            catch (Exception e) 
            {
                System.err.println("Client exception: " + e.toString());
                e.printStackTrace();
            }
        }
    }

