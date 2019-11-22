package pl.edu.pollub.virtualcasino.roulettegame.table;

import pl.edu.pollub.virtualcasino.roulettegame.client.Client;

public class Table {

    protected Table(Client client) {

    }

    protected boolean isParticipant(Client client) {
        return true;
    }
}
