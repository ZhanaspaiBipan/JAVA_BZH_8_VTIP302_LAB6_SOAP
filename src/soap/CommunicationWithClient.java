package soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// Указываем специальные аннотации, что класс будет работать в web-технологии SOAP
@WebService
@SOAPBinding(style = Style.RPC)

public class CommunicationWithClient implements ICommunicationWithClient {

  
    @Override
    public Answer example(double x, double a, double b) {
        double y = 0;

        if (x >= 6) {
                    y = 4 *( Math.pow(a,2) + 2*x + Math.pow(b, 2))/(a*b);
                } else {
                    y = Math.pow(x,3)* Math.pow(a-b,2);
                }

        Answer otvet = new Answer(y);
        return otvet;
    }

}
