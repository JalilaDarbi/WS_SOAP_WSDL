package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 13.54;
    }

    @WebMethod(operationName = "GetCompte")
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9888, new Date());
    }

    @WebMethod(operationName = "ListComptes")
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, Math.random()*9888, new Date()),
                new Compte(2, Math.random()*9888, new Date()),
                new Compte(3, Math.random()*9888, new Date())
        );
    }
}