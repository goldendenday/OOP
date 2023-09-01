package OOP.SuperMarketApp.src.Interfaces;

import java.util.List;

import OOP.SuperMarketApp.src.Classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
