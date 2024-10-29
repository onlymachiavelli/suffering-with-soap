import com.info.service.PersonServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {


    public static void main(String[] args) {

        Endpoint.publish("http://localhost:3000/api/persons" , new PersonServiceImpl())  ;
        System.out.println("Server is listetning on PORT -> 3000");
    }
}