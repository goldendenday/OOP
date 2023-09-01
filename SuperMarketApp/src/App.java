package OOP.SuperMarketApp.src;

import OOP.SuperMarketApp.src.Classes.Market;
import OOP.SuperMarketApp.src.Classes.OrdinaryClient;
import OOP.SuperMarketApp.src.Classes.SpecialClient;
import OOP.SuperMarketApp.src.Classes.TaxInspector;
import OOP.SuperMarketApp.src.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();
    }
}
